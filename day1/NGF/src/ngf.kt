import kotlin.random.Random

fun main(){
    var n = 3
    var rr = 0
    while(n > 0){
        val randomNumber = Random.nextInt(0, 10)
        print("Guess a number between 0 and 10 ")
        try {
            var usernum = readLine()
            if(usernum == "quit"){
                break
            }
            else if(usernum!!.toInt() < 0 || usernum!!.toInt() > 10){
                print("number not between 0 and 10 ")
                rr = usernum!!.toInt()
            }

            if(rr == randomNumber){
                println("You got it...")
                break

            }else{
                println("Wrong guess!")
            }

        } catch (e: Exception) {
            println("Guess a number ")
            n++
        }
        n--;
    }

    println("Game Over!")
}