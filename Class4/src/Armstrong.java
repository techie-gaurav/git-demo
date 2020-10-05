class Armstrong
{
	public static void main(String[] args)
	{
	int count=1,arm;
	System.out.println("Armstrong numbers between 1 to 500 exist: ");
	while(count<=500)
	{
	arm=armstrong(count);
	if(arm==count)
	System.out.println(count);
	count++;
	}
	}
public static int armstrong(int num)
{
	int a,b=0;
	while(num!=0)
	{
		a=num%10;
		b=b+(a*a*a);
		num/=10 ;
	}
	return b;
}
}