import edu.duke.*;
import org.apache.commons.csv.*;

public class FirstCSVParser
{  
   void testFood(){
       FileResource fr = new FileResource();
       CSVParser _parser = fr.getCSVParser();
       for(CSVRecord currentRow : _parser){
           System.out.println("Country: "+ currentRow.get("Country") + "Element : "+ currentRow.get("Exports"));
       } 
   }
}
