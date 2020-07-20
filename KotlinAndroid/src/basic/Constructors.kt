package basic

import java.lang.constant.Constable

class Country(val name: String, val aresqrt: Int) {

    constructor(name: String):this(name,0)

}





fun main(args: Array<String>){

    println("Running main ")
    val FirstCountryName= Country("SebastinLand",1_000_000)
    println("First Counrt name "+FirstCountryName.name)
    println("First Country name "+FirstCountryName.aresqrt)

    val SecondConutryName= Country("Spain")
    println("Second Country name "+SecondConutryName.name)
    println("Second Country area "+SecondConutryName.aresqrt)


}