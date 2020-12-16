package flux

import reactor.core.publisher.Flux

fun main() {
    val one = Flux.just("one")
    val two = Flux.just("two")
    val three = Flux.just("three")

    val flux = Flux.merge(one, two, three)
    flux.subscribe(::println)
}