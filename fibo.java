package CalidadyPruebas;

public class fibo {

 public static void main (String args[] ){
			System.out.println(fibonacci(10));
		}//main
		
		
	static int fibonacci(int n) {
			if(n>2)
				return fibonacci(n-1) + fibonacci(n-2);
			else
				return 1;
			
			 
		}
		
	}