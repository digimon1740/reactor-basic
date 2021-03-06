package extensions

import reactor.kotlin.core.publisher.toFlux
import reactor.kotlin.core.publisher.toMono

fun main() {
    listOf("A", "B", "C")
        .toFlux()
        .subscribe(::println)

    intArrayOf(1, 2, 3)
        .toFlux()
        .subscribe(::println)

    setOf("D", "E", "F")
        .toFlux()
        .subscribe(::println)

    "MonoToFlux".toMono()
        .toFlux()
        .subscribe(::println)
}

