class Asignacion2 {
    fun List<Int>.customSum(): Int {
        var result = 0
        for (i in this) {
            result += i
        }
        return result
    }

    fun main(args: Array<String>) {
        val sum = listOf(1, 2, 3).customSum()
        println(sum) // 6
    }
}