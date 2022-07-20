import java.util.Date
import kotlin.math.PI

fun main(){
    println("Hello KotlinVerse!")

//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()

//    println("a + b = $a$b")

//    val n = 0
//    println("(n + 1) = " + n + 1)

//    var sum = 1
//    sum += 2
//    sum += 3
//    println("sum = $sum")

//    var a = 1
//    println(a++)
//    println(++a)
//    println(a--)
//    println(--a)

    val name = "Jungho"
    println("Hello, $name!\n Today is ${Date()}")

    println("Enter radius : ")
    val radius = readLine()!!.toDouble()
    println("Circle area : ${circleArea(radius)}")
}

fun circleArea(radius: Double): Double {
    return PI * radius * radius
}