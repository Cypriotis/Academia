package Academia;

import java.util.Scanner;

public class Rating {

	private int researchContribution;
	private int researchResults;
	private int researchMethodology;
	private int innovation;
	private String check;
	
	private String uniqueID;

	Scanner s4 = new Scanner(System.in);

	public Rating(String ID) {

	
		uniqueID= ID;
		System.out.printf("Review Section:");
		System.out.printf("\nGive us the review about the research Contribution of the article(1-10):");
		this.researchContribution = s4.nextInt();
		System.out.printf("\nGive us the review about the research Results of the article(1-10):");
		this.researchResults = s4.nextInt();
		System.out.printf("\nGive us the review about the research Methodology of the article(1-10):");
		this.researchMethodology = s4.nextInt();
		System.out.printf("\nGive us the review about the inovation of the article(1-10):");
		this.innovation = s4.nextInt();

		System.out.printf("\nYour review has been recorded Succefully!");
	}

	public void show() { // Action 4
		
		System.out.printf("ResearchContribution " + this.researchContribution);
		System.out.printf("\n");
		System.out.printf("ResearchResults " + this.researchResults);
		System.out.printf("\n");
		System.out.printf("ResearchMethodology " + this.researchMethodology);
		System.out.printf("\n");
		System.out.printf("Innovation " + this.innovation);
		System.out.printf("\n");
		

	}
	public String getID()
	{
		return this.uniqueID;
	}
	
	public Rating(int a , int b, int c , int d , String ID)
	{
		this.researchContribution = a;
		this.researchResults = b;
		this.researchMethodology = c;
		this.innovation = d;
		this.uniqueID=ID;
		
	}

}
