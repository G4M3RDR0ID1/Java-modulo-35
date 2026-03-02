package Factory;

public class VideoGameFactory {

    public static VideoGame getVideoGame(VideogameType type){
        if (type.equals(VideogameType.PS2)){
            return new PS2();
        } else if(type.equals(VideogameType.PS3)){
            return new PS3();
        }

        return new PS4();
    }

}
