package ngo;

public class NGOLocation {
	int index;
	String name;
	String cause;
	String phno;
	String email;
	String addr;
	int pincode;
	
	NGOLocation(int index, String name, String cause, String phno, String email, String addr, int pincode) {
		this.index = index;
		this.name = name;
		this.cause = cause;
		this.phno = phno;
		this.email = email;
		this.addr = addr;
		this.pincode = pincode;
	}
}
