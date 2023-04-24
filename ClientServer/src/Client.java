//***************************************
//Name: Chelsea Lennox                  *
//Date: 04/23/2023                      *
//Purpose: Create a Client and Server   *
//***************************************
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

public static void main(String[] args) {
	
	//Scanner	
	Scanner scan = new Scanner(System.in);
	try{
	Socket s=new Socket("localhost",1900);
	DataInputStream dis=new DataInputStream(s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());

	// Ask user for number (input)
	System.out.print("\nEnter a Number : ");
	int num = scan.nextInt();
		
	// Write integer to the server
	dout.writeInt(num);
	String ans = (String)dis.readUTF();
	System.out.println("\nNumber "+num+
	" Is Prime Number: "+ans);
	dout.flush();
	dout.close();
	s.close();
	}		catch(Exception e){
	System.out.println(e);
	}
	scan.close();
		
	}

}//End of Client Class


