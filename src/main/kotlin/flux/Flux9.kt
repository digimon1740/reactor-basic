package flux

import reactor.core.publisher.Flux

fun main() {
    val flux = Flux.just(1, Flux.empty<Int>())
        .singleOrEmpty()

    flux.subscribe(::println)
}