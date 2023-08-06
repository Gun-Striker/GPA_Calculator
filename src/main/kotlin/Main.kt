fun main() {
    println("Enter your number:")
    val num:Float = readln().toFloat()

    if (num > 100) {
        println("Invalid Number! Enter a number between 0-100.")
    }
    else if(num>=80) {
        println("Grade: A+ \nGPA: 5.00")
    }
    else if (num>=70){
        println("Grade: A \nGPA: 4.00")
    }

    else if (num>= 60) {
        println("Grade: A- \nGPA: 3.5")
    }

    else if (num>=50) {
        println("Grade: B \nGPA: 3.00")
    }

    else if (num>=40){
        println("Grade: C \nGPA: 2.00")
    }

    else if (num>=33) {
        println("Grade: D \nGPA: 1.00")
    }

    else {
        println("Grade: F \nGPA: 0.00 \n \nYOU FAILED!")
    }
}