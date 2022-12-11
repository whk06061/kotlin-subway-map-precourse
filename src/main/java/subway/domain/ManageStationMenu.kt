package subway.domain

import subway.utils.RepeatInputProcess
import subway.utils.constants.ErrorMessage
import subway.view.InputView
import subway.view.OutputView

object ManageStationMenu {

    fun readManageStationMenuOption(): String {
        OutputView.printManageStationMenu()
        OutputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { InputView.readManageStationMenuOption() } as String
    }

    fun addStation() {
        OutputView.printAddStationMent()
        val stationName = InputView.readStationName()
        if (checkAddPossible(stationName)) {
            StationRepository.addStation(Station(stationName))
            OutputView.printAddSuccessMent()
        }
    }

    private fun checkAddPossible(addStationName: String): Boolean {
        StationRepository.stations().find { station -> station.name == addStationName } ?: return true
        OutputView.printErrorMessage(ErrorMessage.ALREADY_EXIST_STATION.getMessage())
        return false
    }

    fun removeStation() {
        OutputView.printRemoveStationMent()
        val stationName = InputView.readStationName()
        if (checkRemovePossible(stationName)) {
            if (StationRepository.deleteStation(stationName)) {
                OutputView.printRemoveSuccessMent()
                return
            }
            OutputView.printErrorMessage(ErrorMessage.NOT_EXIST_STATION.getMessage())
        }
    }

    private fun checkRemovePossible(removeStationName: String): Boolean {
        // 노선에 등록된 역인지 검사
        val station = StationRepository.stations().find { it.name == removeStationName }
        LineRepository.lines().forEach { line ->
            if (station in line.stations()) {
                OutputView.printErrorMessage(ErrorMessage.STATION_IN_LINE.getMessage())
                return false
            }
        }
        return true
    }

    fun printStation() {

    }
}