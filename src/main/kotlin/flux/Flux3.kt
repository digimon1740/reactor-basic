package flux

import reactor.core.publisher.Flux

fun main() {
    val avengers = listOf(
        Hero("Iron Man", "Tony Stark"),
        Hero("Black Widow", "Natasha Romanoff"),
        Hero("Captain America", "Steve Rogers"),
        Hero("Thor", "Thor Odinson"),
        Hero("Hulk", "Bruce Banner"),
        Hero("Hawkeye", "Clint Barton"),
        Hero("Black Panther", "T'Challa"),
    )

    val flux: Flux<Hero> =
        Flux.fromIterable(avengers)

    flux.subscribe(::println)
}