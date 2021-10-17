import java.util.*
import java.math.BigDecimal

fun main(args: Array<String>) {

    var x = readLine().toString()
    var f1 = x.split(" ")[0].toDouble()
    var f2 = x.split(" ")[1].toDouble()

    var calculo = ((1 + (f1 / 100)) * (1 + f2 / 100) - 1) * 100

    println(BigDecimal(calculo).setScale(6, BigDecimal.ROUND_HALF_UP))

}