package hotcold

import reactor.core.publisher.Flux

fun main() {
    val list = listOf("one", "two", "three")
    val flux: Flux<String> = Flux.fromIterable(list)

    flux.subscribe { println("Subscriber-1 : $it") }
    flux.subscribe { println("Subscriber-2 : $it") }
    flux.subscribe { println("Subscriber-3 : $it") }
}