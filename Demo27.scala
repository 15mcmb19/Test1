object Demo27	{
	def main(args: Array[String])	{
		val fruit: List[String] = "apples" :: ("orange" :: ("jackfruit" :: Nil));
		val nums = Nil;
		
		println("The head of the fruit is:" +fruit.head);
		println("The other fruits are:" +fruit.tail);
		println("check if the empty is empty or not:" +nums.isEmpty);
		println("check if the fruit is empty or not:" +fruit.isEmpty);
		}
		}
