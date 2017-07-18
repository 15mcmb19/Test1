object Demo14	{
	def main(args: Array[String])	{
	println(apply(layout, 10))
	}

	def apply(f: Int => String, v: Int) = {
		println("layout IN");
		f(v);
			//println("layout OUT");
			}
	
	def layout[A](x: A) = "[" + x.toString() + "]"
		
		
			
	}
