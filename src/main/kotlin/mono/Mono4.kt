package mono

import reactor.core.publisher.Mono

fun main() {
    val greeting = "Hello"
    Mono.justOrEmpty(greeting)
        .switchIfEmpty(greetIfEmpty())
        .subscribe(::println)
}

fun greetIfEmpty() : Mono<String> {
    val greeting = "Hello Reactive World"
    println(greeting)
    return Mono.just(greeting)
}