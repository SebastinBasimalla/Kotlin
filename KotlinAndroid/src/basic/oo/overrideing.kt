package basic.oo

abstract class Vehicle(open val brand: String=""){

    open fun drive(){
        println("Driving")
    }
    abstract fun honk()

}

class Sedan(override val brand : String="BRAND") :  Vehicle(),Driveable{

    override fun drive(){

        super<Driveable>.drive()
    }

    override fun honk() {
        println("honking")
    }


}

fun main(args: Array<String>){

    val sedan = Sedan()
    sedan.drive()
    sedan.honk()


}