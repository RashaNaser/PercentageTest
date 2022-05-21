fun main() {
}

fun percentageOfCharacterA(list: List<String>): Double {
    if (list.isEmpty()) return -1.0

    var counter = 0.0
    list.forEach {
        if (it.lowercase() != "a" && it.lowercase() != "b") return -1.0
        else if (it.lowercase() == "a") counter++
    }
    return String.format("%.1f", counter / list.size * 100).toDouble()
}