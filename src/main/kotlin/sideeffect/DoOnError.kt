package sideeffect

import reactor.core.publisher.Flux
import java.util.concurrent.atomic.AtomicBoolean

fun main() {
    val errorOccurred = AtomicBoolean(false)
    Flux.range(1,3)
        .concatWith(Flux.error(IllegalArgumentException()))
        .log()
        .doOnError { throwable: Throwable ->
            println("doOnError 동작")
            println("발생한 에러 : ${throwable.javaClass}")
            errorOccurred.set(true)
        }
        .subscribe()

    if (errorOccurred.get()) {
        println("에러 발생")
    }
}