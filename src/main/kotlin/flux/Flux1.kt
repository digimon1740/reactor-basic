package flux

import reactor.core.publisher.Flux

fun main() {
    val flux: Flux<String> =
        Flux.just("Hello", "Reactive", "World")

    flux.subscribe(::println)
}