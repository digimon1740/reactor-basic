import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription
import reactor.core.publisher.Flux

fun main() {

    Flux.range(1, 10)
        .log()
        .subscribe(object : Subscriber<Int?> {
            private var s: Subscription? = null
            private var count = 0

            override fun onSubscribe(s: Subscription) {
                println("onSubscribe : 구독 시작")
                println("==================")
                this.s = s
                s.request(5)
            }

            override fun onNext(integer: Int?) {
                count++
                if (count % 5 == 0) {
                    println("==================")
                    s!!.request(5)
                }
            }

            override fun onError(t: Throwable) {}
            override fun onComplete() {
                println("==================")
                println("onComplete : 구독 완료")
                println("통지된 numbers 개수 : $count")
            }
        })
}
