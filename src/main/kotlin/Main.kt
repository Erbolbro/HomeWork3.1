import java.util.Scanner

fun main(args: Array<String>) {
    val userInfo = User(username = "Beka", email = "beka@gmail.com",17,12345678)
    val scanner=Scanner(System.`in`)
    println("login")
    println("Input username:")
    val userName = scanner.nextLine()
    println("Input email")
    val email=scanner.nextLine()
    println("Input Age")
    val age = scanner.nextInt()
    println("Input password")
    val password = scanner.nextInt()

    val inputUserModel = User(userName,email,age,password)
    userInfo.verify(inputUserModel)
}