fun main() {
//    Options of choosing calculator
    println("Choose an option:\n\n1.Single Subject GPA\n2.Average GPA")
    val choice:Int = readln().toInt()
//    Single Subject GPA Calculation
    if (choice==1) {

        println("Enter your number:")
        val num: Float = readln().toFloat()

        if (num > 100) println("Invalid Number! Enter a number between 0-100.")
        else if (num >= 80) println("Grade: A+ \nGPA: 5.00")
        else if (num >= 70) println("Grade: A \nGPA: 4.00")
        else if (num >= 60) println("Grade: A- \nGPA: 3.50")
        else if (num >= 50) println("Grade: B \nGPA: 3.00")
        else if (num >= 40) println("Grade: C \nGPA: 2.00")
        else if (num >= 33) println("Grade: D \nGPA: 1.00")
        else println("Grade: F \nGPA: 0.00 \n \nYOU HAVE FAILED!!")
    }

// Average GPA caculation

    else if (choice == 2) {
        println("Enter your total subjects: ")
        val subNum:Int = readln().toInt()
        var i = 0
        var sumOfSub:Float
        var avgGPA = 0F
    // sum of all subjects
        while (i < subNum) {
            println("Enter your marks: ")
            sumOfSub = readln().toFloat()
            avgGPA += sumOfSub
            i++
        }
        avgGPA /= subNum
        println("Your average GPA is: $avgGPA")
    }
}