package mono

import reactor.core.publisher.Mono
import reactor.util.function.Tuple3

fun main() {
    val mono1 = Mono.just("Hello")
    val mono2 = Mono.just("Reactive")
    val mono3 = Mono.just("World")
    Mono.zip(mono1, mono2, mono3)
        .map { tuple: Tuple3<String, String, String> ->
            "${tuple.t1} ${tuple.t2} ${tuple.t3}"
        }.subscribe(::println)
}