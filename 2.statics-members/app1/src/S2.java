class S2
{
	static int i;
	static int j = i++ + i;
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
/*compound assignment  is possiblefor static variables at the class context.
while declaring the variable we cant use unary operator*/
