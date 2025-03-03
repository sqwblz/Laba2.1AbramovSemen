//Вычисление логических выражений
fun main() {
    // Первое множество выражений
    val A = true
    val B = false
    val C = false

    println("Иходя из приложенных данных:")
    println("1. a) ${A || B}")
    println("2. b) ${A && B}")
    println("3. c) ${B || C}")

    // Второе множество выражений
    val X = false
    val Y = true
    val Z = false
    println("Иходя из приложенных данных:")
    println("2. a) ${X || Z}")
    println("2. b) ${X && Y}")
    println("2. c) ${X && Z}")

    // Третье множество выражений
    println("Иходя из приложенных данных:")
    println("3. a) ${!A && B}")
    println("3. b) ${A || !B}")
    println("3. c) ${A && B || C}")

    // Четвертое множество выражений
    val XA = true
    val YA = true
    val ZA = false
    println("Иходя из приложенных данных:")
    println("4. a) ${!XA && YA}")
    println("4. b) ${XA || !YA}")
    println("4. c) ${XA || (YA && ZA)}")

    // Пятое множество выражений
    println("Иходя из приложенных данных:")
    println("5. a) ${!XA && YA}")
    println("5. b) ${XA || !YA}")
    println("5. c) ${XA || (YA && ZA)}")
    // Шестое множество выражений
    val XX = false
    val YY = false
    val ZZ = true
    println("Иходя из приложенных данных:")
    println("6. a) ${XX || (YY && !ZZ)}")
    println("6. б) ${XX && !YY || ZZ}")
    println("6. в) ${!XX && !YY}")
    println("6. г) ${XX && (!YY || ZZ)}")
    println("6. д) ${!(XX && ZZ) || YY}")
    println("6. е) ${XX || !(YY || ZZ)}")
    // Седьмое множество выражений
    println("Иходя из приложенных данных:")
    println("7. a) ${A ||  !(A && B) || C}")
    println("7. б) ${!A || A && (B || C)}")
    println("7. в) ${(A || (B && !C)) && C}")
}
