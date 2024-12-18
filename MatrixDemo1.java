import java.util.Scanner;
class MatrixDemo1{
		public static void main(String []args){
		int [][]a = new int[3][3];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the matrix Element");
		for(int i=0; i<3;i++){
		   for(int j=0;j<3;j++){
			   a[i][j]= sc.nextInt();
		    }
		}

			System.out.println("The given matrix is:\n");
			for(int i=0; i<3;i++){
		   for(int j=0;j<3;j++){
			   System.out.print(a[i][j]);
		    }
      		System.out.println();
		}
		}
}