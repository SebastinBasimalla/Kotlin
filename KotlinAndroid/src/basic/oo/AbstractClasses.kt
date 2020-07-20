package basic.oo
//No instance of SahpeOne Class
abstract class ShapeOne(val name: String){

    //this method cannot be called only access from object
    abstract  fun area(): Double
}

class CircelOne(name: String , val radius: Double ): ShapeOne(name){
    override fun area(): Double = Math.PI* Math.pow(radius,2.0)
}

fun main(args: Array<String>){

    //Can call CircleOne but not ShapeONe
    val shape= CircelOne("Large Circle",17.5)

    println(shape.area())
}