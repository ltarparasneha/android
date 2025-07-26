//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

        print("Enter a string: ")
        val a = readLine() ?: ""
        val b = a.split("<u>","</u>")
        var j=0
        for(i in b)
        {
            j++
            if(j%2!=0) {
                print(i)
            }
            else
            {
                print(i.uppercase())
            }


        }

    }
//this <u>is</u> not a <u>garden</u>
