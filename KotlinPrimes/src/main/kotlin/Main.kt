fun primes() = sequence {
    for (i in 2..Int.MAX_VALUE) {
        var isPrime = true
        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) yield(i)
    }
}

fun main() {

    println(primes().take(100).toList())

    println(primes().takeWhile { it < 100 }.toList())

}


