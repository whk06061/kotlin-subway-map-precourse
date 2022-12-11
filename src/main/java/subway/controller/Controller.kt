package subway.controller

import subway.domain.*
import subway.utils.RepeatInputProcess
import subway.view.InputView
import subway.view.OutputView

class Controller {

    private val outputView = OutputView()
    private val inputView = InputView()

    fun operate() {
        while (true) {
            when (readMainMenuSelect()) {
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

    private fun readMainMenuSelect(): String {
        outputView.printMainMenu()
        outputView.printInputFunctionOptionMent()
        return RepeatInputProcess.repeat { inputView.readFunctionOption() } as String
    }

    private fun goToManageStationMenu() {
        println("역 관리 메뉴로 들어옴")
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