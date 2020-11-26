package mono

import reactor.core.publisher.Mono

fun main() {
    Mono.fromSupplier {
        val greeting = "Reactive World"
        var welcome = "Welcome"
        welcome += " ${greeting.split(" ")[0]}"
        welcome += " ${greeting.split(" ")[1]}"
        welcome
    }.subscribe(::println)
}