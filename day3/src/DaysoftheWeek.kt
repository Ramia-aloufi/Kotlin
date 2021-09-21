fun main(){
    var days = mapOf(0 to "sunday", 1 to "Monday", 2 to "Tuesday",
        3 to "wednesday", 4 to "thursday", 5 to "Friday",6 to "satarday")

    for(i in 0.. (days.count() - 1)){
        println(days[i])
    }

}