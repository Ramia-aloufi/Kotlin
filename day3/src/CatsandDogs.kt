import kotlin.random.Random
fun main() {
    abstract class Animal(name:String,age:Int) {
        abstract fun talk()

    }

    class Dog(val name:String ,val age:Int):Animal(name,age) {
        override fun talk() {
            println("$name:Woof")
        }
    }

    class Cat(val name:String,val age:Int):Animal(name,age) {
        override fun talk() {
            println("$name:Meow")
        }
    }

    var ages = listOf(10,9,8,7,6,5)
    var dogs = listOf<Dog>(
        Dog("Rufus",ages[Random.nextInt(ages.size)]),
        Dog("Fred",ages[Random.nextInt(ages.size)]),
        Dog("Spot",ages[Random.nextInt(ages.size)]),
        Dog("hh",ages[Random.nextInt(ages.size)]),
        Dog("nn",ages[Random.nextInt(ages.size)]),

        )

    var cats = listOf<Cat>(
        Cat("Lili",ages[Random.nextInt(ages.size)]),
        Cat("Meep",ages[Random.nextInt(ages.size)]),
        Cat("Patchy",ages[Random.nextInt(ages.size)]),
        Cat("Furball",ages[Random.nextInt(ages.size)]),
        Cat("Snowball",ages[Random.nextInt(ages.size)]),

        )


    for (i in cats) {
       i.talk()
        for(j in dogs){
            if(i.age <j.age){
                j.talk()
            }
        }

    }




}