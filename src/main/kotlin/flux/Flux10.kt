package flux

import reactor.core.publisher.Flux

fun main() {
    val three = Flux.just("three")
    val two = Flux.just("two")
    val one = Flux.just("one")

    val flux: Flux<String> = Flux.merge(three, two, one)
    flux.subscribe(::println)
}