package Academia;

import java.util.Scanner;
import java.util.*;
import java.util.UUID;
import java.nio.ByteBuffer;

public class Article {

	private String title;
	private String[] keywords = new String[3]; // max 3 keywords
	private Author[] author = new Author[2]; // max 2 authors per article
	private String uniqueID = "ArtID"; //unique ID per article
	private boolean rated=false; 
	
	private String typeOfArticle; 
	final String typeOne = "Full Paper";
	final String typeTwo = "Paper in progress";
	
	private String caseOfArticle;
	final String caseOne = "regular";
	final String caseTwo = "case study";

	public static int typeCounter1 = 0;  //Type of article - full paper
	public static int typeCounter2 = 0;  //Type of article - Paper in progress
	
	private int counterForReview = 0; //for review checks

	Scanner s1 = new Scanner(System.in);  //input method
	
	String caseTwoMore;

	public Article(int numb) {

		System.out.printf("Articles Unique ID: ");
		this.uniqueID += numb; //creates a simple and unique ID for each article by adding a counter to the word ArtID(xxx)
		System.out.printf(uniqueID);

		System.out.printf("\n");
		System.out.printf("Give me the Article's title: ");

		this.title = s1.nextLine();

		
		System.out.printf("Give me the Article's keywards: ");
		keywords[0] = s1.nextLine();
		while (keywords[0].isEmpty()) {
			System.out.printf("You need at least 1 keyword!Try again: ");
			keywords[0] = s1.nextLine();
		}
		int check = 0, counter = 0;
		do {
			System.out.printf("Do you want to put another keyword? 1-Yes 0-No");
			check = s1.nextInt();
			while (!(check == 1 || check == 0)) {
				System.out.printf("Wrong input!Please choose between 1-0");
				check = s1.nextInt();
			}
			if (check == 0) {
				counter = 3;
				break;
			}

			else if(check ==1) {
				System.out.printf("Add the keyword:");
				keywords[counter + 1] = s1.nextLine();
				keywords[counter + 1] = s1.nextLine();
				counter++;
			}
		} while(counter < 2);

		System.out.printf("Please choose the right option for your article!");
		System.out.printf("Is your article a Full Paper(1) or a Paper in progress(2)?Choose the right number");

		int option;
		option = s1.nextInt();
		while (option < 1 || option > 2) {
			System.out.printf("Wrong inpute!Please choose between 1-2");
			option = s1.nextInt();
		}

		

		if (option == 1) {
			typeOfArticle = typeOne;
			typeCounter1++;
			System.out.printf("You choose " + typeOfArticle);
			System.out.printf("\n");
		} else {
			typeOfArticle = typeTwo;
			typeCounter2++;
			System.out.printf("You choose " + typeOfArticle);
			System.out.printf("\n");
		}

		System.out.printf("Please choose the right option for your article!");
		System.out.printf("Is your article a regular(1) article or a Case Study(2)?Choose the right number");

		option = s1.nextInt();
		while (option < 1 || option > 2) {
			System.out.printf("Wrong inpute!Please choose between 1-2");
			option = s1.nextInt();
		}

		

		

		if (option == 1) {
			caseOfArticle = caseOne;
			System.out.printf("You choose " + caseOfArticle);
			System.out.printf("\n");
		} else {
			caseOfArticle = caseTwo;
			System.out.printf("You choose " + caseOfArticle);
			System.out.printf("\n");
			System.out.printf("Because you choosed case study,tell us the name of the public/private organaization!");
			caseTwoMore = s1.nextLine();
			caseTwoMore = s1.nextLine();
			while (!(caseTwoMore instanceof String)) {
				System.out.printf("Wrong Input!Please use a valid name!");
				caseTwoMore = s1.nextLine();
			}

		}

		System.out.printf("Your Article has been recorded succefully!");

	}
	
	public static void sum() {
		
		int sum;
		sum=typeCounter1+typeCounter2;
		
		System.out.printf("The sum of the articles is " + sum );
		System.out.printf("\nThe sum of the full paper articles is  " + typeCounter1 );
		System.out.printf("\nThe sum of the paper in progress articles is  " + typeCounter2 );
		System.out.printf("\n");
		
	}
	
	public void show() {
		System.out.println("\n");
		System.out.printf("Article's Title: "+ this.title);
		System.out.println("\n");
		System.out.printf("Type of Article: "+ this.typeOfArticle);
		System.out.println("\n");
		
		
		
		
	}
	public void showAll() {
		this.show();
		System.out.println("\n");
		System.out.printf("Article's author: ");
		author[0].show();
		System.out.println("\n");
		if(author[1]!=null)
		{
			author[1].show();
		}
		System.out.printf("Type of Article: "+ this.typeOfArticle);
		System.out.println("\n");
		
		
		
	
	}
	public void showAllMethod3()
	{
		show();
		System.out.printf("Article's Keywords: " + this.keywords[0]);
		for(int i=1;i<3;i++)
		{
			if(keywords[i]!= null)
				System.out.printf(" " + this.keywords[i]);
		}
		
	}
	
	public String getID()
	{
		return this.uniqueID;
	}
	
	public void setRating() {
		this.rated=true;
	}
	
	public boolean getRating() {
		return this.rated;
	}
	
	public String giveAuthorEmail()
	{
		String email = null;
		
		   email= author[0].getEmail();
		
		return email;
	}
	
	public Article(String Title,String keywords1,String keywords2,String keywords3,int numb)
	{
		this.title = Title;
		this.keywords[0] = keywords1;
		this.keywords[1] = keywords2;
		this.keywords[2] = keywords3;
		
		
		
		this.uniqueID+=numb ;
		
		this.typeOfArticle = typeOne;
		this.typeCounter1++;
		
		this.rated = true;
		
	}
	
}
