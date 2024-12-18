import java.util.Scanner;
class ArraySearching{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 10 numberof Array :");
	int size = sc.nextInt();
	
	int[] a = new int[size];
      System.out.println("Enter the element in Array :");
	for(int i=0;i<=size-1;i++){
      	a[i]=sc.nextInt();
	}
		System.out.println("Enter the finding element :");
		int key = sc.nextInt();
		for(int i=0;i<size;i++){
		   if(a[i]==key){
			System.out.println("key is found : "+ i);	
			}
		}
		if(key==size){
			System.out.println("Key not found");
		}
	}
}