object Demo8	{
	def main(args: Array[String])	{
		printStrings("Hello", "123", "Yupptv");
		//printArgsStrings("Hello", "Jio", "Yupptv");
		//printWhileStrings("Hello", "Jio", "Yupptv");
		//printForStrings("Hello", "Jio", "Yupptv", "Netflix");
		}
	def printStrings(a:String, b: String, c: String)	{
		println("This is first string:" +a);
		println("This is second string:" +b);
		println("This is third string:"+c);
		}
	def printArgsStrings(args: String*)	{
		var i : Int = 0;
	
		println("args =" + args);
	
		
		for(arg <- args)	{
		println("Arg value["+ i +"]= " + arg);
		println("args =" + args(i));
		println("arg =" + arg);
		i = i+1;
			}
		}
	def printWhileStrings(args: String*)	{
			var i: Int = 0;
			while(i!= 3) {
			println("args["+i+"] =" + args(i));//, args(i));
			i= i +1;	}
			
		}
	
	









}
