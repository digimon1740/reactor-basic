package sideeffect

import reactor.core.publisher.Flux

fun main() {
    Flux.just("red", "blue")
        .log()
        .map {
            it.toUpperCase()
        }
        .subscribe(::println)
}