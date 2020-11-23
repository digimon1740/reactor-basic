package mono

import reactor.core.publisher.Mono

fun main() {
    val greeting: String? = null
    Mono.justOrEmpty(greeting)
        .switchIfEmpty(Mono.defer {
            Mono.just("Hello Reactive World")
        })
        .subscribe(::println)
}