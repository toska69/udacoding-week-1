fun main() {

    val tempat : Array<String> = arrayOf("udacoding","tempat 2","tempat 3","tempat 4","tempat 5")

    check(tempat)

}


private fun check (tempat : Array<String>)  {

    for (i in tempat){
        if (i=="udacoding"){
            println("$i : nah ini belajar coding yang keren ")

        } else {
            println(" $i")
        }
    }

}