object Demo9	{
	def main(args: Array[String])	{
		println("Value returned by the addInt method" + addInt(90));
		}
	def addInt(a: Int = 5, b:Int = 7): Int =	{
		var sum: Int = 0;
		sum = a + b;
		return sum;
	}
}
