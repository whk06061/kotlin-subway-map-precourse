package subway.view

import subway.exception.Validator
import java.util.*

object InputView {
    private val scanner = Scanner(System.`in`)
    fun readMainMenuOption(): String {
        val input = scanner.nextLine()
        return Validator.checkMainMenuOptionInput(input)
    }

    fun readManageStationMenuOption():String{
        val input = scanner.nextLine()
        return Validator.checkManageLineMenuOptionInput(input)
    }

    fun readStationName():String{
        return scanner.nextLine()
    }
}