fun main(){

    val country = listOf<String>("ksa","us","uk")
    var all = arrayListOf<ArrayList<String>>()


    for (i in country){
        println("write the capital for "+ i)
        var qq = readLine()!!.toString()
        all.add(arrayListOf("$i", "$qq"))

    }
    for(i in all){
        println(i)
    }
}