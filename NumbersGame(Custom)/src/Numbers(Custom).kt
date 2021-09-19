fun main(){

    var kk = 7
    var oo = 0
    var ll = 0
    var tt = 0

    try {
        print("Enter your first number ")
        var rr = readLine()!!.toInt()
        oo = rr

    } catch (e: Exception) {
        println("number!")
    }
        try{
        print("Enter your second number ")
        var nn = readLine()!!.toInt()
        ll = nn
        } catch (e: Exception) {
            println("number!")
        }
        tt = oo * kk + ll
        println("$oo * x + $ll = $tt ")
        print("What is x >> ")

        var aa = readLine()!!.toInt()
        if (aa == kk) {
            println("You got it !")
        } else {
            println("Wrong!")
        }

}