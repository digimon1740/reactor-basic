package flux

import reactor.core.publisher.Flux
import reactor.core.publisher.SynchronousSink
import java.util.UUID
import java.util.concurrent.Callable

fun main() {
    val stateSupplier = Callable { 0 }
    val generated =
        Flux.generate(stateSupplier)
        { state: Int, sink: SynchronousSink<String> ->
            sink.next(fetchNewUserId().call())
            if (state == 10) {
                sink.complete()
            }
            state.plus(1)
        }
    generated.subscribe(::sendWelcomeMessage)
}

fun fetchNewUserId() =
    Callable {
        Thread.sleep(1000)
        "userId:${UUID.randomUUID()}"
    }

fun sendWelcomeMessage(userId: String) = println("${userId}님 회원 가입을 환영합니다.")