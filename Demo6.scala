object Demo6	{
	def main(args: Array[String])	{
		delayed_time(time());
	}
	def time() = {
		println("This is from time function");
		System.nanoTime;
		}
	def delayed_time(t: => Long) = {
		println("From delayed_time function");
		println("Time is " + t);
		println("Time is " + t);
		println("Time is " + t);
	}
}
