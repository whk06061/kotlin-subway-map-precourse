package subway.view

import subway.domain.Line
import subway.domain.Station
import subway.utils.constants.*

class OutputView {

    // Common
    fun printErrorMessage(message: String) {
        println()
        println(message)
    }

    fun printInputFunctionOptionMent() {
        println(Common.INPUT_OPTION_MENT.getMessage())
    }


    // Main Menu
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


    // Station Menu
    fun printStationMenu() {
        println()
        println(StationMenuMent.PRINT_MENU_NAME.getMessage())
        println(StationMenuMent.MENU_ADD_STATION.getMessage())
        println(StationMenuMent.MENU_REMOVE_STATION.getMessage())
        println(StationMenuMent.MENU_PRINT_STATION.getMessage())
        println(StationMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printAddStationMent() {
        println()
        println(StationMenuMent.INPUT_ADD_STATION.getMessage())
    }

    fun printAddStationSuccessMent() {
        println(StationMenuMent.SUCCESS_ADD_STATION_MENT.getMessage())
    }

    fun printRemoveStationMent() {
        println()
        println(StationMenuMent.INPUT_REMOVE_STATION.getMessage())
    }

    fun printRemoveStationSuccessMent() {
        println(StationMenuMent.SUCCESS_REMOVE_STATION_MENT.getMessage())
    }

    fun printStations(stations: List<Station>) {
        println(StationMenuMent.PRINT_STATIONS_MENT.getMessage())
        stations.forEach { println("${Common.PREFIX_RESULT.getMessage()} ${it.name}") }
    }


    // Line Menu
    fun printLineMenu() {
        println()
        println(LineMenuMent.PRINT_MENU_NAME.getMessage())
        println(LineMenuMent.MENU_ADD_LINE.getMessage())
        println(LineMenuMent.MENU_REMOVE_LINE.getMessage())
        println(LineMenuMent.MENU_PRINT_LINE.getMessage())
        println(LineMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printAddLineMent() {
        println()
        println(LineMenuMent.INPUT_ADD_LINE.getMessage())
    }

    fun printAddLineSuccessMent() {
        println(LineMenuMent.SUCCESS_ADD_LINE_MENT.getMessage())
    }

    fun printInputUpTerminal() {
        println(LineMenuMent.INPUT_UP_TERMINAL.getMessage())
    }

    fun printInputDownTerminal() {
        println(LineMenuMent.INPUT_DOWN_TERMINAL.getMessage())
    }

    fun printRemoveLineMent() {
        println()
        println(LineMenuMent.INPUT_REMOVE_LINE.getMessage())
    }

    fun printRemoveLineSuccessMent() {
        println(LineMenuMent.SUCCESS_REMOVE_LINE_MENT.getMessage())
    }

    fun printLines(lines: List<Line>) {
        println(LineMenuMent.PRINT_LINES_MENT.getMessage())
        lines.forEach { println("${Common.PREFIX_RESULT.getMessage()} ${it.name}") }
    }


    // Section Menu
    fun printSectionMenu() {
        println()
        println(SectionMenuMent.PRINT_MENU_NAME.getMessage())
        println(SectionMenuMent.MENU_ADD_SECTION.getMessage())
        println(SectionMenuMent.MENU_REMOVE_SECTION.getMessage())
        println(SectionMenuMent.MENU_BACK.getMessage())
        println()
    }

    fun printInputSectionLineMent() {
        println()
        println(SectionMenuMent.INPUT_LINE.getMessage())
    }

    fun printInputSectionStationMent() {
        println()
        println(SectionMenuMent.INPUT_STATION.getMessage())
    }

    fun printInputSectionIndexMent() {
        println()
        println(SectionMenuMent.INPUT_INDEX.getMessage())
    }

    fun printAddSectionSuccessMent() {
        println(SectionMenuMent.SUCCESS_ADD_SECTION_MENT.getMessage())
    }

    fun printInputDeleteSectionLineMent() {
        println()
        println(SectionMenuMent.INPUT_DELETE_SECTION_LINE.getMessage())
    }

    fun printInputDeleteSectionStationMent() {
        println()
        println(SectionMenuMent.INPUT_DELETE_SECTION_STATION.getMessage())
    }

    fun printDeleteSectionSuccessMent() {
        println(SectionMenuMent.SUCCESS_DELETE_MENT.getMessage())
    }


    // Map
    fun printMap(line: Line) {
        println()
        println("${Common.PREFIX_RESULT.getMessage()} ${line.name}")
        println("${Common.PREFIX_RESULT.getMessage()} ---")
        line.stations().forEach {
            println("${Common.PREFIX_RESULT.getMessage()} ${it.name}")
        }
    }
}