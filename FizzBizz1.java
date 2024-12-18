class FizzBizz1{
	public static void main(String [] args){
		for(int i=1;i<=100;i++){
			if(i%3==0 && i%5==0)
			{
				System.out.print(" FizzBizz ");
            }
			  else if(i%3==0)
				        {
					     System.out.print(" Fizz ");

                        }
                           else if(i%5==0)
						{
					      System.out.print(" Bizz ");

                        } 
                 			else
						{
					       System.out.print(" " + i + " ") ;

                   		}
		
        }
    }
}