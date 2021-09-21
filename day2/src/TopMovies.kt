fun main(){
    var r = 5
    var i = 0
    var arr: Array<String> = Array(r) { "" }
    println("write favorit movie name")
    while (r > 0){

        var b = readLine()
        arr[i] = b.toString()
        i++
        r--
    }
    for(array in arr){
        println(array)
    }

}