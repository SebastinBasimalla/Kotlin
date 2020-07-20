package basic.oo

//Genearte HashCode() equals() toString() copy() destructing operator()
data class Address(val street: String, val number: Int, val postalCode: String, val city: String){

}

class AddressOne(val street: String, val number: Int, val postalCode: String, val city: String){

}


fun main(args: Array<String>){

    val residance = Address("Main Street ",400089,"1234", "Austin")
    val residance2= Address("Main Street ",400089,"1234", "Austin")
    val residance3 = AddressOne("Main Street ",400089,"1234", "Austin")

    //to string
    println("Object Cehck "+residance)

    println("Object Cehck New "+residance3)

    //referential equality
    println("referential equality ")
    println(residance===residance2)

    //structural equality
    println("structural equality")
    println( residance==residance2 )

    //copy -- Java Clone menthod
    val neighbour = residance.copy(number=43)
    println("Copy method "+neighbour)

    //Destructing  operator
    val add= residance.component1()

    println("Add value is "+add)

    val (street,number,postcode,city) = residance

    println("$street,$number,$postcode,$city")


}