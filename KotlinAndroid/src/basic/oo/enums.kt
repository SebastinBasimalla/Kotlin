package basic.oo

enum class Directions(degree: Double)
{ North(0.0), EAST(90.0),SOUTH(180.0),WEST(270.0)
}

enum class Suits {

    HEARTS,SPADES,DIAMONDS,CLUBS
}

fun main(arsg: Array<String>){

    val suits = Suits.DIAMONDS
    val color = when (suits){
        Suits.HEARTS,Suits.DIAMONDS ->"red"
        Suits.SPADES,Suits.CLUBS ->"black"
    }


    println(color)
}