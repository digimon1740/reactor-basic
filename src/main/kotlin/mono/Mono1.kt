package mono

import reactor.core.publisher.Mono

fun main() {
    val mono: Mono<String> = Mono.just("Hello Reactive World")
    mono.subscribe(::println)
}