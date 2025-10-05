public interface IAlbum {
    void addSong(Song song);
    void removeSong(int songId);
    Song getSong(int songId);
    void playAll();
    void playNext();
    void playPrevious();
    void playRandom();
}
