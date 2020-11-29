package mono

import reactor.core.publisher.Mono

fun main() {
    val mono: Mono<String> =
        Mono.just("Hello Reactive World")
            .map {
                it.toLowerCase()
            }
    mono.subscribe(::println)
}