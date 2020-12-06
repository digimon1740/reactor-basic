package mono

import reactor.core.publisher.Mono

fun main() {
    val mono =
        Mono.just("Republic of Korea")
            .zipWhen {
                Mono.just("Seoul")
            }

    mono.map {
        val country = it.t1
        val capital = it.t2
        "$capital is capital of $country"
    }.subscribe(::println)
}