package mono

import reactor.core.publisher.Mono
import reactor.util.function.Tuple2

fun main() {
    val mono: Mono<Tuple2<String, String>> =
        Mono.just("Republic of Korea")
            .zipWith(Mono.defer { Mono.just("Seoul") })

    mono.map {
        val country = it.t1
        val capital = it.t2
        "$capital is capital of $country"
    }.subscribe(::println)
}