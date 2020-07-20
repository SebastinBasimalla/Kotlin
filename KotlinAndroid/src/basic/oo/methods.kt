package basic.oo

class Robot (val name: String){

    fun greetHuman(){

        println("HEllo Human,my name is $name")

    }

    fun knowItsName(): Boolean = name.isNotBlank()


}

fun main(args: Array<String>)
{

    val fightRobot = Robot("Destroyer")
    if(fightRobot.knowItsName()){
        fightRobot.greetHuman()
    }
}