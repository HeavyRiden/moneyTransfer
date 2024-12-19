fun main() {

    val amount: Int = 100000;
    val comissionPersent: Int = 75;

    var result: Int = amount * comissionPersent / 10000;

    if(result < 35) result = 35;

    println(result)
}