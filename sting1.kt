fun main() {
    print("Enter a string: ")
    val a = readLine() ?: ""
    val b = a.split(">")
    for(i in b.indices)
    {
        if(i%2!=0) {
            print(b[i].uppercase())
        }
//        b[i].join()
    }
    //println("Output: $b")
}