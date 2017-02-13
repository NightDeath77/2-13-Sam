
/**
 * Write a description of class LoopingMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {
    /*   for (int i = 0; i<10; i++) {
           System.out.println(MediaFile.readString());
    }
    MediaFile.saveAndClose();
    System.out.println();
    
    String songInfo = MediaFile.readString();
    while (songInfo != null){
        System.out.println(songInfo);
        songInfo = MediaFile.readString();
    }
    */
    String songInfo = MediaFile.readString();
    while (songInfo != null){
        String title = songInfo.substring(0, songInfo.indexOf("|"));
        System.out.println("Title: " + title);
        String rateStr = songInfo.substring((songInfo.indexOf("|")+1));
        System.out.println("Rating: " + rateStr);
        System.out.println();
        
        songInfo = MediaFile.readString(); 
    }
    
  }
}