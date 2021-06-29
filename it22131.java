package Academia;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class it22131 {

	public static int counter = 0;
	public static int counterv2 = 0;

	public static void main(String[] args) {

		boolean breakOfSwitch = false;
		boolean oneTime = false;
		Scanner bl = new Scanner((System.in));
		Scanner sc = new Scanner((System.in));

		Article[] articles = new Article[30];
		Author[] authors = new Author[60];
		Reviewer[] reviewer = new Reviewer[30];
		Rating[] rating = new Rating[30];

		int[] reviewercheck = new int[30];
		Arrays.fill(reviewercheck, 0);

		String email;
		String uniqueID = null;

		int reviewerCount = 0;
		int articleCount = 0;
		int authorCounter = 0;
		int ratingCount = 0;
		int flag = 0;
		int flag2 = 0;
		int flag3 = 0;
		int flag4 = 0;
		int flag5 = 0;
		int flag6 = 0;
		int review = 0;

		String email1 = "sotiris@gmail.com";
		String email2 = "andreas@gmail.com";
		String emailv1 = "alexandrou@gmail.com";
		String emailv2 = "spirouG@gmail.com";

		do {

			displays();

			if (oneTime == false) {
				articles[counter] = new Article("Technology", "Data", "Science", "AI", counter);
				articleCount++;
				authors[counterv2] = new Author("Sotiris", "Tofinis", "Mr", "Hua", email1, articles[counter].getID());
				reviewer[reviewerCount] = new Reviewer("Andreas", "Andreou", "Mr", "Hua", email2,
						articles[counter].getID());
				reviewercheck[0] = 1;
				reviewerCount++;
				rating[ratingCount] = new Rating(5, 8, 9, 7, articles[counter].getID());
				ratingCount++;
				articles[0].setRating();
				counter++;
				counterv2++;

				//
				articles[counter] = new Article("Biology", "Data", "Vaccine", "Nature", counter);
				articleCount++;
				authors[counterv2] = new Author("John", "Paul", "Mr", "UoA", emailv1, articles[counter].getID());
				reviewer[reviewerCount] = new Reviewer("Alexandros", "Antoniou", "Mr", "Hua", emailv2,
						articles[counter].getID());
				reviewercheck[1] = 1;
				reviewerCount++;
				rating[ratingCount] = new Rating(8, 8, 10, 9, articles[counter].getID());
				ratingCount++;
				articles[1].setRating();
				counter++;
				counterv2++;

				oneTime = true;
			}
			int test;
			int choose;
			choose = sc.nextInt();
			//while (test < 1 || test > 5) {
				System.out.printf("Wrong Input!Please choose between 1-5! ");
				try {
				
				test=(Integer)choose;
				}catch(InputMismatchException e)
				{
				System.out.printf("Wrong Input! Try Again!");
			}
			//}
			

			switch (choose) {
			case 1:

				articles[counter] = new Article(articleCount);
				articleCount++;

				flag4 = 0;
				System.out.printf("\n");
				System.out.printf("Give me the Authors Email:");
				email = sc.nextLine();
				email = sc.nextLine();

				while (EmailCheck.isValid(email) == false) {
					System.out.printf("Your email is invalid!Try again!");
					email = sc.nextLine();
				}

				for (int i = 0; i < counterv2; i++) {
					if (email.equals(authors[i].getEmail())) {
						uniqueID = articles[counter].getID();
						authors[i].setID(uniqueID);
						System.out.printf(
								"The author has been found and has been automatically linked with his details!");
						System.out.printf("\n");
						flag4 = 1;
						break;
					}

				}
				if (flag4 == 0) {
					authors[counterv2] = new Author(articles[counter].getID(), email);
					counterv2++;
					authorCounter++;
				}
				System.out.printf("\n");
				System.out.printf("In case you want to add a co-writer, press 1, otherwise press any key to continue!");
				int check;
				check = sc.nextInt();
				if (check == 1) {
					flag4 = 0;
					System.out.printf("Give me the Authors Email:");
					email = sc.nextLine();
					email = sc.nextLine();

					while (EmailCheck.isValid(email) == false) {
						System.out.printf("Your email is invalid!Try again!");
						email = sc.nextLine();
					}

					for (int i = 0; i < counterv2; i++) {
						if (email.equals(authors[i].getEmail())) {
							uniqueID = articles[counter].getID();
							authors[i].setID(uniqueID);
							System.out.printf(
									"The author has been found and has been automatically linked with his details!");
							System.out.printf("\n");
							flag4 = 1;
							break;
						}

					}
					if (flag4 == 0) {
						authors[counterv2] = new Author(articles[counter].getID(), email);
						counterv2++;
						authorCounter++;
					}

				}
				counter++;

				System.out.printf("Do you want to exit ? (true/false)");
				breakOfSwitch = bl.nextBoolean();
				break;
			case 2:
				flag2 = 0;
				String ID;
				System.out.printf("Give me the article's ID: ");
				ID = sc.nextLine();
				ID = sc.nextLine();

				for (int i = 0; i < counter; i++)
					if (ID.equals(articles[i].getID()))
						review = i;
				flag = 0;
				for (int i = 0; i < counter; i++)
					if (ID.equals(articles[i].getID())) {
						if (reviewercheck[review] == 1) {
							System.out.printf(
									"The reviewer for this article is already set!You can not add a second reviewer!");
							System.out.printf("\n");
							flag2 = 1;
						}

					}
				if (flag2 != 1) {
					do {
						flag3 = 0;
						for (int i = 0; i < counter; i++) {
							if (ID.equals(articles[i].getID())) {
								flag = 1;
								break;
							}
						}
						if (flag == 0) {
							System.out.printf("We didnt find that Article ID!Try again:");
							ID = sc.nextLine();
						}

					} while (flag == 0);
					for (int i = 0; i < counter; i++) {
						if (ID.equals(articles[i].getID())) {
							articles[i].show();
							authors[i].show();
							break;
						}
					}
					System.out.printf("Give me the Reviewers Email Adrress: ");
					email = sc.nextLine();

					while (EmailCheck.isValid(email) == false) {
						System.out.printf("Your email is invalid!Try again!");
						email = sc.nextLine();
					}

					for (int i = 0; i < reviewerCount; i++) {
						if (email.equals(reviewer[i].getEmail())) {
							reviewer[i].setID(ID);
							System.out.printf(
									"The reviewer has been found and has been automatically linked with his details!");
							flag3 = 1;
							break;
						}
					}
					if (flag3 == 0) {
						reviewer[reviewerCount] = new Reviewer(ID, email);
						reviewercheck[review] = 1;
						reviewerCount++;
					}

				}
				System.out.printf("Do you want to exit ? (true/false)");
				breakOfSwitch = bl.nextBoolean();
				break;
			case 3:
				int j = 0;
				String getID;
				flag6 = 0;
				System.out.printf("Give me the articles ID: ");
				getID = sc.nextLine();
				getID = sc.nextLine();
				for (int i = 0; i < counter; i++) {
					if (getID.equals(articles[i].getID())) {
						System.out.printf("Article's ID: " + getID);
						articles[i].show();
						articles[i].showAllMethod3();
						j = i;
						flag6 = 1;
					} else
						System.out.printf("We didnt find any articles with this ID : " + getID);
				}
				if (flag6 == 1) {
					System.out.printf("\n");
					System.out.printf("Give me the reviewers email: ");
					email = sc.nextLine();
					for (int i = 0; i < reviewerCount; i++)
						if (email.equals(reviewer[i].getEmail())) {
							if (reviewer[i].getID(getID)) {
								rating[ratingCount] = new Rating(getID);
								ratingCount++;
								articles[j].setRating();
							}
						}
				}
				System.out.printf("Do you want to exit ? (true/false)");
				breakOfSwitch = bl.nextBoolean();
				break;
			case 4:
				flag5 = 0;
				String artID;
				System.out.printf("Give us the Article's ID: ");
				artID = sc.nextLine();
				do {
					artID = sc.nextLine();
					for (int i = 0; i < counter; i++)
						if (artID.equals(articles[i].getID())) {
							flag5 = 1;
						}
					if (flag5 == 0) {
						System.out.printf("We didnt find the ID that you gave us!");
						System.out.printf("\n");
					}
					break;

				} while (flag == 0);
				for (int i = 0; i < 30; i++) {
					if (reviewer[i] == null)
						break;
					else if (!(reviewer[i].getID(artID))) {
						System.out.printf("Reviewer Pending!");
						System.out.printf("\n");
						break;
					}
				}
				for (int i = 0; i < counter; i++) {
					if (artID.equals(articles[i].getID()))
						articles[i].show();
				}
				for (int i = 0; i < counterv2; i++) {
					if (artID.equals(authors[i].getID(i))) {
						authors[i].show();
					}
				}
				for (int i = 0; i < counter; i++) {
					if (artID.equals(rating[i].getID())) {
						rating[i].show();
					}
				} 

				System.out.printf("Do you want to exit ? (true/false)");
				breakOfSwitch = bl.nextBoolean();
				break;
			case 5:
				Article.sum();
				System.out.printf("Do you want to exit ? (true/false)");
				breakOfSwitch = bl.nextBoolean();
				break;
			default:
				System.out.printf("NO OUTPUT");
			}
		} while (!breakOfSwitch);
		
		System.out.printf("Thanks for using our program!");

	}

	public static void displays() {
		System.out.println("Hello and Welcome to Conferences@Academia program!!\n");
		System.out.println("Please choose how you would like to keep going:\n");
		System.out.println(
				"Choose the right number for you: \n1:Add a new Blog \n2:Search for an article and adds a reviewer");
		System.out.println("3:Add a review\n4:Show the review\n5:Overview");

	}

	public static int countplus() {
		return counter;
	}

	public boolean EmailCheck(String Email, int cnt) {
		return true;
	}

}
