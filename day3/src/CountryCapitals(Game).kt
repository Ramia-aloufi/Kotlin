import kotlin.random.Random

fun main(){
    var score = 0
    class Country(val name:String, val capital:String){
        fun print(){
            println("the capital of $name is $capital")
        }
    }

    var hh = listOf<Country>(
        Country("saudi","riyadh"),
        Country("turkia","Istanbuls"),
        Country("india","india"),
        Country("qatar","doha"),
        Country("bahrin","manama"),
        Country("emarat","abodhabi"),
        Country("kwait","kwait"),
        Country("lebanon","berout"),
        Country("us","Washington "),
        Country("uk","lonLondon ")
    )
    fun question(){
        var cc = hh[Random.nextInt(hh.size)]
        var name = cc.name
        var capital = cc.capital
        println("What is the capital for $name")
        var rr = readLine()!!.toString().lowercase()
        if(rr == capital){
            println("Awesom..")
            score += 1


        }else{
            println("wrong..")
            cc.print()
        }
    }
for(i in 0..2){
    question()
}

    while (true){
        print("Continu play (y/n)>> ")
        var qq = readLine()
        if(qq == "n"){
            break
        }
        question()
    }
    println("your score = "+ score)
}