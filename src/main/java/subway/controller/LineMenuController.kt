package subway.controller

import subway.domain.Line
import subway.domain.LineRepository
import subway.domain.StationRepository
import subway.utils.RepeatInputProcess
import subway.utils.constants.ErrorMessage
import subway.view.InputView
import subway.view.OutputView

class LineMenuController {

    fun readlineMenuOption(): String {
        OutputView.printLineMenu()
        OutputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { InputView.readLineMenuOption() } as String
    }

    fun addLine() {
        OutputView.printAddLineMent()
        val lineName = InputView.readLineName()
        if (checkAddPossible(lineName)) {
            val upTerminalName = readUpTerminal()
            if (!checkAddTerminalPossible(upTerminalName)) return
            val downTerminalName = readDownTerminal()
            if (!checkAddTerminalPossible(downTerminalName)) return
            val line = Line(lineName)
            line.addStation(StationRepository.stations().find { it.name == upTerminalName }!!)
            line.addStation(StationRepository.stations().find { it.name == downTerminalName }!!)
            LineRepository.addLine(line)
            OutputView.printAddLineSuccessMent()
        }
    }

    private fun checkAddPossible(lineName: String): Boolean {
        LineRepository.lines().find { it.name == lineName } ?: return true
        OutputView.printErrorMessage(ErrorMessage.ALREADY_EXIST_LINE.getMessage())
        return false
    }

    private fun checkAddTerminalPossible(stationName: String): Boolean {
        StationRepository.stations().find { it.name == stationName } ?: run {
            OutputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
            return false
        }
        return true
    }

    private fun readUpTerminal(): String {
        OutputView.printInputUpTerminal()
        return InputView.readTerminal()
    }

    private fun readDownTerminal(): String {
        OutputView.printInputDownTerminal()
        return InputView.readTerminal()
    }

    fun removeLine() {
        OutputView.printRemoveLineMent()
        val lineName = InputView.readLineName()
        if (LineRepository.deleteLineByName(lineName)) {
            OutputView.printRemoveLineSuccessMent()
            return
        }
        OutputView.printErrorMessage(ErrorMessage.NOT_EXIST_LINE.getMessage())
    }

    fun printLine() {
        OutputView.printLines(LineRepository.lines())
    }
}