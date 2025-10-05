import java.util.*;
public class Song implements ISong{
    static int songCount=0;
    static int playingSongId=-1;
    static ArrayList<Integer> songHistory=new ArrayList<>();

    private final String name;
    private final String artist;
    private final double duration;
    private final int songId;
    Song(String name,String artist,double duration){
        songCount++;
        this.songId=songCount;
        this.name=name;
        this.artist=artist;
        this.duration=duration;
    }
    @Override
    public void playSong() {
        playingSongId=songId;
        songHistory.add(playingSongId);
        System.out.println("Song with ID \""+songId+"\" is being played!");
    }

    static void pauseSong(){
        playingSongId=-1;
        System.out.println("Song playing is paused!");
    }

    public int getSongId(){
        return songId;
    }
    public String getName(){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public double getDuration(){
        return duration;
    }
}
