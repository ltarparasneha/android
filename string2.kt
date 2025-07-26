fun main() {

    print("Enter a string: ")
    val a = readLine() ?: ""
    val b = a.split(" ")
    var count=0
    for(i in b)
    {
        if(i=="is")
        {
            count++
        }

    }
    println("total count:$count")
}