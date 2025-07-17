fun main() {
    print("enter distance between two cities in kilometer:")
    val km = readln()
    val kilo=km.toDouble()
    val meter=kilo*1000
    val centimeter=meter*100
    val feet=meter*30
    val inche=meter*39
    println("\n distance conversion")
    println("$kilo km=$meter")
    println("$kilo km=$centimeter")
    println("$kilo km=$feet")
    println("$kilo km=$inche")


}