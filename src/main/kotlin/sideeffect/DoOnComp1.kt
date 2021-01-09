package sideeffect

import reactor.core.publisher.Flux
import java.util.concurrent.atomic.AtomicBoolean

fun main() {
    val completed = AtomicBoolean(false)
    Flux.just("A", "B", "C")
        .log()
        .doOnComplete {
            println("doOnComplete 동작")
            completed.set(true)
        }
        .subscribe()

    if (completed.get()) {
        println("데이터 통지 성공")
    } else {
        println("데이터 통지 실패")
    }
}