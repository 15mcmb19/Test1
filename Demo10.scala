object Demo10	{
	def main(args: Array[String])	{
	var i: Int = 0;
	while (i<4)	{
	println("value of factorial("+i+")=", factorial(i));
	println("\n******************************************");
	i = i+1;
	}
	def factorial(i: Int): Int =	{
		
		fact(i,1)	
	}
	def fact(i: Int, accumulator: Int): Int = {
			println("i = "+i);
			println("accumulator" + accumulator);
			if(i<=1)
			accumulator;
			else
			fact(i-1, i * accumulator);
		}
}
}
		
