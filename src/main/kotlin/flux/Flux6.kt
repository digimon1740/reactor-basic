package flux

import reactor.core.publisher.Flux
import java.time.Duration
import java.util.UUID

data class Coupon(
    val id: String,
    val description: String,
)

fun main() {
    val flux: Flux<Coupon> =
        Flux.interval(Duration.ofMillis(500))
            .map { count ->
                val id = UUID.randomUUID().toString()
                Coupon(id = id, description = "${count.plus(1)}번째 쿠폰")
            }
            .take(15)

    flux.subscribe(::println)

    Thread.sleep(Duration.ofSeconds(10).toMillis())
}