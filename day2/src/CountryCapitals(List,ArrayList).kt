fun main(){
    var i = 0
    var arr = ArrayList<String>()
    val countries = listOf("Saudia", "India", "Kwait")
    while(i < countries.count() ){
        println("write Capital for  "+countries[i])
        var aa = readLine()!!.toString()
        arr.add(aa)
        i++
        
    }


    print(arr)
    print(countries)



}