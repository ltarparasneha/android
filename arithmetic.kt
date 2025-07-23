fun main() {
    println("1(+)addition:")
    println("2(-)sub:")
    println("3(*)mul:")
    println("4(/)div:")
    print("enter your choice:")
    val ch = readln().toInt()

    print("enter your first number:")
    val a = readln().toInt()

    print("enter your second number:")
    val b = readln().toInt()

    if(a==1)
    {
        println("addition is:"+(a+b))
    }
    else if(a==2)
    {
        println("sub is:"+(a-b))
    }
    else if(a==3)
    {
        println("mul is:"+(a*b))
    }
    else
    {
        println("div is:"+(a/b))
    }
}