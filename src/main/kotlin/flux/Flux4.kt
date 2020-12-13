package flux

import reactor.core.publisher.Flux

fun main() {
    val sum = Flux.range(1, 100)
        .reduce { t, u ->
            t + u
        }
    sum.subscribe(::println)
}