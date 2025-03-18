fun main() {
    val amount = 5000
    val isRegularCustomer = true
    val discount = calculationDiscount(amount, isRegularCustomer)
    println("Сумма покупки: $amount рублей")
    println("Размер скидки: $discount рублей")

}

fun calculationDiscount(amount: Int, isRegularCustomer: Boolean): Int {
    return when {
        amount in 1..1000 -> 0
        amount in 1001..10000 -> 100
        amount > 10000 -> (amount * 0.05).toInt()
        else -> 0
    } + if (isRegularCustomer) (amount / 100).toInt() else 0
}