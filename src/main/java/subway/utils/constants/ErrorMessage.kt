package subway.utils.constants

enum class ErrorMessage(private val message: String) {
    PREFIX("[ERROR]"),
    INVALID_OPTION("${PREFIX.message} 정확한 값을 다시 입력해주세요.");

    fun getMessage():String{
        return this.message
    }
}