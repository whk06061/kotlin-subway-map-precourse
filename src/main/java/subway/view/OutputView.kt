package subway.view

import subway.domain.ManageStationMenu
import subway.utils.constants.Common
import subway.utils.constants.MainMenuMent
import subway.utils.constants.ManageStationMenuMent

object OutputView {

    fun printMainMenu() {
        println()
        println(MainMenuMent.PRINT_MENU_NAME.getMessage())
        println(MainMenuMent.MENU_MANAGE_STATION.getMessage())
        println(MainMenuMent.MENU_MANAGE_LINE.getMessage())
        println(MainMenuMent.MENU_MANAGE_SECTION.getMessage())
        println(MainMenuMent.MENU_PRINT_MAP.getMessage())
        println(MainMenuMent.MENU_QUIT.getMessage())
        println()
    }

    fun printManageStationMenu() {
        println()
        println(ManageStationMenuMent.PRINT_MENU_NAME.getMessage())
        println(ManageStationMenuMent.MENU_ADD_STATION.getMessage())
        println(ManageStationMenuMent.MENU_REMOVE_STATION.getMessage())
        println(ManageStationMenuMent.MENU_PRINT_STATION.getMessage())
        println(ManageStationMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printAddStationMent() {
        println()
        println(ManageStationMenuMent.INPUT_ADD_STATION.getMessage())
    }

    fun printRemoveStationMent() {
        println()
        println(ManageStationMenuMent.INPUT_REMOVE_STATION.getMessage())
    }

    fun printInputFunctionOptionMent() {
        println(Common.INPUT_OPTION_MENT.getMessage())
    }

    fun printAddSuccessMent() {
        println(ManageStationMenuMent.SUCCESS_ADD_STATION_MENT.getMessage())
    }

    fun printRemoveSuccessMent() {
        println(ManageStationMenuMent.SUCCESS_REMOVE_STATION_MENT)
    }

    fun printErrorMessage(message: String) {
        println()
        println(message)
    }
}