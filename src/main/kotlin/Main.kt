package ru.netology
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Введите сумму трат")
    val spending = Integer.parseInt(scanner.nextLine())
    println("Вы постоянный покупатель? Да/Нет")
    val checker = scanner.nextLine()
    val regularCustomerChecker : Boolean = checker == "Да"

    val firstSumToPay = if (spending <= 1000) {
        spending
    } else if ( spending <= 10000){
      spending - (spending/1000*100)
    } else {
        spending - (spending * 0.05)
    }


    val regCustSale = 0.01
    val secondSumToPay = (if (regularCustomerChecker) firstSumToPay.toInt() - (firstSumToPay.toInt()*regCustSale) else firstSumToPay)

    println("С вас $secondSumToPay рублей")

}
