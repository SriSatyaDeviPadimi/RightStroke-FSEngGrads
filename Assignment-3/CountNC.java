import java.util.Scanner;
class CountNC{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int countN=0,countC=0,countS=0;
		System.out.print("Enter the sentence you want : ");
		try{
			String s = sc.nextLine();
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				countN++;
			}
			else if(s.charAt(i)!=' '){
				countC++;
			}
			else if(s.charAt(i)==' '){
				countS++;
			}
			else{
			}
		}
		System.out.println("Total number of character in the given sentence is : "+countC);
		System.out.println("Total number of number in the given sentence is : "+countN);
		System.out.println("Total number of spaces and special symbols in the given sentence is : "+countS);
		}
		catch(Exception e){
			System.out.println("You entered invalid symbols in a sentence");
		}
		finally{
			System.out.print("Assignment 3 completed ! ");
		}
	}
}