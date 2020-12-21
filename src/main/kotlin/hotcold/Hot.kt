package hotcold

import reactor.core.publisher.ConnectableFlux
import reactor.core.publisher.Flux
import java.time.Duration


fun main() {
    val flux: ConnectableFlux<Int> =
        Flux.range(1, 5)
            .delayElements(Duration.ofMillis(100))
            .publish()

    flux.connect()

    flux.subscribe { println("Subscriber-1 : $it") }

    Thread.sleep(Duration.ofMillis(200).toMillis())
    flux.subscribe { println("Subscriber-2 : $it") }

    Thread.sleep(Duration.ofMillis(200).toMillis())
    flux.subscribe { println("Subscriber-3 : $it") }

    Thread.sleep(Duration.ofSeconds(2).toMillis())


}