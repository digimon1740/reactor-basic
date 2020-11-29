package mono

import reactor.core.publisher.Mono

fun main() {
    val mono: Mono<String> =
        Mono.just("Hello Reactive World")
            .filter {
                it.startsWith("Bye")
            }
            .map {
                "this operator is working"
            }
            .switchIfEmpty(Mono.defer {
                Mono.just("switchIfEmpty is working")
            })
    mono.subscribe(::println)
}