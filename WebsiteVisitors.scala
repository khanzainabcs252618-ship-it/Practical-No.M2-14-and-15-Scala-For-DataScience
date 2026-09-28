object WebsiteVisitors {

  def main(args: Array[String]): Unit = {


    val visitors = List(
      120, 135, 128, 150, 160,
      155, 170, 180, 175, 190,
      200, 195, 210, 220, 215,
      230, 225, 240, 250, 245,
      260, 270, 265, 280, 290,
      285, 300, 310, 305, 320,
      330, 325, 340
    )


    val timeSeries = visitors.zipWithIndex.map {
      case (value, index) => (index + 1, value)
    }


    println("Daily Website Visitors")
    println("----------------------")

    timeSeries.foreach {
      case (day, count) =>
        println(s"Day $day : $count visitors")
    }


    val totalVisitors = visitors.sum


    val averageVisitors =
      visitors.sum.toDouble / visitors.length


    val maximum = timeSeries.maxBy(_._2)


    val minimum = timeSeries.minBy(_._2)


    println("\nTime Series Analysis")
    println("--------------------")

    println(s"Total Visitors   : $totalVisitors")
    println(f"Average Visitors : $averageVisitors%.2f")
    println(s"Maximum Visitors : Day ${maximum._1} = ${maximum._2}")
    println(s"Minimum Visitors : Day ${minimum._1} = ${minimum._2}")
  }
}
