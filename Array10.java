 
//write a program to accept 10 number and store in a array and print the sum of all numbers which are divisible by 5 only 

import java.util.Scanner;
 class PrintArray{
	public static void main(String []args ){
	Scanner sc =new Scanner (System.in);
       
         int [] arr=new int[10];
	System.out.println("Enter the 10 number");
	for(int i=0;i<=10;i++){
           ar[i]=sc.nextInt();
		if(i%5==0){
			sum=arr[i]+arr[i+1];					
			}
 				
	}
		
		System.out.prntln("sum="+sum);

	}
}