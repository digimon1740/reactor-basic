package mono

import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

fun main() {
    Schedulers.newSingle("SingleThread").schedule {
        val mono: Mono<String> =
            Mono.just("Welcome Back")
                .zipWhen {
                    Mono.just("Synchronous World")
                }.map {
                    "${it.t1} to the ${it.t2}"
                }
        val text: String? = mono.block()
        println(text)
    }
}