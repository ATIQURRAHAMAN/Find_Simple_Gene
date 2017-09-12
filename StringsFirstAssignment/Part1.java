
/**
 * Write a description of class Part1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Part1{

    public String findSimpleGene(String dna){
        
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf("TAA",startIndex+3);
        if(stopIndex == -1){
        
            return "";
        }
        result =dna.substrings(startIndex,stopIndex+3);
        
        
        return result;
        
       
    }



}
