
import java.util.Scanner;
class EvenDemo1{
	public static void main(String [] args){
		int a, b ;
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter the value of a:");
		a =sc.nextInt();
	
		System.out.println("Enter the value of b:");
  		b =sc.nextInt();
		if(a>b){
				while(a<=b){
				if(a%2==0 && b%2==0){
				System.out.println("the number is even");
				}
				a=a-1;
			}
			else{
				System.out.println("the number is odd");
			}
				a=a+1;
           }
	}
}

 