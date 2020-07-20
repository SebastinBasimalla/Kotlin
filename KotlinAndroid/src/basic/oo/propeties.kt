package basic.oo

class City {


    var name: String =""


    var population: Int = 0

    lateinit var capital : String

    var size: String = "XL"
}

fun main(args: Array<String>){

    println("I am in City")
    val german_city = City()
    german_city.name= "Berlin"
    german_city.population= 3_000_000
    german_city.capital="Bayen"

    println("Germain City name= "+german_city.name)
    println("German City Population= "+german_city.population)
    println("German City Capital= "+german_city.capital)

}