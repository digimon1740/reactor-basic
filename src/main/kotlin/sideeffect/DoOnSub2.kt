package sideeffect

import reactor.core.publisher.Flux

fun main() {
    Flux.just("red", "blue")
        .log()
        .doOnSubscribe { subscription ->
            subscription.request(1)
            subscription.cancel()
            println("doOnSubscribe is called")
        }
        .map {
            it.toUpperCase()
        }
        .subscribe(::println)
}