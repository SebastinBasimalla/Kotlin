package basic.oo

/****
fun Int.isEven() = (this % 2 == 0)

fun City.isLarge() = population > 1_00_000

fun main(args: Array<String>){

   println(5.isEven())

    val  naturals = listOf(2,5,8,7,6)

    println(naturals.filter { it.isEven() })

    val cityInUS = City()
    cityInUS.name="Austin"
    cityInUS.population = 95_00_000

    println(cityInUS.isLarge())
}
        ***/



fun Int.isEven(): Boolean  = (this%2==0)
fun String.valueNullCheck() = this.isNullOrBlank()
fun City.isLarge()  = population >1_00_000



fun main(args: Array<String>){

 println("Extension functions ")

 println("Testing "+7.isEven())
 "".valueNullCheck()

 val anycity= City()
 anycity.population=2_00_000
 println("Poplucation Chejck "+anycity.isLarge())

}