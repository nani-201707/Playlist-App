import java.util.*;
public class Album implements IAlbum{
    static int albumCount=0;
    Random random=new Random();

    private final int albumId;
    private final ArrayList<Song> songList;
    private final String name;
    private final String createdDate;

    Album(String name,String createdDate){
        albumCount++;
        this.albumId=albumCount;
        this.name=name;
        this.createdDate=createdDate;
        this.songList=new ArrayList<>();
    }

    @Override
    public void addSong(Song song) {
        songList.add(song);
    }

    @Override
    public void removeSong(int songId) {
        for(Song s:songList){
            if(s.getSongId()==songId){
                songList.remove(s);
                System.out.println("Successfully deleted!");
                return;
            }
        }
        System.out.println("No such Song found!");
    }

    @Override
    public Song getSong(int songId) {
        for(Song s:songList){
            if(s.getSongId()==songId){
                return s;
            }
        }
        System.out.println("No such Song found!");
        return null;
    }

    @Override
    public void playAll() {
        for(Song s:songList){
            s.playSong();
        }
    }

    @Override
    public void playNext() {
        for(int i=0;i<songList.size();i++){
            if(songList.get(i).getSongId()==Song.playingSongId){
                if(i==songList.size()-1){
                    System.out.println("No next song!");
                    return;
                }
                songList.get(i+1).playSong();
            }
        }
        System.out.println("Currently playing song is not in this album");
    }

    @Override
    public void playPrevious() {
        for(int i=0;i<songList.size();i++){
            if(songList.get(i).getSongId()==Song.playingSongId){
                if(i==0){
                    System.out.println("No previous song!");
                    return;
                }
                songList.get(i-1).playSong();
            }
        }
        System.out.println("Currently playing song is not in this album");
    }

    @Override
    public void playRandom() {
        int randomNum=random.nextInt(songList.size()-1);
        songList.get(randomNum).playSong();
    }

    public String getName(){
        return name;
    }

    public String getCreatedDate(){
        return createdDate;
    }

    public int getAlbumId(){
        return albumId;
    }
}
