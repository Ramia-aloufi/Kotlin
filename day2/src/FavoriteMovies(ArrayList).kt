fun main(){
    var i = 0
    var arr = ArrayList<String>()
    println("write favorit movie name")

while(i < 3) {
    var b = readLine()!!.toString()
    arr.add("$b")
    i++
}
    while (true) {

        println("want continue adding (y/n) >> ")

        var tt = readLine()
        if (tt == "n") {
            break
        }
        println("write favorit movie name")
        var b = readLine()!!.toString()
        arr.add("$b")

    }


    for(array in arr){
        println(array)
    }

}


