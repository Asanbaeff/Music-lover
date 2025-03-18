fun main() {
    val amount = 10000
    val isRegularCustomer = true

    val basicDiscount = if (amount > 1 && amount < 1000) {     //базовая скидка
        0
    } else if (amount > 1001 && amount < 10000) {
        100
    } else if (amount >= 10000) {
        (amount * 0.05).toInt()
    } else {
        0
    }

    val regularDiscount = if (isRegularCustomer) {              //постоянного покупателя скидка
        ((amount - basicDiscount) / 100).toInt()
    } else {
        0
    }

    val discount = basicDiscount + regularDiscount             //скидка вся

    println("Сумма покупки: $amount рублей")
    println("Сумма базовой скидки: $basicDiscount рублей")
    println("Скидка постоянного покупателя : $regularDiscount рублей")
    println("Размер скидки: $discount рублей")
}

