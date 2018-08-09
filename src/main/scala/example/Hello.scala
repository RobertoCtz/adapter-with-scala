object adapterDesign{
  def main(args: Array[String]): Unit = {
    implicit def fahrenheit2Celsius(fahrenheit: Fahrenheit): Celsius =
       new Celsius((fahrenheit.degrees - 32) * 5/9)

    new AirConditioner().setTemperature(new Fahrenheit(75))
  }
}

case class Celsius(degrees: Double)
case class Fahrenheit(degrees: Double)

class AirConditioner{
  def setTemperature(celsius: Celsius) = println(s"Set to ${celsius.degrees}")
}
