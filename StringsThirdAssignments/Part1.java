import edu.duke.*;
public class Part1
{
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        while(stopIndex != -1){
            if((stopIndex - startIndex) % 3 == 0){
                return stopIndex;
            }
            else{
                stopIndex = dna.indexOf(stopCodon, stopIndex + 1);
            }
        }
        return -1;
    }
    public String findGene(String dna, int Index){
        int startIndex = dna.indexOf("ATG", Index);
        if(startIndex == -1){
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int minIndex = 0;
        if (taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        }
        else {
            minIndex = taaIndex;
        }
        if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1){
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }
    public void printAllGenes(String dna) {
      int startIndex = 0;
      while ( true ) {
          String currentGene = findGene(dna, startIndex);
          if (currentGene.isEmpty()) {
              break;
          }
          System.out.println(currentGene);
          startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
        }
    }
    public StorageResource getAllGenes(String dna){
        StorageResource res = new StorageResource();
        int startIndex = 0;
        String currentGene = "";
        while ( true ) {
            currentGene = findGene(dna, startIndex);
            if (currentGene.isEmpty()) {
                break;
            }
            res.add(currentGene);
            startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
        }
        return res;
    }
    public void testOn(String dna) {
        System.out.println("Testing printAllGenes on " + dna);
        StorageResource res = new StorageResource(getAllGenes(dna));
        for(String s : res.data()){
            System.out.println(s);
        }
        //printAllGenes(dna);
        
    }
    public void test() {
        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        testOn("");
        testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
    }
}