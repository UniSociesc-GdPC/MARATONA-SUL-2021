import java.util.*

fun main(args: Array<String>) {

    val list: MutableList<Char> = ArrayList()
    list.add('a')
    list.add('e')
    list.add('i')
    list.add('o')
    list.add('u')
    val a = readLine()!!.toInt()
    for (i in 0 until a) {
        var j = 0
        val str = readLine()
        for (c in str!!.toCharArray()) {
            if (list.contains(c.toLowerCase())) {
                j = 0
            } else {
                j++
                if (j == 3) {
                    break
                }
            }
        }
        if (j > 2) {
            println("$str nao eh facil")
        } else {
            println("$str eh facil")
        }
    }

}