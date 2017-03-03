import org.apache.spark.SparkConf
import org.apache.spark.examples.streaming.StreamingExamples
import org.apache.spark.sql.SparkSession
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}
import uk.gov.ipt.mi.stream.RDDHelper._

object SocketStreamTest {
  def main(args: Array[String]) {
    if (args.length < 2) {
      System.err.println("Usage: SocketStreamTest <hostname> <port>")
      System.exit(1)
    }

    StreamingExamples.setStreamingLogLevels()

    val sparkConf = new SparkConf().setAppName("SocketStreamTest").setMaster("local")
    val spark = SparkSession.builder.config(sparkConf).getOrCreate()
    val ssc = new StreamingContext(spark.sparkContext, Seconds(1))


    val lines = ssc.socketTextStream(args(0), args(1).toInt, StorageLevel.MEMORY_AND_DISK_SER)
    val words = lines.flatMap(_.split(" "))
    val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)
    lines.savePartition("file:///home/rakesh/Documents/__data/spark/")
    lines.print()
    wordCounts.print()
    ssc.start()
    ssc.awaitTermination()
  }

}

