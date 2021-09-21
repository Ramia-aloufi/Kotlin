fun main(){
    val cc = mutableMapOf<String, String>()
    for(i in 0..2){
        print("Enter a country")
        var country = readLine()!!.toString()

        print("Enter a capital")
        var capital = readLine()!!.toString()

        cc.put(country,capital)
    }

    for(item in cc){
        println(item)
    }


}