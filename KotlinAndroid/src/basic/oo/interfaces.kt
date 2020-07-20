package basic.oo
//Override Rule
//
interface Driveable{
    //val a: Int
    fun drive(){

        println("Driveable ")
    }

}

class Bicycle : Driveable{
  //  override val a: Int
  //      get() = 42

    override fun drive() {
       println("Driving Bicycle")
    }


}

class Boat: Driveable{
    //override val a: Int
    //    get() = 37

    override fun drive() {
        println("Driving boat ")
    }


}

fun main(args: Array<String>){
    val driveable: Driveable =Bicycle()
    driveable.drive()

}