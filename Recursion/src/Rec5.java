
public class Rec5 {
	
	public static void main(String[] args) {
		
			System.out.println(fib(4));		
			System.out.println(fibonacci(4));		
		}
	
	public static int fib(int num) { 
    if(num==1) {
        return 0; 
    }
    if(num==2) {
        return 1; 
    }
    int fib1 = fib(num-1);
    int fib2 = fib(num-2);
    int curFib = fib1+fib2;
    return curFib;
    } 
	
	public static int fibonacci(int n) 
    { 
	if (n == 1) 
		return 0;
    if (n == 2) 
    	return 1; 
    return fibonacci(n-1) + fibonacci(n-2); 
    } 
		

}
