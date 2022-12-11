package subway.utils.constants

enum class Common(private val message: String) {
    PREFIX_MANUAL("##"),
    PREFIX_RESULT("[INFO]"),
    INPUT_OPTION_MENT("${PREFIX_MANUAL.message} 원하는 기능을 선택하세요.");

    fun getMessage(): String {
        return this.message
    }
}