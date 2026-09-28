object PolynomialCalculation {

  def main(args: Array[String]): Unit = {

    // Input numbers
    val numbers = List(2, 4, 5)

    // Maximum degree
    val degree = 3

    // Generate polynomial features
    val features = numbers.flatMap { number =>
      (1 to degree).map { power =>
        Math.pow(number, power).toInt
      }
    }

    // Display original data
    println("Original Data:")
    println(numbers)

    println(s"\nPolynomial Degree: $degree")

    // Display polynomial values for each number
    println("\nPolynomial Features:")

    numbers.foreach { number =>

      val values = (1 to degree).map { power =>
        Math.pow(number, power).toInt
      }

      println(s"$number -> ${values.mkString(", ")}")
    }

    // Display final feature list
    println("\nFinal Feature List:")
    println(features)
  }
}
