package demos

import org.saddle.io.CsvFile
import org.saddle.io.CsvParser

object App {

  def main(args: Array[String]) {

    val file = CsvFile("c:/input/abc.csv");
    val frame = CsvParser.parse(file);
    println(frame.getClass());
    println(frame);
    println(frame.head(10))
    println(frame.tail(10));
    println("Hello World!")
  }

}
