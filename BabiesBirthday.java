import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class BabiesBirthday {
	public static void main(String[] args){
		BabiesBirthday bb = new BabiesBirthday();
	//	FileResource  f = new FileResource();
	//	bb.totalBirth(f);
	    int a = bb.getRank(2012,"x","x");
	}
	public void totalBirth(FileResource fr) {
		int numberOfGirl = 0, numberOfBoyes = 0;
		for(CSVRecord rec : fr.getCSVParser(false)){
			if(rec.get(1).matches("M")) {
				numberOfBoyes += Integer.parseInt(rec.get(2));
			}
			else { 
				numberOfGirl += Integer.parseInt(rec.get(2));
			}
		}
	    System.out.println("Number of Boys : " + numberOfBoyes + "\nNumber of Girls : " + numberOfGirl);
	    System.out.println("Total Number : " + (numberOfGirl + numberOfBoyes));
	}
	public int getRank(int year, String name, String gender) {
		int finalRank = 1; 
	    String fName = "yob"+toString()+"short.csv";
	    FileResource  f = new FileResource(fName);
	    
	    return finalRank;
	}
	
}