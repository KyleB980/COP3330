import java.util.Scanner;

public class brown_p1 {

	public static void main(String[] args) {
		/*
		 * A company that wants to send data over the Internet has asked you to write a program 
		 * that will encrypt it so that it may be transmitted more securely. All the data is 
		 * transmitted as four-digit integers. Your application should read a four-digit integer 
		 * entered by the user and encrypt it as follows: Replace each digit with the result of 
		 * adding 7 to the digit and getting the remainder after dividing the new value by 10. 
		 * Then swap the first digit with the third, and swap the second digit with the fourth. 
		 * Then print the encrypted integer. Write a separate application that inputs an 
		 * encrypted four-digit integer and decrypts it (by reversing the encryption scheme) 
		 * to form the original number.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.printf("What are you trying to do with your data?\n1.) Encrypt\n2.) Decrypt\n");
		int choice = scanner.nextInt();
		
		switch (choice) {
		
		case 1:
		System.out.println("Please enter your four digit data piece one by one so we can encrypt it.");

		int x = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int x4 = scanner.nextInt();
		
		System.out.println("Here is your encrypted code:");
		System.out.print((x3+7)%10);
		System.out.print((x4+7)%10);
		System.out.print((x+7)%10);
		System.out.print((x2+7)%10);
		
		break;
		
		case 2:
		System.out.println("Please enter your four digit data piece one by one so we can decrypt it.");
			
		int y3 = scanner.nextInt();
		int y4 = scanner.nextInt();
		int y = scanner.nextInt();
		int y2 = scanner.nextInt();
			
		int a = y+10-7;
		int a2 = y2+10-7;
		int a3 = y3+10-7;
		int a4 = y4+10-7;
			
		System.out.println("Here is your decrypted code:");
		System.out.print(a%10);
		System.out.print(a2%10);
		System.out.print(a3%10);
		System.out.print(a4%10);
			
			break;
			
		}
			
	}

}
