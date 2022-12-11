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
        when (ManageStationMenu.readManageStationMenuOption()) {
            "1" -> ManageStationMenu.addStation()
            "2" -> ManageStationMenu.removeStation()
            "3" -> ManageStationMenu.printStation()
            else -> return
        }
    }

    private fun goToManageLineMenu() {
        println("노선 관리 메뉴로 들어옴")
    }

    private fun goToManageSectionMenu() {
        println("구간 관리 메뉴로 들어옴")
    }

    private fun printMap() {
        println("지하철 노선도 출력")
    }
}