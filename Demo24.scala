import Array._
object Demo24	{
	def main(args: Array[String])	{
		var z = ofDim[Int](3,3);
		for(i <- 0 to 2)
			for(j <- 0 to 2)
				z(i)(j) = j;
		
		for(i <- 0 to 2)
			for(j <- 0 to 2){
				print(""+z(i)(j));
				println();}
				
				
		}
		
	}
