package mono

import reactor.core.publisher.Mono

fun main() {
    val mono: Mono<String> = Mono.justOrEmpty("Hello Reactive World")
    mono.subscribe(::println)
}