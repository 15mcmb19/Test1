import java.util.Date
object Demo12	{
	def main(args: Array[String])	{
	val date = new Date;
	val logBoundWithDate = log(date, _:String,_:Int,_:Int);
	Thread.sleep(1000);
	logBoundWithDate("message1",3,5);
	Thread.sleep(1000);
	logBoundWithDate("message2",6,9);
	Thread.sleep(1000);
	logBoundWithDate("message3",7,9);
	}
	def log(date: Date, message: String, a: Int, b: Int)	{
		var sum: Int = 0;
		sum = a + b;
		println(date+"_____"+message);
		println(+a,+b,+sum);
	}
}
