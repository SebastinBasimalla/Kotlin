package basic.oo

//Minimum Example
open class Base

class Child : Base ()

//open class Shape (open val name: String){
open class Shape (val name: String){

    open fun area()= 0.0
}

//class Circle (override val name: String , val radius : Double ): Shape(name){
class Circle (name: String , val radius : Double ): Shape(name){

    override fun area() =Math.PI * Math.pow(radius,2.0)

}

fun main(args: Array<String>){
    val smallCircle= Circle("small Circle", 2.0)
    println("Circle name "+smallCircle.name)
    println("Circle radius "+smallCircle.radius)
    println("Circle area "+smallCircle.area())
}