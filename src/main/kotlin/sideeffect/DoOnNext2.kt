package sideeffect

import reactor.core.publisher.Flux
import java.util.concurrent.atomic.AtomicInteger

fun main() {
    val counter = AtomicInteger()

    Flux.range(1, 5)
        .log()
        .doOnNext {
            counter.incrementAndGet()
            println("카운터 증가")
        }
        .subscribe()

    println("총 개수 : ${counter.get()}")
}