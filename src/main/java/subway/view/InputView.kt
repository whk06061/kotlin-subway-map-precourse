package subway.view

import subway.exception.Validator
import java.util.*

object InputView {
    private val scanner = Scanner(System.`in`)
    fun readMainMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkMainMenuOptionInput(input)
    }

    fun readStationMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkStationMenuOptionInput(input)
    }

    fun readLineMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkLineMenuOptionInput(input)
    }

    fun readSectionMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkSectionMenuOptionInput(input)
    }

    fun readStationName(): String {
        return scanner.nextLine()
    }

    fun readSectionIndex(): Int {
        val input = scanner.nextLine()
        return Validator.checkSectionIndexInput(input)
    }

    fun readLineName(): String {
        return scanner.nextLine()
    }

    fun readTerminal(): String {
        return scanner.nextLine()
    }
}