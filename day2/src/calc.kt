fun main() {
    while(true) {
        print("Enter your first num >> ")
        var a = 0
        var b = 0
        try {
            var aa = readLine()!!.toInt()
            a = aa
        } catch (e: Exception) {
        }
        print("Enter your second num >> ")
        try {
            var bb = readLine()!!.toInt()
            b = bb
        } catch (e: Exception) {
        }
        var c = a + b
        println("$a + $b = $c")


        print("Would you like to add more number (y/n) >> ")

        var dd = readLine()
        if (dd == "n") {
          break
        }
    }





}