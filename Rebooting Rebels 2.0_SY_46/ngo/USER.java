package ngo;
import java.util.Scanner;
import java.util.LinkedList;

public class USER {
	public String name;
    public String phoneNumber;
    public String emailId;
    public String password;

    public USER(String name, String phoneNumber, String emailId, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.password = password;
    }
}