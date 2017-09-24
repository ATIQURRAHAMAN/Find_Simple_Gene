import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountryExportX
{   void exportList(CSVParser parser, String nameOfInterest){
        for(CSVRecord currentRow: parser){
            String currentStr = currentRow.get("Exports");
            if(currentStr.contains(nameOfInterest)){
                String country = currentRow.get("Country");
                System.out.println(country);
            }
        }
    }
    void testOfInterest(){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        exportList(parser,"coffee");
    }
}
