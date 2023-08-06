fun main() {
    println("Enter your number:")
    val num:Int = readln().toInt()

    if(num>=80) {
        println("Grade: A+")
        println("GPA: 5.00")
    }
    else if (num>=70){
        println("Grade: A")
        println("GPA: 4.00")
    }

    else if (num>= 60) {
        println("Grade: A-")
        println("GPA: 3.5")
    }

    else if (num>=50) {
        println("Grade: B")
        println("GPA: 3.00")
    }

    else if (num>=40){
        println("Grade: C")
        println("GPA: 2.00")
    }

    else if (num>=33) {
        println("Grade: D")
        println("GPA: 1.00")
    }
    else {
        println("Grade: F")
        println("GPA: 0.00")
        println(" ")
        println("YOU FAILED!")
    }
}