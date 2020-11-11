package mono

import reactor.core.publisher.Mono

fun main() {
    val mono: Mono<HashMap<String, String>> =
        Mono.just("Hello Reactive World")
            .map {
                hashMapOf("greeting" to it)
            }
    mono.subscribe { data ->
        println(data["greeting"])
    }
}