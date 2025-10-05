//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User userOne=new User("UserOne");
        Song songOne=new Song("Closer","ChainSmoker",4.50);
        Album albumOne=new Album("Fav","10-04-2025");

        albumOne.addSong(songOne);
        userOne.addAlbum(albumOne);
        userOne.getAlbum(1).getSong(1).playSong();
        System.out.println("Currently PlayingSongID: "+Song.playingSongId);

        Song songTwo=new Song("StarBoy","The Weekend",5.00);
        userOne.getAlbum(1).addSong(songTwo);
        songTwo.playSong();

        // Playing previous
        userOne.getAlbum(1).playPrevious();
        System.out.println("Currently playingSong: "+Song.playingSongId+" ~ "+songTwo.getName());
        Song.pauseSong();

        // Playing all songs in the album
        userOne.getAlbum(1).playAll();
    }
}