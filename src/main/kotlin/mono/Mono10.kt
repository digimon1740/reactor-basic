package mono

import reactor.core.publisher.Mono

fun main() {
    val mono =
        Mono.just("Hello Reactive World")
            .flatMap {
                val words = it.split(" ")
                val acronym = words.map { word -> word[0] }.toCharArray()
                Mono.zip(Mono.just(acronym), Mono.just(acronym))
            }
    mono.subscribe(::println)
}