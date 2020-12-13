package flux

import reactor.core.publisher.Flux

fun main() {
    val buffer: Flux<List<Int>> =
        Flux.range(1, 100)
            .take(10)
            .buffer(4)

    buffer.subscribe(::println)
}