/**
 * File Name:	demo_ParseFilterAverage.scala
 * Author:		Victor David Sanchez, Ph.D.
 * Description:	Scala demo used to parse file lines, filter
 *              floating numbers included, and average their 
 *				values. Arguments passed are input and output
 *              file names
 */

////////////////////
// Constant values
////////////////////

object Configuration {
  ...
}

////////////////////
// Main object
////////////////////

object demo_ParseFilterAverage extends App {
  import scala.io.Source	// to read from file
  import java.io._			// to write to file
  
  val listOfLines = Source.fromFile(args(0)).getLines.toList
  val writer = new BufferedWriter(new FileWriter(args(1)))
  
  // generic average function
  def average[T]( ts: Iterable[T] )( implicit num: Numeric[T] ) = {
    num.toDouble( ts.sum ) / ts.size
  }
  
  // main function
  def demo_ParseFilterAverage(str: String): Float = {
    val ave = average(
	          str.replaceAll(Configuration.NON_FLOAT_CHAR, 
	          Configuration.EMPTY_CHAR).
              trim.
			  split(" +").
			  map(_.toFloat)
			  ).toFloat
    return ave
  }

  // display results in console
  for (elem <- listOfLines) 
    println("Average: " + 
    "%10.4f".format(demo_ParseFilterAverage(elem)) + 
	" String: " + 
	elem)

  // write results to file
  for (elem <- listOfLines) 
    writer.write("Average: " + 
    "%10.4f".format(demo_ParseFilterAverage(elem)) + 
	" String: " + 
	elem + 
	"\n")
  writer.close()
}
