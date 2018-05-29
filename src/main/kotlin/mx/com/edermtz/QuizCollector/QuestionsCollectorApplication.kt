package mx.com.edermtz.QuizCollector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QuestionsCollectorApplication

fun main(args: Array<String>) {
    runApplication<QuestionsCollectorApplication>(*args)
}
