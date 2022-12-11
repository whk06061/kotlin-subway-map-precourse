package subway.view

import subway.utils.constants.Common
import subway.utils.constants.MainMenuMent

class OutputView {

    fun printMainMenu() {
        println(MainMenuMent.PRINT_MENU_NAME.getMessage())
        println(MainMenuMent.NAME_MANAGE_STATION.getMessage())
        println(MainMenuMent.NAME_MANAGE_LINE.getMessage())
        println(MainMenuMent.NAME_MANAGE_SECTION.getMessage())
        println(MainMenuMent.NAME_PRINT_MAP.getMessage())
        println(MainMenuMent.NAME_QUIT.getMessage())
        println()
    }

    fun printInputFunctionOptionMent() {
        println(Common.INPUT_FUNCTION_OPTION.getMessage())
    }

    fun printErrorMessage(message: String) {
        println(message)
    }
}