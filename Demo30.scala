object Demo30	{
	def main(args: Array[String])	{
		val x = List.tabulate(5) (n => n * n);
		val y = List.tabulate(4,5)(_ - _);
		print(x);
		print("\n"+y);
			println();
		}
		}
