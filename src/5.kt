fun main() {

    val arrayKota = arrayOf("jakarta", "jakarta", "Padang", "Solo", "Padang", "Bandung", "Padang", "Malang", "Bali")

    var counter: Int? = null
    for (i in arrayKota.toSet()) {
        counter = arrayKota.count { it == i }
        println("> $i    \t : $counter")
    }

}
