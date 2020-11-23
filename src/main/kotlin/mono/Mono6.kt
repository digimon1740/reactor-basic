package mono

import reactor.core.publisher.Mono

fun main() {
    val greeting = "Hello"
    Mono.justOrEmpty(greeting)
        .switchIfEmpty(Mono.defer {
            greetIfEmptyInDefer()
        })
        .subscribe(::println)
}

fun greetIfEmptyInDefer(): Mono<String> {
    val greeting = "Hello Reactive World"
    println(greeting)
    return Mono.just(greeting)
}