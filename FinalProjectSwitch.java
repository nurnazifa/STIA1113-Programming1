/*FinalProject by
1.Gibrail Fikri bin Yusni 264195
2.Mifzal Aqmar bin Mohamad Azhar 261121
3.Nur Nazifa binti Zhamri 261188
4.Muhammad Hafiz  bin Muhd Ismadi 265248
*/
import java.util.Scanner;
import java.util.Arrays;

public class FinalProjectSwitch{
	
	public static double[] Price = new double[10]; 
	public static String[] Name = new String[10]; 
	public static int sot = -2; 
	public static void main(String []args){
		boolean answer = true; 
		int choice,quantity;
		char order='Y';
		double total=0,pay;
		Scanner sc=new Scanner(System.in);
		price(); //Calling method price to allocate price to array
		naming(); //Calling method naming to allocate name to array
		System.out.print("Enter 0 to sort menu according to price and ");
		System.out.print("enter 1 to sort menu according to alphabet: ");
		sot=sc.nextInt(); //Choosing way to sort the menu
		do {  
			switch(order){ 
				case 'N':
				case 'n':
						 answer = false;
						break;

				case 'Y':
				case 'y':
						menu(); //Calling method menu to display the cakes
						do{ 
							System.out.print("\nEnter valid choice of cake: ");
							choice=sc.nextInt();
						} while(choice<1||choice>10);  
						System.out.println("");

						System.out.print("Enter the quantity of cake: ");
						quantity=sc.nextInt();
						total=total+(Price[(choice-1)]*quantity); //Calculation to the total price
						System.out.printf("\nCurrent total price : RM %.2f",total);

				default :
						System.out.printf("%nDo you want to add your order?: 'Y' / 'N' : ");
						order = sc.next().charAt(0);
			}
		} while(answer);  
		System.out.printf("%nGrand total: %.2f%n",total);

		System.out.print("Please enter amount tendered: RM ");
		pay=sc.nextDouble();
		while(pay<total){ //Correction if payment not enough
			System.out.println("Not enough payment");
			System.out.print("Please enter amount tendered: RM ");
			pay=sc.nextDouble();
		}

		System.out.printf("%n Your Bill:%n**********************************%n"); //Display summary of bills
		System.out.printf("%-25s%-3s%.2f%n","Total price ","RM",total);
		System.out.printf("%-25s%-3s%.2f%n","Amount tendered ","RM",pay);
		System.out.printf("%-25s%-3s%.2f","Balance ","RM",pay-total);
		System.out.println("");
		sc.close();

	}
	
	public static void menu(){ //Method to sort and display the menu accordingly
		System.out.println("\n*********************************************");
		System.out.println("        WELCOME TO JAVABEANS BAKERY");
		System.out.println("*********************************************");
		System.out.println("Please choose your preferred cake:");
		System.out.println(""); 

		int i = 0; 
		switch(sot){
			case 0:	
					
					Arrays.sort(Price);  
					while(i<10){
					System.out.print((i+1)+"-"); // Print the number start from 1
					System.out.println(Name[i]);
					i++;
					}
					break;
			case 1: 
					
					Arrays.sort(Name);
					while(i<10){
					System.out.print((i+1)+"-"); // Print the number start from 1
					System.out.println(Name[i]);
					i++;
					}
					break;
			default:
					System.out.println("Sorting not correctly specified, sorting according to alphabet");
					
					Arrays.sort(Name);
					while(i<10){
					System.out.print((i+1)+"-"); // Print the number start from 1
					System.out.println(Name[i]);
					i++;
					}
					sot=1;
		}
	}
	public static void price(){ //Method to allocate all price to array
		Price[0]= 40.5; //Black Forest Gateau
		Price[1]= 35.5; //Cherry Cheesecake
		Price[2]= 45.5; //Coffee Cake with Mocha Frosting
		Price[3]= 60.0; //Eggless Truffle Cake
		Price[4]= 40.0; //Fudgy Chocolate Cake
		Price[5]= 30.0; //Mango Meringue Cake
		Price[6]= 45.0; //Neapolitan Cheesecake
		Price[7]= 25.5; //Oreo Cheesecake
		Price[8]= 70.0; //Pineapple Cake
		Price[9]= 80.0; //Red Velvet Cheesecake
	}
	public static void naming(){ //Method to allocate all name to array

		Name[0]= "Oreo Cheesecake ................... RM " + Price[7];
		Name[1]= "Mango Meringue .................... RM " + Price[5];
		Name[2]= "Cherry Cheesecake ................. RM " + Price[1];
		Name[3]= "Fudgy Chocolate Cake .............. RM " + Price[4];
		Name[4]= "Black Forest Gateau ............... RM " + Price[0];
		Name[5]= "Neapolitan Cheesecake ............. RM " + Price[6];
		Name[6]= "Coffee Cake with Mocha Frosting ... RM " + Price[2];
		Name[7]= "Eggless Truffle Cake .............. RM " + Price[3];
		Name[8]= "Pineapple Cake .................... RM " + Price[8];
		Name[9]= "Red Velvet Cheesecake ............ RM " + Price[9];
	}
}
