package subway.controller

import subway.domain.Line
import subway.domain.LineRepository
import subway.domain.StationRepository
import subway.utils.RepeatInputProcess
import subway.utils.constants.ErrorMessage
import subway.view.InputView
import subway.view.OutputView

class LineMenuController {

    private val inputView = InputView()
    private val outputView = OutputView()

    fun readlineMenuOption(): String {
        outputView.printLineMenu()
        outputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { inputView.readLineMenuOption() } as String
    }

    fun addLine() {
        val lineName = readLineName()
        if (checkAddable(lineName)) {
            val terminalNames = readTerminals()
            val line = Line(lineName)
            terminalNames.forEach { terminalName ->
                if (!checkTerminalAddable(terminalName)) return
                line.addStation(StationRepository.stations().find { station -> station.name == terminalName }!!)
            }
            LineRepository.addLine(line)
            outputView.printAddLineSuccessMent()
        }
    }

    private fun readLineName(): String {
        outputView.printAddLineMent()
        return inputView.readLineName()
    }

    private fun checkAddable(lineName: String): Boolean {
        LineRepository.lines().find { it.name == lineName } ?: return true
        outputView.printErrorMessage(ErrorMessage.ALREADY_EXIST_LINE.getMessage())
        return false
    }

    private fun checkTerminalAddable(stationName: String): Boolean {
        StationRepository.stations().find { it.name == stationName } ?: run {
            outputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
            return false
        }
        return true
    }

    private fun readTerminals(): List<String> {
        outputView.printInputUpTerminal()
        val upTerminal = inputView.readTerminal()
        outputView.printInputDownTerminal()
        val downTerminal = inputView.readTerminal()
        return listOf(upTerminal, downTerminal)
    }

    fun removeLine() {
        outputView.printRemoveLineMent()
        val lineName = inputView.readLineName()
        if (LineRepository.deleteLineByName(lineName)) {
            outputView.printRemoveLineSuccessMent()
            return
        }
        outputView.printErrorMessage(ErrorMessage.NOT_EXIST_LINE.getMessage())
    }

    fun printLine() {
        outputView.printLines(LineRepository.lines())
    }
}