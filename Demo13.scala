object Demo13	{
	def main(args: Array[String])	{
	//var i: Int;	
	for(i <- 1 to 20)	{
		println("The factorial of "+i+" is "+ factorial(i));
		}
	def factorial(i: BigInt): BigInt =	{
		if(i<=1)
			1
		else
			i* factorial(i-1);
		}
}
}
