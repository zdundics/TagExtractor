import java.util.Scanner;

public class TagExtracor {
	public static void main(String [] args){
		String prompt = "Enter Current Status";
		System.out.println(prompt);
		Scanner input = new Scanner(System.in);
		String Status = input.nextLine();		
		
		int pos = Status.indexOf('#');
		int pos2 = Status.indexOf(" ", pos);
		String subhashtag = Status.substring(pos+1, pos2);
		System.out.println(subhashtag);
		
		int pos3 = Status.indexOf('@');
		int pos4 = Status.indexOf(" ", pos3);
		String subusertag = Status.substring(pos3+1, pos4);
		System.out.println(subusertag);
		
		int pos5 = Status.indexOf("http://");
		int pos6 = Status.indexOf(" ", pos5);
		String subURL = Status.substring(pos5, pos6);
		System.out.println(subURL);
		
		
		
	}
}
