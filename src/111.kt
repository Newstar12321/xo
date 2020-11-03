fun main(){
    val x = "X"
    val o = "0"

    var turn = 0

    val pole = mutableListOf(

        mutableListOf(" ", " ", " "),
        mutableListOf(" ", " ", " "),
        mutableListOf(" ", " ", " ")
    )
    while (true){
        if (turn == 2)
            break
        if (turn == 0){
            pole[readLine()!!.toInt()][readLine()!!.toInt()] = o
            turn = 1
        }
        else{
            pole[readLine()!!.toInt()][readLine()!!.toInt()] = x
            turn = 0
        }
        println(pole[0])
        println(pole[1])
        println(pole[2])
        if ((pole[0][0] == o)&&(pole[0][1] == o)&&(pole[0][2] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[1][0] == o)&&(pole[1][1] == o)&&(pole[1][2] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[2][0] == o)&&(pole[2][1] == o)&&(pole[2][2] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[0][0] == o)&&(pole[1][0] == o)&&(pole[2][0] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[0][1] == o)&&(pole[1][1] == o)&&(pole[2][1] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[0][2] == o)&&(pole[1][2] == o)&&(pole[2][2] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[0][0] == o)&&(pole[1][1] == o)&&(pole[2][2] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[0][2] == o)&&(pole[1][1] == o)&&(pole[2][0] == o)) {
            println("победил игрок o")
            turn = 2
        }
        if ((pole[0][0] == x)&&(pole[0][1] == x)&&(pole[0][2] == x)) {
            println("победил игрок x")
            turn = 2
        }
        if ((pole[1][0] == x)&&(pole[1][1] == x)&&(pole[1][2] == x)) {
            println("победил игрок x")
            turn = 2
        }
        if ((pole[2][0] == x)&&(pole[2][1] == x)&&(pole[2][2] == x)) {
            println("победил игрок x")
            turn = 2
        }
        if ((pole[0][0] == x)&&(pole[1][0] == x)&&(pole[2][0] == x)) {
            println("победил игрок x")
            turn = 2
        }
        if ((pole[0][1] == x)&&(pole[1][1] == x)&&(pole[2][1] == x)) {
            println("победил игрок x")
            turn = 2
        }
        if ((pole[0][2] == x)&&(pole[1][2] == x)&&(pole[2][2] == x)) {
            println("победил игрок x")
            turn = 2
        }
        if ((pole[0][0] == x)&&(pole[1][1] == x)&&(pole[2][2] == x)) {
            println("победил игрок x")
            turn = 2
        }
        if ((pole[0][2] == x)&&(pole[1][1] == x)&&(pole[2][0] == x)) {
            println("победил игрок x")
            turn = 2
        }
    }

}