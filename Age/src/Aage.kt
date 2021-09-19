fun main(){
    val age = 18
    var new = 0
    print("Enter a Your age: ")
    try {
        new = readLine()!!.toInt()

    } catch (e: Exception) {
        println("Please enter numbers only")
    }

    if(new <= age){
        println("You are not old enough..")

    }else{
        println("Welcome!")

    }
}