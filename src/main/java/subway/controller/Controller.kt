package subway.controller

import subway.domain.*
import subway.utils.RepeatInputProcess
import subway.view.InputView
import subway.view.OutputView

class Controller {

    fun operate() {
        while (true) {
            when (readMainMenuOption()) {
                "1" -> goToManageStationMenu()
                "2" -> goToManageLineMenu()
                "3" -> goToManageSectionMenu()
                "4" -> printMap()
                else -> return
            }
        }
    }

    init {
        val init = Init()
        init.initStationToLine(init.initStation(), init.initLine())
    }

    private fun readMainMenuOption(): String {
        OutputView.printMainMenu()
        OutputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { InputView.readMainMenuOption() } as String
    }

    private fun goToManageStationMenu() {
        val stationMenuCollection = StationMenuController()
        when (stationMenuCollection.readStationMenuOption()) {
            "1" -> stationMenuCollection.addStation()
            "2" -> stationMenuCollection.removeStation()
            "3" -> stationMenuCollection.printStation()
            else -> return
        }
    }

    private fun goToManageLineMenu() {
        val lineMenuController = LineMenuController()
        when (lineMenuController.readlineMenuOption()) {
            "1" -> lineMenuController.addLine()
            "2" -> lineMenuController.removeLine()
            "3" -> lineMenuController.printLine()
            else -> return
        }
    }

    private fun goToManageSectionMenu() {
        val sectionMenuController = SectionMenuController()
        when (sectionMenuController.readSectionMenuOption()) {
            "1" -> sectionMenuController.addSection()
            "2" -> sectionMenuController.removeSection()
            else -> return
        }
    }

    private fun printMap() {
    }
}