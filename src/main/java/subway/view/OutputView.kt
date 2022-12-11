package subway.view

import subway.domain.ManageStationMenu
import subway.utils.constants.Common
import subway.utils.constants.MainMenuMent
import subway.utils.constants.ManageStationMenuMent

object OutputView {

    fun printMainMenu() {
        println(MainMenuMent.PRINT_MENU_NAME.getMessage())
        println(MainMenuMent.MENU_MANAGE_STATION.getMessage())
        println(MainMenuMent.MENU_MANAGE_LINE.getMessage())
        println(MainMenuMent.MENU_MANAGE_SECTION.getMessage())
        println(MainMenuMent.MENU_PRINT_MAP.getMessage())
        println(MainMenuMent.MENU_QUIT.getMessage())
        println()
    }

    fun printManageStationMenu(){
        println(ManageStationMenuMent.PRINT_MENU_NAME.getMessage())
        println(ManageStationMenuMent.MENU_ADD_STATION.getMessage())
        println(ManageStationMenuMent.MENU_REMOVE_STATION.getMessage())
        println(ManageStationMenuMent.MENU_PRINT_STATION.getMessage())
        println(ManageStationMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printAddStationMent(){
        println(ManageStationMenuMent.ADD_STATION_MENT.getMessage())
    }

    fun printRemoveStationMent(){
        println(ManageStationMenuMent.REMOVE_STATION_MENT.getMessage())
    }

    fun printInputFunctionOptionMent() {
        println(Common.INPUT_OPTION_MENT.getMessage())
    }

    fun printErrorMessage(message: String) {
        println(message)
    }
}