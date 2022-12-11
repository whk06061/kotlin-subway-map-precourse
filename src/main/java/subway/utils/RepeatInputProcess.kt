package subway.utils

import subway.view.OutputView
import java.lang.IllegalArgumentException

object RepeatInputProcess {
    fun repeat(inputProcess: () -> Any): Any {
        val outputView = OutputView()
        while (true) {
            try {
                return inputProcess()
            } catch (e: IllegalArgumentException) {
                outputView.printErrorMessage(e.message.toString())
            }
        }
    }
}