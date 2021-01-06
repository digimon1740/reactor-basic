package sideeffect

import reactor.core.publisher.Flux

fun main() {
    Flux.range(1, 5)
        .log()
        .doOnNext {
            println("통지된 값 : $it")
        }
        .subscribe()
}