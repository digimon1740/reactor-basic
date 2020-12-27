package backpressure

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

fun main() {

    Flux.range(1, Int.MAX_VALUE)
        .log()
        .concatMap { Mono.delay(Duration.ofMillis(100)) }
        .blockLast()
}