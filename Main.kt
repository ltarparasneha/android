fun main() {
    println("1(+)addition:")
    println("2(-)sub:")
    println("3(*)mul:")
    println("4(/)div:")
    print("enter your choice:")
    val ch= readln().toInt()

    print("enter your first number:")
    val a= readln().toInt()

    print("enter your second number:")
    val b= readln().toInt()

    when(ch){
        1->println("addition is:"+(a+b))
        2->println("sub is:"+(a-b))
        3->println("mul is:"+(a*b))
        4->println("div is:"+(a/b))
    }


}