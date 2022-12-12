package subway.controller

import subway.domain.LineRepository
import subway.domain.Station
import subway.domain.StationRepository
import subway.utils.RepeatInputProcess
import subway.utils.constants.ErrorMessage
import subway.view.InputView
import subway.view.OutputView

class StationMenuController {

    private val inputView = InputView()
    private val outputView = OutputView()

    fun readStationMenuOption(): String {
        outputView.printStationMenu()
        outputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { inputView.readStationMenuOption() } as String
    }

    fun addStation() {
        outputView.printAddStationMent()
        val stationName = inputView.readStationName()
        if (checkAddable(stationName)) {
            StationRepository.addStation(Station(stationName))
            outputView.printAddStationSuccessMent()
        }
    }

    private fun checkAddable(addStationName: String): Boolean {
        StationRepository.stations().find { station -> station.name == addStationName } ?: return true
        outputView.printErrorMessage(ErrorMessage.ALREADY_EXIST_STATION.getMessage())
        return false
    }

    fun removeStation() {
        outputView.printRemoveStationMent()
        val stationName = inputView.readStationName()
        if (checkRemovable(stationName)) {
            if (StationRepository.deleteStation(stationName)) {
                outputView.printRemoveStationSuccessMent()
                return
            }
            outputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
        }
    }

    private fun checkRemovable(removeStationName: String): Boolean {
        // 노선에 등록된 역인지 검사
        val station = StationRepository.stations().find { it.name == removeStationName }
        LineRepository.lines().forEach { line ->
            if (station in line.stations()) {
                outputView.printErrorMessage(ErrorMessage.STATION_IN_LINE.getMessage())
                return false
            }
        }
        return true
    }

    fun printStation() {
        outputView.printStations(StationRepository.stations())
    }
}