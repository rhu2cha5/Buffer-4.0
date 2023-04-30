package ngo;
import java.util.Scanner;

public class Donation {
	void donate() {
        Scanner sc=new Scanner(System.in);
        int c,ch,ch_1,c_1,food_quantity,clothing,books,money,bags;
        String stationary,tools;
        ch_1 = 0;
        c_1 = 0;
        
        String appliances,grocery,daily_needs;
        
        do {
            System.out.println("_DONATION");
            System.out.println("1.EDUCATION");
            System.out.println("2.DIFFERENTLY ABLED");
            System.out.println("3.ENVIRONMENT");
            System.out.println("4.ART AND CULTURE");
            System.out.println("5.CIVIC ISSUES");
            System.out.println("6.AGRICULTURE");
            System.out.println("7.CHILDREN");
            System.out.println("8.HEALTH AND FAMILY");
            System.out.println("9.ANIMAL HUSBANDRY");
            System.out.println("10.LEGAL AWARENESS AND AID");
            System.out.println("11.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            ch=sc.nextInt();
            
            switch(ch) {
            case 1://EDUCATION
                do {   
                System.out.println("1.Study Material");
                System.out.println("2.Money");
                System.out.println("Kindly select appropriate option:");
                c=sc.nextInt();
                    
                    switch(c) {
                    case 1://Study Material
                        do{
                            System.out.println("menu_");
                            System.out.println("1.BOOKS");
                            System.out.println("2.STATIONARY");
                            System.out.println("3.BAGS");
                            System.out.println("4.BACK TO MAIN MENU");
                            System.out.println("enter your choice:");
                            ch_1=sc.nextInt();
                            switch(ch_1) {
                            case 1: //books
                                System.out.println("Kindly enter number of books you would like to donate?");
                                books=sc.nextInt();
                                break;
                                            
                            case 2: //stationary
                                System.out.println("kindly enter the name and quantity of stationary you would like to donate: :");
                                sc.nextLine();
                                stationary=sc.nextLine();
                                break;
                                            
                            case 3://bags
                                System.out.println("kindly enter the number of bags you would like to donate: :");
                                bags=sc.nextInt();
                                break;
                                            
                            
                    
                            case 4:// EXIT
                                System.out.println("Back to main menu");
                                break;
                                    
                            }break;
                        } while(ch_1!=4);
                        break;
                        
                    case 2: //MONEY
                            System.out.println("Kindly enter the amount you would like to donate:");  
                            float edu_donation=sc.nextFloat();
                            System.out.println("Amount you entered:"+edu_donation);
                            break;
                    }break;   
                } while(c!=3);
                System.out.println("NGO Name: Adventures Beyond Barriers Foundation");
                System.out.println("Cause: Education");
                System.out.println("Ph. no.: 9309755823");
                System.out.println("E-mail: nalanda@adventuresbeyondbarriers.com");
                System.out.println("Address: Shindenagar, Bavdhan - 411021");
                
                System.out.println("NGO Name: Banshankari Shikshan Sanstha");
                System.out.println("Cause: Education");
                System.out.println("Ph. no.: 9822267081");
                System.out.println("E-mail: proteckcomputers@yahoo.com");
                System.out.println("Address: Banshankari, Grampanchayat office, Keshavnagar - 411036");
                
                break; 
                
            case 2://DIFFERENTLY ABLED
                do {   
                    System.out.println("1.Basic Needs");
                    System.out.println("2.Money");
                    System.out.println("3:Back to Main Menu");
                    System.out.println("Kindly select appropriate option:");
                    c=sc.nextInt();
                    switch(c) {
                    case 1://Basic needs
                        System.out.println("------BASIC NEEDS----");
                        System.out.println("Kindly select the appropriate option under basic needs:");
                        do {
                            System.out.println("1.Food");
                            System.out.println("2.Clothing");
                            System.out.println("3.Daily Needs");
                            System.out.println("4.Grocery");
                            System.out.println("5.Exit");
                            System.out.println("ENTER YOUR CHOICE:");
                            c_1=sc.nextInt();
                                
                            switch(c_1) {
                            case 1: //food
                                System.out.println("Kindly enter what would you like to donate?");
                                sc.nextLine();
                                String food = sc.nextLine();
                                System.out.println("You have entered: "+c);
                                System.out.println("kindly enter quantity:");
                                food_quantity=sc.nextInt();
                                break;
                                                
                            case 2: //clothing 
                                System.out.println("Enter quantity of clothes:");
                                clothing=sc.nextInt();
                                break;
                                                
                            case 3://daily needs 
                                System.out.println("enter what would you like to donate");
                                sc.nextLine();
                                daily_needs = sc.nextLine();
                                break;
                                                
                            case 4://grocery
                                System.out.println("enter what would you like to donate and it's quantity:");
                                sc.nextLine();
                                grocery = sc.nextLine();
                                break;
                                
                            case 5:// EXIT
                                System.out.println("EXITING");
                                break;
                                    
                            }
                            break;
                                
                        } while(c_1!=5);
                        break;    
                            
                        
                    case 2: //MONEY
                        System.out.println("Kindly enter the amount you would like to donate:");  
                        float diff_donation=sc.nextFloat();
                        System.out.println("Amount you entered:"+diff_donation);
                        break;
                        
                
                    case 3:// EXIT
                        System.out.println("Back to the Main Menu");
                        break;
                        
                    }
                }while(c!=3);
                System.out.println("NGO Name: Umed Pariwar");
                System.out.println("Cause: Differently abled");
                System.out.println("Ph. no.: 9822030093");
                System.out.println("E-mail: info@umedpariwar.org");
                System.out.println("Address: Mangalwar peth - 411011");
                break;
                
            case 3://ENVIRONMENT
                do {   
                    System.out.println("1.Sapling Donation");
                    System.out.println("2.Money");
                    System.out.println("3.Back to Main Menu");
                    System.out.println("Kindly select appropriate option:");
                    c=sc.nextInt();
                        
                    switch(c) {
                    case 1:
                        System.out.println("Enter number of saplings you would like to donate:");
                        int saplings=sc.nextInt();
                        System.out.println("Saplings to be donated:"+saplings);
                        break;
                             
                             
                    case 2:  
                        System.out.println("Kindly enter the amount you would like to donate:");  
                         float diff_donation=sc.nextFloat();
                        System.out.println("Amount you entered:"+diff_donation);
                        break;
                            
                    
                    case 3:
                        System.out.println("Back to the Main Menu");
                        break;
                            
                    }
                    break;
                }while(c!=3);
                System.out.println("NGO Name: Apt Research Foundation");
                System.out.println("Cause: Environment and Forest");
                System.out.println("Ph. no.: 9607362020");
                System.out.println("E-mail: enquiries@aptresearch.co.in");
                System.out.println("Address: Vadgaon Khurd, Sinhagad road - 411041");
                break;
                
            case 4://ART AND CULTURE
                System.out.println("Kindly enter the amount you would like to donate:");  
                float art_donation=sc.nextFloat();
                System.out.println("Amount you entered:"+art_donation);
                System.out.println("NGO Name: Aasakta Kalamanch Pune");
                System.out.println("Cause: Art and Culture");
                System.out.println("Ph. no.: 097694 02412");
                System.out.println("E-mail: aasaktakalamanch@gmail.com");
                System.out.println("Address: Snighda society, Laxminagar, Parvati - 411009");
                break;
                
                
            case 5://CIVIC ISSUES
                System.out.println("Kindly enter the amount you would like to donate:");  
                float civic_donation=sc.nextFloat();
                System.out.println("Amount you entered:"+civic_donation);
                System.out.println("NGO Name: Aastha Bahuuddeshiya Sevabhavi Sanstha");
                System.out.println("Cause: Civic Issues");
                System.out.println("Ph. no.: 8975663388");
                System.out.println("E-mail: aasthatrust2013@gmail.com");
                System.out.println("Address: Aundh road, Ambedkar chowk - 411007");
                
                System.out.println("NGO Name: Bharatiya Mahila Vikas Sanstha");
                System.out.println("Cause: Civic Issues");
                System.out.println("Ph. no.: 9960999599");
                System.out.println("E-mail: bmvsindia@gmail.com");
                System.out.println("Address: Sambhaji Nagar, Chinchwad, Pune - 411019");
                break;
                    
            case 6://AGRICULTURE
                do{   
                    System.out.println("1.Agricultural Tools");
                    System.out.println("2.Raw Materials");
                    System.out.println("3.Money");
                    System.out.println("4.Back to Main Menu");
                    System.out.println("Kindly select appropriate option:");
                    c=sc.nextInt();
                            
                    switch(c) {
                    case 1:
                        System.out.println("Enterthetool/machine you would like to donate:");
                        sc.nextLine();
                        tools=sc.nextLine();
                        System.out.println("Tools to be donated:"+tools);
                        break;
                                 
                    case 2:  
                        System.out.println("Kindly enter the raw materials you would like to donate:");  
                        sc.nextLine();
                        String raw_material=sc.nextLine();
                        System.out.println("Raw Materials entered:"+raw_material);
                        break;
                    
                     case 3:
                        System.out.println("Kindly enter the amount you would like to donate:");  
                        float diff_donation=sc.nextFloat();
                        System.out.println("Amount you entered:"+diff_donation);
                        break;        
                    
                    case 4:
                        System.out.println("Back to the Main Menu");
                        break;
                    }
                    break;
                } while(c!=4);
                System.out.println("NGO Name: Akhil Maharashtra Education Society");
                System.out.println("Cause: Agriculture");
                System.out.println("Ph. no.: 9423002267");
                System.out.println("E-mail: contact@gmesociety.org");
                System.out.println("Address: Guru Ganesh Nagar, Kothrud - 411038");
                break;
                
            case 7://children 
                do {
                    System.out.println("DONATION");
                    System.out.println("KINDLY SELECT THE APPROPRIATE CHOICE FOR DONATION:");
                    System.out.println("1.BASIC NEEDS\n2.APPLIANCES\n3.STUDY MATERIAL\n4.MONEY\n5.BACK TO MAIN MENU");
                    System.out.println("ENTER YOUR CHOICE:");
                    ch=sc.nextInt();
            
                    switch(ch) {
                    case 1: //BASIC NEEDS
                        System.out.println("------BASIC NEEDS----");
                        System.out.println("Kindly select the appropriate option under basic needs:");
                        do{
                            System.out.println("1.Food");
                            System.out.println("2.Clothing");
                            System.out.println("3.Daily Needs");
                            System.out.println("4.Grocery");
                            System.out.println("ENTER YOUR CHOICE:");
                            c=sc.nextInt();
                            
                            switch(c) {
                            case 1: //food
                                System.out.println("Kindly enter what would you like to donate?");
                                sc.nextLine();
                                String food = sc.nextLine();
                                System.out.println("You have entered: "+food);
                                System.out.println("kindly enter quantity:");
                                food_quantity=sc.nextInt();
                                break;
                                        
                            case 2: //clothing 
                                System.out.println("Enter quantity of clothes:");
                                clothing=sc.nextInt();
                                break;
                                        
                            case 3://daily needs 
                                System.out.println("enter what would you like to donate");
                                sc.nextLine();
                                daily_needs = sc.nextLine();
                                break;
                                        
                            case 4://grocery
                                System.out.println("enter what would you like to donate");
                                sc.nextLine();
                                grocery = sc.nextLine();
                                break;
                            }
                        }while(c!=4);
                        break;
                        
                    case 2://appliances
                        System.out.println("enter what you would like to donate");
                        sc.nextLine();
                        String appliance = sc.nextLine();
                        System.out.println("enter the number of appliances:");
                        int appliance_number =sc.nextInt();
                        break;
                
                    case 3: //Study materials
                        System.out.println("------STUDY MATERIALS----");
                        System.out.println("Kindly select the appropriate option under study materials:");
                        do{
                            System.out.println("1.books");
                            System.out.println("2.stationary");
                            System.out.println("3.bags");
                            System.out.println("4.other material");
                            System.out.println("ENTER YOUR CHOICE:");
                            c_1=sc.nextInt();
                            
                            switch(c_1){
                            case 1: //books
                                System.out.println("Kindly enter number of books you would like to donate?");
                                sc.nextLine();
                                books=sc.nextInt();
                                break;
                                                    
                            case 2: //stationary
                                System.out.println("kindly enter the quantity of stationary you would like to donate: :");
                                sc.nextLine();
                                stationary=sc.nextLine();
                                break;
                                                    
                            case 3://bags
                                System.out.println("kindly enter the number of bags you would like to donate: :");
                                bags=sc.nextInt();
                                break;
                                                    
                            case 4://other material
                                System.out.println("enter what would you like to donate");
                                sc.nextLine();
                                String other_material = sc.nextLine();
                                break;
                                    
                            }break;
                            
                        }while(c_1!=4);
                        break;
                        
                    case 4://money 
                        System.out.println("Kindly make a note that these payments should be made to the ngo directly");
                        System.out.println("Enter the amount(in rupee):");
                        money=sc.nextInt();
                        break;
                
                    case 5://exit 
                        break;
                    }
            
                } while(ch!=5);
                System.out.println("NGO Name: Asmita Foundation");
                System.out.println("Cause: Children");
                System.out.println("Ph. no.: 7289877329");
                System.out.println("E-mail: asmitaafoundation@gmail.com");
                System.out.println("Address: Pimpalgaon road, Manchar - 410503");
                break;   
                
            case 8://health and FAMILY
                do{
                    System.out.println("DONATION");
                    System.out.println("KINDLY SELECT THE APPROPRIATE CHOICE FOR DONATION:");
                    System.out.println("1.BASIC NEEDS\n2.APPLIANCES\n3.STUDY MATERIAL\n4.MONEY\n5.MEDICAL HELP\n6.EXIT");
                    System.out.println("ENTER YOUR CHOICE:");
                    ch=sc.nextInt();
            
                    switch(ch) {
                    case 1: //BASIC NEEDS
                        System.out.println("------BASIC NEEDS----");
                        System.out.println("Kindly select the appropriate option under basic needs:");
                        do {
                            System.out.println("1.Food");
                            System.out.println("2.Clothing");
                            System.out.println("3.Daily Needs");
                            System.out.println("4.Grocery");
                            System.out.println("ENTER YOUR CHOICE:");
                            c=sc.nextInt();
                            
                            switch(c) {
                            case 1: //food
                                System.out.println("Kindly enter what would you like to donate?");
                                sc.nextLine();
                                String food = sc.nextLine();
                                System.out.println("You have entered: "+c);
                                System.out.println("kindly enter quantity:");
                                food_quantity=sc.nextInt();
                                break;
                                        
                            case 2: //clothing 
                                System.out.println("Enter quantity of clothes:");
                                clothing=sc.nextInt();
                                break;
                                        
                            case 3://daily needs 
                                System.out.println("enter what would you like to donate");
                                sc.nextLine();
                                daily_needs = sc.nextLine();
                                break;
                                        
                            case 4://grocery
                                System.out.println("enter what would you like to donate");
                                sc.nextLine();
                                grocery = sc.nextLine();
                                break;
                            }
                        } while(c!=4);
                        break;
                        
                    case 2://appliances
                        System.out.println("enter what you would like to donate");
                        sc.nextLine();
                        String appliance = sc.nextLine();
                        System.out.println("enter the number of appliances:");
                        int appliance_number =sc.nextInt();
                        break;
                
                    case 3: //Study materials
                        System.out.println("------STUDY MATERIALS----");
                        System.out.println("Kindly select the appropriate option under study materials:");
                        do{
                            System.out.println("1.books");
                            System.out.println("2.stationary");
                            System.out.println("3.bags");
                            System.out.println("4.other material");
                            System.out.println("ENTER YOUR CHOICE:");
                            c_1=sc.nextInt();
                        
                            switch(c_1){
                            case 1: //books
                                System.out.println("Kindly enter number of books you would like to donate?");
                                books=sc.nextInt();
                                break;
                                        
                            case 2: //stationary
                                System.out.println("kindly enter the quantity of stationary you would like to donate: :");
                                sc.nextLine();
                                stationary=sc.nextLine();
                                break;
                                        
                            case 3://bags
                                System.out.println("kindly enter the number of bags you would like to donate: :");
                                bags=sc.nextInt();
                                break;
                                        
                            case 4://other material
                                System.out.println("enter what would you like to donate");
                                sc.nextLine();
                                String other_material = sc.nextLine();
                                break;
                        
                            }
                            break;
                        }while(c_1!=4);
                        break;
                        
                    case 4://money 
                        System.out.println("Kindly make a note that these payments should be made to the ngo directly");
                        System.out.println("Enter the amount(in rupee):");
                        money=sc.nextInt();
                        break;
                
                    case 5://medical help
                        System.out.println("Kindly enter the amount you would like to donate for any kind of medical help:");
                        float medicine=sc.nextFloat();
                
                    case 6://exit 
                        System.out.println("EXITING");
                        break;
                    }
                    break;
            
                } while(ch!=6);
                System.out.println("NGO Name: Ayodhya Charitable Trust");
                System.out.println("Cause: Health and Family Welfare");
                System.out.println("Ph. no.: 9423252940");
                System.out.println("E-mail: ayodhyatrust@gmail.com");
                System.out.println("Address: Vikas Nagar, Wanawadi - 411004");
                break;   
                
                
            case 9://animal husbandry 
                System.out.println("Kindly enter the amount you would like to donate:");  
                float animal_donation=sc.nextFloat();
                System.out.println("Amount you entered:"+animal_donation);
                System.out.println("NGO Name: Baif Development Research Foundation");
                System.out.println("Cause: Animal Husbandry");
                System.out.println("Ph. no.: 202523669");
                System.out.println("E-mail: baif@baif.org.in");
                System.out.println("Address: BAIF Bhavan, Warje - 411058");
                break;
                    
            case 10://legal AWARENESS
                System.out.println("Kindly enter the amount you would like to donate:");  
                float legal_donation=sc.nextFloat();
                System.out.println("Amount you entered:"+legal_donation);
                System.out.println("NGO Name: Center for Sociolegal Development");
                System.out.println("Cause: Legal Awareness and Aid");
                System.out.println("Ph. no.: 8308804867");
                System.out.println("E-mail: socialjustice@rediffmail.com");
                System.out.println("Address: Swaroop Complex, Karve road - 411004");
                break;
                
            case 11: //exit 
                System.out.println("__EXITING____");
            }
        } while(ch!=11);
	}
}
