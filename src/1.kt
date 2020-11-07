fun main() {
    print(angka(7.9,9.7))
}

fun angka (bil1 : Double , bil2 : Double) : String {
    var result  = bil1 + bil2
    return "> $bil1 + $bil2 = $result"
}