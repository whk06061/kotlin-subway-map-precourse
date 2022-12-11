package subway.view

import subway.domain.Line
import subway.domain.ManageStationMenu
import subway.domain.Station
import subway.utils.constants.Common
import subway.utils.constants.MainMenuMent
import subway.utils.constants.ManageLineMenuMent
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

    fun printManageLineMenu() {
        println()
        println(ManageLineMenuMent.PRINT_MENU_NAME.getMessage())
        println(ManageLineMenuMent.MENU_ADD_LINE.getMessage())
        println(ManageLineMenuMent.MENU_REMOVE_LINE.getMessage())
        println(ManageLineMenuMent.MENU_PRINT_LINE.getMessage())
        println(ManageLineMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printAddStationMent() {
        println()
        println(ManageStationMenuMent.INPUT_ADD_STATION.getMessage())
    }

    fun printAddLineMent() {
        println()
        println(ManageLineMenuMent.INPUT_ADD_LINE.getMessage())
    }

    fun printRemoveStationMent() {
        println()
        println(ManageStationMenuMent.INPUT_REMOVE_STATION.getMessage())
    }

    fun printRemoveLineMent() {
        println()
        println(ManageLineMenuMent.INPUT_REMOVE_LINE.getMessage())
    }

    fun printInputFunctionOptionMent() {
        println(Common.INPUT_OPTION_MENT.getMessage())
    }

    fun printInputUpTerminal() {
        println(ManageLineMenuMent.INPUT_UP_TERMINAL.getMessage())
    }

    fun printInputDownTerminal() {
        println(ManageLineMenuMent.INPUT_DOWN_TERMINAL.getMessage())
    }

    fun printAddStationSuccessMent() {
        println(ManageStationMenuMent.SUCCESS_ADD_STATION_MENT.getMessage())
    }

    fun printRemoveStationSuccessMent() {
        println(ManageStationMenuMent.SUCCESS_REMOVE_STATION_MENT.getMessage())
    }

    fun printRemoveLineSuccessMent() {
        println(ManageLineMenuMent.SUCCESS_REMOVE_LINE_MENT.getMessage())
    }

    fun printAddLineSuccessMent() {
        println(ManageLineMenuMent.SUCCESS_ADD_LINE_MENT.getMessage())
    }

    fun printErrorMessage(message: String) {
        println()
        println(message)
    }

    fun printStations(stations: List<Station>) {
        println(ManageStationMenuMent.PRINT_STATIONS_MENT.getMessage())
        stations.forEach { println("${Common.PREFIX_RESULT.getMessage()} ${it.name}") }
    }

    fun printLines(lines: List<Line>) {
        println(ManageStationMenuMent.PRINT_STATIONS_MENT.getMessage())
        lines.forEach { println("${Common.PREFIX_RESULT.getMessage()} ${it.name}") }
    }
}