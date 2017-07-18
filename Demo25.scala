import Array._

object Demo25	{
	def main(args: Array[String])	{
		var z = Array(1.9,2.5,3.7,1.8);
		var y = Array(2.5,3.5,6.2,3.9);
		
		var mylist = concat(z,y);
		println(mylist.length);
		println(mylist);
		for(i <- mylist)
			println(i);
		}
		}
