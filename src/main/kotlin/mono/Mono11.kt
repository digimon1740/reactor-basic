package mono

import reactor.core.publisher.Mono

fun main() {
    Mono.just("Reactive World")
        .flatMap {
            if (it.contains("Hello")) {
                Mono.just(it)
            } else {
                Mono.empty()
            }
        }.subscribe(::println)
}