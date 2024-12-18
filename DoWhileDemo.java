import java.util.Scanner;
class DoWhileDemo{
	public static void main(String [] args){
		int sum=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter Any Number");
			no=sc.nextInt();
			sum = sum+no;
			System.out.println("You want to add another number then y/n ");
			ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
			System.out.println("Print the sum of all numbers= " +sum); 
	}
}