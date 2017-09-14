import edu.duke.*;
public class Part4
{
    public void checkYoytube(){
        URLResource res = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html"); 
        for(String word : res.words()){
            int x = word.indexOf("youtube.com");
            int l = word.length();
            if(x != -1){
                int startIndex = word.indexOf("\"");
                int endIndex = word.lastIndexOf("\"", l);
            }
        }
    }
}