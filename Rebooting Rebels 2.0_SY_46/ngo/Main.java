package ngo;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hashtable has = new Hashtable();
		Registration reg = new Registration();
		Donation don = new Donation();
		int ch;
		
		has.display();
		
		System.out.println("How would you like to search for NGOs?");
		System.out.println("1.Search for NGOs by distance");
		System.out.println("2.Search for NGOs by cause");
		System.out.println("Enter your choice [1/2] : ");
		ch = sc.nextInt();
		if(ch==1) {
			has.distance();
		}
		
		if(ch==2) {
			don.donate();
		}
	}
}