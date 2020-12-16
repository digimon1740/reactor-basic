package flux

import reactor.core.publisher.Flux
import java.time.Duration

fun main() {
    val one = Flux.just("one").delayElements(Duration.ofMillis(500))
    val two = Flux.just("two").delayElements(Duration.ofMillis(400))
    val three = Flux.just("three").delayElements(Duration.ofMillis(300))

    val flux = Flux.merge(one, two, three)
    flux.subscribe(::println)

    Thread.sleep(Duration.ofSeconds(2).toMillis())
}