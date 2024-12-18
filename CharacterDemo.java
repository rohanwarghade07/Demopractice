
import java.util.Scanner;
class CharacterDemo{
		public static void main(String []args){
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Character");
			char ch = sc.next().charAt(0);
			if(ch>=65 && ch<=90){
				System.out.println("Capital Letter");
                  }
			else if(ch>=97 && ch<=122){
 			     System.out.println("Small Letter");
			}
			
                  else if(ch>=48 && ch<=57){
 			     System.out.println("Number");
			}
			else {
 			     System.out.println("Special letter");
			}
			
		}
}
