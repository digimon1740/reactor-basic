package mono

import reactor.core.publisher.Mono

fun main() {

    Mono.fromSupplier {
        val greeting: String? = null
        Mono.just(greeting)
    }.onErrorResume {
        Mono.error(GreetingEmptyException("Greeting is Empty"))
    }.subscribe(::println)
}

class GreetingEmptyException : Throwable {
    constructor() : super()
    constructor(message: String?) : super(message)
}

