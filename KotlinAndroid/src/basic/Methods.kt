package basic

class Robots(val name: String){

    fun greetHumans(){
        println("Hello Humans My name is $name")
    }

    fun knowsName(): Boolean = name.isNotBlank()

}

fun Int.isEven(): Boolean = (this %2 ==0)

fun Country.isLarge(): Boolean = aresqrt >10_000_000


fun main(args: Array<String>){

    val fighterRobot= Robots("FighterRobot")
    if(fighterRobot.knowsName()){
        fighterRobot.greetHumans()
    }

    println("Number Check "+5.isEven())

    val NewCity= Country("SebasLan",10_000_001)
    println("Cehck if Country is Large "+NewCity.isLarge())


}