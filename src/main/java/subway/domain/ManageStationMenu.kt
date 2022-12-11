package subway.domain

import subway.utils.RepeatInputProcess
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
        if (checkAddPossible(stationName)) StationRepository.addStation(Station(stationName))

    }

    private fun checkAddPossible(addStationName: String): Boolean {
        for (station in StationRepository.stations()) {
            if (station.name == addStationName) return false
        }
        return true
    }

    fun removeStation() {
    }

    fun printStation() {

    }
}