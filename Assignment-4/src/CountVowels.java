import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class CountVowels{   
    public static void main(String[] args) throws FileNotFoundException {       
        int vCount = 0;    
        File file = new File("Sample.txt"); 
	    Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z"); 
		while(sc.hasNextLine()){
			String str=sc.nextLine();    
	        str = str.toLowerCase();      
	        for(int i = 0; i < str.length(); i++) {     
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	               vCount++;    
	            }   
	        }    
		}
	    System.out.println("Number of vowels: " + vCount);      
	 }       
}
