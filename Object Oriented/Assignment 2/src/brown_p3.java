import java.util.Scanner;
public class brown_p3 {

	public static void main(String[] args) {
		
		String[] topics = {"VideoGames", "Sports", "Music", "Education", "Politics"};
		System.out.println("On a scale from 1-10 (10 being the most important) rate how important "
				+ "the following topics are to you.");
		Scanner scanner = new Scanner(System.in);
		int i;
		int []response = new int [5];
		for (i=0; i<5; i++) {
		System.out.println(topics[i]);
		response[i] = scanner.nextInt();
		if (i>10) {
			System.out.println("Please select a number 1-10.");
		}
		}
		int[][] responses = new int[6][6];
		System.out.println("Response test");
		System.out.print(responses[1][2]);
		
		scanner.close();
		}
			
			
		// TODO Auto-generated method stub

	}



