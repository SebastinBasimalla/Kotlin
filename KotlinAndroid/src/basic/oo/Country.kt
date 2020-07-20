package basic.oo

class Country (val name: String, val  areaSqrt: Int){

    //telescopic pattern
    constructor(name: String):this(name,0){
        println("Constructor called")
    }

    fun print() = "$name, $areaSqrt Km^2"
    /** we can use
    init {

    }
    **/
}


class ABC(val name: String, val size: String){

    constructor(name: String):this(name,"")
}


fun main(args: Array<String>){
    val  countyrAus= Country("Austraila", 75_000_000)
    println("Country name is "+countyrAus.name)
    println("Country areaSqrt is "+countyrAus.areaSqrt)
    println("COnstructor print "+countyrAus.print())

    val countrySpain = Country("Spain")
    println("Other Country name "+countrySpain.name)
    println("Other Country area "+countrySpain.areaSqrt)

}
