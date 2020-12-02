package mono

import reactor.core.publisher.Mono

fun main() {
    val monoList = arrayListOf(
        Mono.just("Seoul"),
        Mono.just("Tokyo"),
        Mono.just("Washington, D.C"),
        Mono.just("Wellington"),
        Mono.just("Canberra"),
        Mono.just("Paris"),
        Mono.just("Prague"),
        Mono.just("Manila"),
        Mono.just("Doha"),
        Mono.just("Singapore")
    )

    Mono.zip(monoList) { array: Array<Any> -> // 컴비네이터 함수
        array.joinToString {
            (it as String).toUpperCase()
        }
    }.subscribe(::println)
}