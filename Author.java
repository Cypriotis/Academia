package Academia;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Author {

	private String name;
	private String surname;
	private String title;
	private String Organaization;
	private String email;
	private EmailCheck check;
	private String[] uniqueID = new String[60];

	Scanner s2 = new Scanner(System.in);
	
	private int cnt=0;

	public Author() {

		
		
		System.out.printf("Give me the Authors name:");
		this.name = s2.nextLine();
		System.out.printf("Give me the Authors surname:");
		this.surname = s2.nextLine();
		System.out.printf("Give me the Authors title(if possible):");
		this.title = s2.nextLine();
		System.out.printf("Give me the Authors Organaization(if possible)");
		this.Organaization = s2.nextLine();
		
		

	}
	
	public Author(String ID,String email) {
		this();
		this.email=email;
		this.uniqueID[this.cnt]=ID;
		cnt++;
	}
	
	
	public void show()
	{
		System.out.printf("Authors name:" + this.name);
		System.out.println("\n");
		System.out.printf("Authors surname:" + this.surname);
		System.out.println("\n");
	}
	
   public String getEmail() {
		
		return this.email;
		
	}
   public void setID(String ID)
	{
		this.uniqueID[cnt]=ID;
		cnt++;
	}
   public String getID(int i)
   {
	   return this.uniqueID[i];
   }
   
   public Author(String name,String surname,String Title,String Organaization,String Email,String uniqueID)
   {
	   this.name=name;
	   this.surname=surname;
	   this.title=Title;
	   this.Organaization=Organaization;
	   this.email=Email;
	   this.uniqueID[cnt]=uniqueID;
	   cnt++;
   }

}
