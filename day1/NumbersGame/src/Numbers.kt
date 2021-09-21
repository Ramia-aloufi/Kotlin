fun main(){
    val secretnum = 7
    var usernum = 0
    print("Guess a number between 0 and 10 ")
    try {
        usernum = readLine()!!.toInt()
        if(usernum < 0 || usernum > 10){
            print("number not between 0 and 10 ")
        }

    } catch (e: Exception) {
        println("Guess a number between 0 and 10")
    }

    if(usernum == secretnum){
        println("You got it...")

    }else{
        println("Wrong guess!")

    }
    println("Game Over!")

}