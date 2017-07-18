import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
   }
}

object Demo2 {
   def main(args: Array[String]) {
      val point = new Point(10, 20)
     
	Point.move(10,20)
	 printPoint
      def printPoint{
         println ("Point x location : " + point.x);
         println ("Point y location : " + point.y);
	// println ("Point x location : " + point.move.x);
         //println ("Point y location : " + point.move.y);
      }
   }
}
