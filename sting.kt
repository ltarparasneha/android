fun main() {
    print("enter a string:")
    val a= readln()
    print("enter a substring:")
    val b= readln()
    val l=b.length
    val r="*".repeat(b.length)
    var c=a?.replace(b?:"","*")
    print(c)
}