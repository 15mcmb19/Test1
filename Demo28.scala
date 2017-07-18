object Demo28	{
	def main(args:Array[String])	{
		val fruit1: List[String] = "apples" :: ("oranges" :: Nil);
		val fruit2: List[String] = "Gauva"  :: ("papaya" :: Nil);
		
		var fruit = List.concat(fruit1, fruit2);
		println("concat:"+fruit);
		fruit = fruit1 ::: fruit2 ;
		println(":::"+fruit)
		fruit = fruit1 .::: (fruit2);
		println(".:::"+ fruit);
		//fruit = fruit1.:::(fruit2)
      		//println( "fruit1.:::(fruit2) : " + fruit )

		}
		}
