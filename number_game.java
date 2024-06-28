package codsoft_tasks;
import java.util.Scanner;
import java.util.Random;
public class number_game {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		func();
		
		int i=1;
		while(i==1) {
			System.out.print("do you want to play again?(Yes/No)=");
			String ans=input.nextLine();
			
			if(ans=="yes") {
				func();
			}
			else {
				System.out.println("thankyou for playing");
				break;
			}
			
		}

	}
	static void func(){
		Scanner inp=new Scanner(System.in);
		Random random=new Random(); 
		int random_number=random.nextInt(100);
		System.out.print("Enter the number=");
		int Entered_number=inp.nextInt();
		for(int chance=1;chance<11;++chance) {
			if(random_number==Entered_number) {
				System.out.println("Congratulation!!! you guessed correct number");
				break;
			}
			else {
				if(random_number>Entered_number) {
					System.out.print("its too low, try again=");
				}
				else {
					System.out.print("its too high, try again=");
				}
				 Entered_number=inp.nextInt();		 
		    	}		}
		
	}
}
	
