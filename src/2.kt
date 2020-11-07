fun main() {

    val angka = arrayOf(1,2,3,4,5,6,7,8,9,10)

    checkGenap(angka)

}


private fun checkGenap (deret : Array<Int>)  {
    var result : Int?
    for (i in deret){
        if (i%2==0){
            result = i
            print("$result ")
        }
    }

}
