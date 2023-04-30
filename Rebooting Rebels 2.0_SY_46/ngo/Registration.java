package ngo;
import java.util.LinkedList;
import java.util.Scanner;

public class Registration {
    LinkedList<USER> userList = new LinkedList<USER>();
    
    void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("NGO Management System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
	}

    void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Registration");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter Email ID: ");
        String emailId = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        USER user = new USER(name, phoneNumber, emailId, password);
        userList.add(user);

        System.out.println("\tRegistration Successful!");
    }

    void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login");
        System.out.print("Enter Email ID: ");
        String emailId = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean LogIn = false;
        for (USER user : userList) {
            if (user.emailId.equals(emailId) && user.password.equals(password)) {
                LogIn = true;
                System.out.println("Login successful! Welcome, " + user.name + "!");
                break;
            }
        }

        if (!LogIn) {
            System.out.println("Login Failed. Invalid Email ID or Pincode.");
        }
    }
}

