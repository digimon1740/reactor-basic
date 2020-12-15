package flux

import reactor.core.publisher.Flux

fun main() {
    val flux = Flux.just("one", "two", "three")
        .take(1)
        .single()

    flux.subscribe(::println)
}