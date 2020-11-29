package mono

import reactor.core.publisher.Mono

fun main() {
    val mono: Mono<String> =
        Mono.just("Hello Reactive World")
            .filter {
                it.startsWith("Hello")
            }
            .map {
                "this operator is working"
            }
    mono.subscribe(::println)
}