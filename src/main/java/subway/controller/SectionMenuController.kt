package subway.controller

import subway.domain.LineRepository
import subway.domain.StationRepository
import subway.utils.RepeatInputProcess
import subway.utils.constants.ErrorMessage
import subway.view.InputView
import subway.view.OutputView

class SectionMenuController {

    fun readSectionMenuOption(): String {
        OutputView.printSectionMenu()
        OutputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { InputView.readSectionMenuOption() } as String
    }

    fun addSection() {
        OutputView.printInputSectionLineMent()
        val lineName = InputView.readLineName()
        val line = LineRepository.lines().find { it.name == lineName }
            ?: run {
                OutputView.printErrorMessage(ErrorMessage.NOT_EXIST_LINE.getMessage())
                return
            }
        OutputView.printInputSectionStationMent()
        val stationName = InputView.readStationName()
        val station = StationRepository.stations().find { it.name == stationName } ?: run {
            OutputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
            return
        }
        OutputView.printInputSectionIndexMent()
        val index = InputView.readSectionIndex()
        line.addSection(station, index)
        OutputView.printAddSectionSuccessMent()
    }

    fun removeSection() {
        OutputView.printInputDeleteSectionLineMent()
        val lineName = InputView.readLineName()
        val line = LineRepository.lines().find { it.name == lineName }
            ?: run {
                OutputView.printErrorMessage(ErrorMessage.NOT_EXIST_LINE.getMessage())
                return
            }
        OutputView.printInputDeleteSectionStationMent()
        val stationName = InputView.readStationName()
        val station = line.stations().find { it.name == stationName } ?: run {
            OutputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
            return
        }
        line.deleteSection(station)
        OutputView.printDeleteSectionSuccessMent()
    }
}