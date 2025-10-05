public interface IUser {
    void addAlbum(Album album);
    void deleteAlbum(int albumId);
    Album getAlbum(int albumId);
    void changeName(String newName);
}
