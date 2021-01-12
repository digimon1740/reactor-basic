package extensions

import reactor.kotlin.core.publisher.toMono
import java.util.concurrent.Callable
import java.util.concurrent.CompletableFuture

fun main() {
    "String.toMono"
        .toMono()
        .subscribe(::println)

    listOf("Collection.toMono")
        .toMono()
        .subscribe(::println)

    Callable { "Callable.toMono" }
        .toMono()
        .subscribe(::println)

    CompletableFuture.supplyAsync { "supplyAsync.toMono" }
        .toMono()
        .subscribe(::println)
}