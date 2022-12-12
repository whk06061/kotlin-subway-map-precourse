package subway.view

import subway.exception.Validator
import java.util.*

class InputView {

    private val scanner = Scanner(System.`in`)


    // Common
    fun readLineName(): String {
        return scanner.nextLine()
    }

    fun readStationName(): String {
        return scanner.nextLine()
    }


    // Main Menu
    fun readMainMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkMainMenuOptionInput(input)
    }


    // Station Menu
    fun readStationMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkStationMenuOptionInput(input)
    }


    // Line Menu
    fun readLineMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkLineMenuOptionInput(input)
    }

    fun readTerminal(): String {
        return scanner.nextLine()
    }


    // Section Menu
    fun readSectionMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkSectionMenuOptionInput(input)
    }

    fun readSectionIndex(): Int {
        val input = scanner.nextLine()
        return Validator.checkSectionIndexInput(input)
    }

}