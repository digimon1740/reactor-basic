package flux

import reactor.core.publisher.Flux

fun main() {
    val flux = Flux.just(1, 2, 3, 4, 5, 6)
        .take(2)
        .single()

    flux.subscribe(::println)
}