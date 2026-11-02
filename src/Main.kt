fun seed(): String = "nikitalevakov2019-wq"   // <-- заміни на свій GitHub username

fun labNumber(): Int = 1

fun main(args: Array<String>) {
    println("Лабораторна робота №${labNumber()} користувача ${seed()}")

    var kitty = "Васько"
    kitty += " \uD83D\uDC31"
    val age = 7
    println("Кошеня №1 - $kitty віком $age років")

    val catName: String = "Мурзик \uD83D\uDC08"
    val weight: Float = 3.5f
    println("Кошеня №2 - $catName з вагою $weight кг")

    // Кошеня №3
    val catName3: String = "Рудий \uD83D\uDC06"
    val age3: Int = 6
    val weight3: Double = 8.2
    println("Кошеня №3 - $catName3 віком $age3 років та вагою $weight3 кг")
}
