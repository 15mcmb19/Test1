import java.util.Date
object Demo11	{
	def main(args: Array[String])	{
		var date = new Date;
		log(date, "Message1");
		
		Thread.sleep(1000);
		
		log(date, "Message2");
		Thread.sleep(1000);
		
		log(date, "Message3");
		}
	def log(date: Date, message: String) = {
		println(date + "____" + message)
	}
}
