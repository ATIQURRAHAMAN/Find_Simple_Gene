
/**
 * Write a description of class Part2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Part2
{
    public String findSimpleGene(String dna){
        
    
        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TAA",startCodon+3);
        while(stopCodon != -1 ){
            if((stopCodon - startCodon)%3 == 0){
                
                 return dna.substring(startCodon,stopCodon+3);
            
            }
            
            else{
                
                stopCodon = dna.indexOf("TAA",startCodon+1);
            }
            
        }
        
        return "";
               
    }
    
    public void testSimpleGene(){
        String dna = "AATGCGTAATAGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is :"+gene);
        
        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is :"+gene);
        
        dna = "ATCCTATAGCTTCGGCTGCTAATAGGT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is :"+gene);
    }
}
