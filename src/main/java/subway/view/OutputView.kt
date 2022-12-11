package subway.view

import subway.domain.Line
import subway.domain.Station
import subway.utils.constants.*

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

    fun printStationMenu() {
        println()
        println(StationMenuMent.PRINT_MENU_NAME.getMessage())
        println(StationMenuMent.MENU_ADD_STATION.getMessage())
        println(StationMenuMent.MENU_REMOVE_STATION.getMessage())
        println(StationMenuMent.MENU_PRINT_STATION.getMessage())
        println(StationMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printLineMenu() {
        println()
        println(LineMenuMent.PRINT_MENU_NAME.getMessage())
        println(LineMenuMent.MENU_ADD_LINE.getMessage())
        println(LineMenuMent.MENU_REMOVE_LINE.getMessage())
        println(LineMenuMent.MENU_PRINT_LINE.getMessage())
        println(LineMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printSectionMenu() {
        println()
        println(SectionMenuMent.PRINT_MENU_NAME.getMessage())
        println(SectionMenuMent.MENU_ADD_SECTION.getMessage())
        println(SectionMenuMent.MENU_REMOVE_SECTION.getMessage())
        println(SectionMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printAddStationMent() {
        println()
        println(StationMenuMent.INPUT_ADD_STATION.getMessage())
    }

    fun printAddLineMent() {
        println()
        println(LineMenuMent.INPUT_ADD_LINE.getMessage())
    }

    fun printInputSectionLineMent() {
        println()
        println(SectionMenuMent.INPUT_LINE.getMessage())
    }

    fun printInputDeleteSectionLineMent() {
        println()
        println(SectionMenuMent.INPUT_DELETE_SECTION_LINE.getMessage())
    }

    fun printInputDeleteSectionStationMent() {
        println()
        println(SectionMenuMent.INPUT_DELETE_SECTION_STATION.getMessage())
    }

    fun printInputSectionStationMent() {
        println()
        println(SectionMenuMent.INPUT_STATION.getMessage())
    }

    fun printInputSectionIndexMent() {
        println()
        println(SectionMenuMent.INPUT_INDEX.getMessage())
    }

    fun printRemoveStationMent() {
        println()
        println(StationMenuMent.INPUT_REMOVE_STATION.getMessage())
    }

    fun printRemoveLineMent() {
        println()
        println(LineMenuMent.INPUT_REMOVE_LINE.getMessage())
    }

    fun printInputFunctionOptionMent() {
        println(Common.INPUT_OPTION_MENT.getMessage())
    }

    fun printInputUpTerminal() {
        println(LineMenuMent.INPUT_UP_TERMINAL.getMessage())
    }

    fun printInputDownTerminal() {
        println(LineMenuMent.INPUT_DOWN_TERMINAL.getMessage())
    }

    fun printAddStationSuccessMent() {
        println(StationMenuMent.SUCCESS_ADD_STATION_MENT.getMessage())
    }

    fun printRemoveStationSuccessMent() {
        println(StationMenuMent.SUCCESS_REMOVE_STATION_MENT.getMessage())
    }

    fun printRemoveLineSuccessMent() {
        println(LineMenuMent.SUCCESS_REMOVE_LINE_MENT.getMessage())
    }

    fun printAddLineSuccessMent() {
        println(LineMenuMent.SUCCESS_ADD_LINE_MENT.getMessage())
    }

    fun printAddSectionSuccessMent() {
        println(SectionMenuMent.SUCCESS_ADD_SECTION_MENT.getMessage())
    }

    fun printDeleteSectionSuccessMent() {
        println(SectionMenuMent.SUCCESS_DELETE_MENT.getMessage())
    }

    fun printErrorMessage(message: String) {
        println()
        println(message)
    }

    fun printStations(stations: List<Station>) {
        println(StationMenuMent.PRINT_STATIONS_MENT.getMessage())
        stations.forEach { println("${Common.PREFIX_RESULT.getMessage()} ${it.name}") }
    }

    fun printLines(lines: List<Line>) {
        println(StationMenuMent.PRINT_STATIONS_MENT.getMessage())
        lines.forEach { println("${Common.PREFIX_RESULT.getMessage()} ${it.name}") }
    }
}