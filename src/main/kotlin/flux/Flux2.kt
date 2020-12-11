package flux

import reactor.core.publisher.Flux

data class Hero(
    val nickname: String,
    val name: String,
)

fun main() {
    val avengers = arrayOf(
        Hero("Iron Man", "Tony Stark"),
        Hero("Black Widow", "Natasha Romanoff"),
        Hero("Captain America", "Steve Rogers"),
        Hero("Thor", "Thor Odinson"),
        Hero("Hulk", "Bruce Banner"),
        Hero("Hawkeye", "Clint Barton"),
        Hero("Black Panther", "T'Challa"),
    )

    val flux: Flux<Hero> =
        Flux.fromArray(avengers)

    flux.subscribe(::println)
}