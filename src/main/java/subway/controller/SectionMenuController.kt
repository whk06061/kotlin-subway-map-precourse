package subway.controller

import subway.domain.Line
import subway.domain.LineRepository
import subway.domain.Station
import subway.domain.StationRepository
import subway.utils.RepeatInputProcess
import subway.utils.constants.ErrorMessage
import subway.view.InputView
import subway.view.OutputView

class SectionMenuController {

    private val inputView = InputView()
    private val outputView = OutputView()

    fun readSectionMenuOption(): String {
        outputView.printSectionMenu()
        outputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { inputView.readSectionMenuOption() } as String
    }

    fun addSection() {
        val line = readAddLine() ?: return
        val station = readAddStation() ?: return
        val index = readIndex()
        line.addSection(station, index)
        outputView.printAddSectionSuccessMent()
    }

    private fun readAddLine(): Line? {
        outputView.printInputSectionLineMent()
        return readLine()
    }

    private fun readLine(): Line? {
        val lineName = inputView.readLineName()
        return LineRepository.lines().find { it.name == lineName }
            ?: run {
                outputView.printErrorMessage(ErrorMessage.NOT_EXIST_LINE.getMessage())
                return null
            }
    }

    private fun readAddStation(): Station? {
        outputView.printInputSectionStationMent()
        val stationName = inputView.readStationName()
        return StationRepository.stations().find { it.name == stationName } ?: run {
            outputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
            return null
        }
    }

    private fun readIndex(): Int {
        outputView.printInputSectionIndexMent()
        return inputView.readSectionIndex()
    }

    fun removeSection() {
        val line = readRemoveLine() ?: return
        val station = readRemoveStation(line) ?: return
        line.deleteSection(station)
        outputView.printDeleteSectionSuccessMent()
    }

    private fun readRemoveLine(): Line? {
        outputView.printInputDeleteSectionLineMent()
        return readLine()
    }

    private fun readRemoveStation(line: Line): Station? {
        outputView.printInputDeleteSectionStationMent()
        val stationName = inputView.readStationName()
        return line.stations().find { it.name == stationName } ?: run {
            outputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
            return null
        }
    }
}