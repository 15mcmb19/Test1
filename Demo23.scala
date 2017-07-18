object Demo23	{
	def main(args: Array[String])	{
		var z = new Array[Int](4);
		var total: Int = 0;
		
		for(i <- 0 to (z.length -1))	{
			z(i) = i;
			}
			
			var max = z(0);
			var min = z(0);
		for(i <-0 to (z.length -1))	{
			println(z(i))21;
			}
		for(i <- 0 to (z.length -1))	{
			total = total + z(i);
			}
		for(i <- 1 to (z.length -1))	{
			if(z(i)> max)
			max = z(i);
			if(z(i)< min)
			min = z(i);
			}
		println("Total = , max = , min =  ",  total, max, min);
		}
		}
			 
