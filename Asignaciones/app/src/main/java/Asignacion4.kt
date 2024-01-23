class Asignacion4 {
    /**
     * Practica: Cadena Fina
     * Nombre: Luis Pablo Ayon Figueroa
     * ID: 00000233145
     */

    fun String.esFina(): Boolean {
        var condiciones = 0
        if(!this.contains("bu") && !this.contains("ba") && !this.contains("be"))
        {
            condiciones += 1
        }

        val vocales = this.count { it.toLowerCase() in "aeiou" }
        if(vocales >= 3)
        {
            condiciones +=1
        }

        if(this.windowed(2).any { it[0] == it[1] })
        {
            condiciones +=1
        }

        return condiciones>=2

    }

    fun main(args: Array<String>) {
        println("bac".esFina())//false
        println("aza".esFina())//false
        println("abaca".esFina())//false
        println("baaa".esFina())//true
        println("aaab".esFina())//true

    }
}