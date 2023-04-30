package ngo;
import java.util.Scanner;

public class Hashtable {
	int tablesize = 12;
	NGOLocation hashtable[] = new NGOLocation[tablesize];
	boolean flag = false;
	
	void hash() {
		int count=0;
		
		for(int i=0; i<tablesize; i++) {
			if(hashtable[i]!=null) {
				count+=1;
			}
		}
		
		if(count==12) {
			System.out.println("Table is full");
			return;
		}
		
		NGOLocation ngo1 = new NGOLocation(0, "Adventures Beyond Barriers Foundation", "Education", "9309725823", "nalanda@adventuresbeyondbarriers.com", "Shindenagar, Bavdhan", 411021);
		int a=(0%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo1;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo2 = new NGOLocation(1, "Umed Pariwar", "Differently abled", "9822030093", "info@umedpariwar.org", "Mangalwar peth", 411011);
		a=(1%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo2;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo3 = new NGOLocation(2, "Apt Research Foundation", "Environment and Forest", "9607362020", "enquiries@aptresearch.co.in", "Vadgaon Khurd, Sinhagad road", 411041);
		a=(2%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo3;
		if(flag) {
			System.out.println("Collision occurred!");
		}

		NGOLocation ngo4 = new NGOLocation(3, "Aasakta Kalamanch Pune", "Art and Culture", "097694 02412", "aasaktakalamanch@gmail.com", "Snighda society, Laxminagar, Parvati", 411009);
		a=(3%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo4;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo5 = new NGOLocation(4, "Aastha Bahuuddeshiya Sevabhavi Sanstha", "Civic Issues", "8975663388", " aasthatrust2013@gmail.com", "Aundh road, Ambedkar chowk", 411007);
		a=(4%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo5;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo6 = new NGOLocation(5, "Akhil Maharashtra Education Society", "Agriculture", "9423002267", "contact@gmesociety.org", "Guru Ganesh Nagar, Kothrud", 411038);
		a=(5%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo6;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo7 = new NGOLocation(6, "Asmita Foundation", "Children", "7289877329", " asmitaafoundation@gmail.com", "Pimpalgaon road, Manchar", 410503);
		a=(6%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo7;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo8 = new NGOLocation(7, "Ayodhya Charitable Trust", "Health and Family Welfare", "9423252940", "ayodhyatrust@gmail.com", "Vikas Nagar, Wanawadi", 411004);
		a=(7%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo8;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo9 = new NGOLocation(8, "Baif Development Research Foundation", "Animal Husbandry", "202523669", " baif@baif.org.in", "BAIF Bhavan, Warje", 411058);
		a=(8%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo9;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo10 = new NGOLocation(9, "Banshankari Shikshan Sanstha", "Education", "9822267081", " proteckcomputers@yahoo.com", "Banshankari, Grampanchayat office, Keshavnagar", 411036);
		a=(9%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo10;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo11 = new NGOLocation(10, "Bharatiya Mahila Vikas Sanstha", "Civic Issues", "9960999599", "bmvsindia@gmail.com", "Sambhaji Nagar, Chinchwad, Pune", 411019);
		a=(10%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo11;
		if(flag) {
			System.out.println("Collision occurred!");
		}
		
		NGOLocation ngo12 = new NGOLocation(11, "Center for Sociolegal Development", "Legal Awareness and Aid", "8308804867", "socialjustice@rediffmail.com", "Swaroop Complex, Karve road", 411004);
		a=(11%tablesize);
		while(hashtable[a]!=null) {
			flag=true;
			a=(a+1)%tablesize;
		}
		hashtable[a]=ngo12;
		if(flag) {
			System.out.println("Collision occurred!");
		}
	}
	
	void distance() {
	    Scanner sc = new Scanner(System.in);
	    int i;
	    
	    System.out.print("Enter a pincode: ");
	    int userPincode = sc.nextInt();
	    sc.close();
	    
	    int[] arr=new int[50];
	    
	    for(i=0;i<12;i++){
	       arr[i]=hashtable[i].pincode;
	    }
	    arr[12]=userPincode;
	    
	    for(i=0; i<13; i++) {
	    	System.out.println(arr[i]);
	    }
	    sort(arr);
	    int pinindex = search(arr, userPincode);
	    
	    System.out.println("The NGOs closest to your location are: ");
	    
	    
	    for(i=0; i<13; i++) {
	    	
	    }
	}
	
	int search(int[] arr, int key) {
		for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }
	
	void sort(int[] arr) {
		int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++) {  
        	for(int j=1; j < (n-i); j++) {  
        		if(arr[j-1] > arr[j]) {  
        			//swap elements  
        			temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }      
            }  
        }
	}
	
	void Put(int Key, NGOLocation Node) {
		Hashtable node = new Hashtable();
		node.hashtable[Key]=Node;

		int a=(1%tablesize);
		while(hashtable[a]!=null) {
		flag=true;
		a=(a+1)%tablesize;
		}
		//hashtable[a]=ngo2;
		if(flag) {
		System.out.println("Collision occurred!");
		}
		}

	void display() {
		for(int i=0; i<12; i++) {
			System.out.println("\n======= NGO "+(i+1)+" =======");
			if(hashtable[i]==null) {
				System.out.println("Name : ");
				System.out.println("Cause : ");
				System.out.println("Phone no. : ");
				System.out.println("Email : ");
				System.out.println("Address : ");
				System.out.println("Pincode : ");
			}
			else if(hashtable[i]!=null) {
				System.out.println("Name : "+ hashtable[i].name);
				System.out.println("Cause : "+ hashtable[i].cause);
				System.out.println("Phone no. : "+ hashtable[i].phno);
				System.out.println("Email : "+ hashtable[i].email);
				System.out.println("Address : "+ hashtable[i].addr);
				System.out.println("Pincode : "+ hashtable[i].pincode);
			}
		}
	}
}