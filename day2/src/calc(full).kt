fun main(){
    while (true){

        var a = 0
        var b = 0
        var rr = 0.0



        print("Enter your first num >> ")
        try {
            var aa = readLine()!!.toInt()
            a = aa
            println("$a")
        } catch (e: Exception) {
        }

        print("Enter your operation >> ")
        var o = readLine()
        println("$a $o")

        print("Enter your second num >> ")
        try {
            var bb = readLine()!!.toInt()
            b = bb
        } catch (e: Exception) {
        }

        try {
            var x = a.toDouble()
            var y = b.toDouble()


            var r = when (o) {
                "+" -> x + y
                "-" -> x - y
                "*" -> x * y
                "/" -> x / y
                else -> throw Exception("Invalid operator")
            }
            rr = r
            println("$a $o $b = $rr")
            break
        }catch(e: Exception){
            println("cant devided by 0")
        }






    }
}
