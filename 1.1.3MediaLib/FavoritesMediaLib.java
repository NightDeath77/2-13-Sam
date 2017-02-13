
/**
 * Write a description of class FavoritesMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main(){
        String songInfo = MediaFile.readString();
        
        // While loop solution
        int index = songInfo.indexOf("|");
        while (index > 0) {
            String token = songInfo.substring(0, index);
            System.out.println(token);
            
            songInfo = songInfo.substring(index + 1);
            index = songInfo.indexOf(" | ");
    } 
  }
}