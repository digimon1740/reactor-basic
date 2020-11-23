package mono

import reactor.core.publisher.Mono

fun main() {
    val greeting: String? = null
    Mono.justOrEmpty(greeting)
        .defaultIfEmpty("Hello Reactive World")
        .subscribe(::println)
}