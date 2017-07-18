object Demo4	{
	def main(args: Array[String])	{
		println("The value is returned by function addInt"+ Add_Int(20, 35));
	}

	def Add_Int(a:Int, b:Int): Int = {
	var sum: Int = 0;
	sum = a + b;
	return sum;
	}
}
