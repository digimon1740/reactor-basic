package mono

import reactor.core.publisher.Mono

fun main() {
    Mono.fromSupplier {
        val greeting = "Hello Reactive World"
        var welcome = "Welcome"
        welcome += " ${greeting.split(" ")[1]}"
        welcome += " ${greeting.split(" ")[2]}"
        welcome
    }.subscribe(::println)
}