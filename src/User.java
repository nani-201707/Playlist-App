import java.util.*;
public class User implements IUser{
    static int userCount=0;

    private String name;
    private final ArrayList<Album> albumList;
    private final int userId;

    User(String name){
        userCount++;
        userId=userCount;
        this.name=name;
        albumList=new ArrayList<>();
    }
    @Override
    public void addAlbum(Album album) {
        albumList.add(album);
    }

    @Override
    public void deleteAlbum(int albumId) {
        for(Album a:albumList){
            if(a.getAlbumId()==albumId){
                albumList.remove(a);
                System.out.println("Successfully deleted!");
                return;
            }
        }
        System.out.println("No such album found!");
    }

    @Override
    public Album getAlbum(int albumId) {
        for(Album a:albumList){
            if(a.getAlbumId()==albumId){
                return a;
            }
        }
        System.out.println("No such album found!");
        return null;
    }

    @Override
    public void changeName(String newName) {
        this.name=newName;
    }

    public String getName(){
        return name;
    }
    public int getUserId(){
        return userId;
    }
}
