fun main() {

    Grade(60) // nilai 60 : Memuaskan
    Grade(80) // nilai 80 : Memuaskan
    Grade(30) // nilai 30 : tidak lulus
    Grade(90) // nilai 90 : Sangat Memuaskan
    Grade(95) // nilai 95 : terpuji
    Grade(120) // nilai 120 : nilai tidak valid

}

fun Grade(nilai : Int)  {

    when {
        nilai >= 60 && nilai <= 80 -> {
            //other statement
            println("nilai $nilai : Memuaskan")
        }
        nilai > 80 && nilai <= 90 -> {
            //other statement
            println("nilai $nilai : Sangat Memuaskan")
        }
        nilai in 91..100 -> {
            //other statement
            println("nilai $nilai : terpuji")
        }
        nilai in 0..60 -> {
            //other statement
            println("nilai $nilai : tidak lulus")
        }
        else -> {
            //other statement
            println("nilai $nilai : nilai tidak valid")
        }
    }

}