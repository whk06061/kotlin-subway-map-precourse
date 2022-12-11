package subway.utils

import subway.view.OutputView
import java.lang.IllegalArgumentException

object RepeatInputProcess {
    fun repeat(inputProcess: () -> Any): Any {
        while (true) {
            try {
                return inputProcess()
            } catch (e: IllegalArgumentException) {
                OutputView.printErrorMessage(e.message.toString())
            }
        }
    }
}