package Academia;

import java.util.Scanner;

public class Reviewer {

	private String name;
	private String surname;
	private String title;
	private String Organaization;
	private String email;
	private EmailCheck check;
	
	private String[] uniqueID = new String[30];
	
	private int cnt=0;

	Scanner s3 = new Scanner(System.in);

	public Reviewer() {

	

		System.out.printf("Give me the Name of the Reviewer: ");
		this.name = s3.nextLine();
		System.out.printf("Give me the SurName of the Reviewer: ");
		this.surname = s3.nextLine();
		System.out.printf("Give me the title of the Reviewer(If possible): ");
		this.title = s3.nextLine();
		System.out.printf("Give me the Organaization of the Reviewer(If possible): ");
		this.Organaization = s3.nextLine();
		

	}
	
	public Reviewer(String uniqueID,String email) {
		this();
		this.uniqueID[this.cnt]=uniqueID;
		this.email=email;
		cnt++;
		
	}
	
	public String getEmail() {
		
		return this.email;
		
	}
	
	public void setID(String ID)
	{
		this.uniqueID[cnt]=ID;
	}
	
	public boolean getID(String ID)
	{
		for(int j=0;j<uniqueID.length;j++)
			if(ID.equals(this.uniqueID[j]))
				return true;
		
		return false;
	}
	
	public void preInitialise()
	{
		   this.name = "Andreas";
		   this.surname = "Andreou";
		   this.title = "Mr";
		   this.Organaization = "Hua";
		   this.email = "andreas@gmail.com";
		   
		   this.uniqueID[0] = "ArtID0";
	}
	public void preInitialise2()
	{
		   this.name = "George";
		   this.surname = "Spirou";
		   this.title = "Mr";
		   this.Organaization = "UoA";
		   this.email = "spirouG@gmail.com";
		   
		   this.uniqueID[0] = "ArtID1";
	}
	
	public Reviewer(String name,String surname,String Title,String Organaization,String Email,String uniqueID)
	{
		   this.name = name;
		   this.surname = surname;
		   this.title = Title;
		   this.Organaization = Organaization;
		   this.email = Email;
		   this.uniqueID[cnt]=uniqueID;
		   cnt++;
		   
	}
	
	

}
