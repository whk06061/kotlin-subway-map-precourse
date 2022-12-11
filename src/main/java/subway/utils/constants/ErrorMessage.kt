package subway.utils.constants

enum class ErrorMessage(private val message: String) {
    PREFIX("[ERROR]"),
    INVALID_OPTION("${PREFIX.message} 정확한 값을 다시 입력해주세요."),
    NOT_EXIST_STATION("${PREFIX.message} 존재하지 않는 역입니다."),
    STATION_IN_LINE("${PREFIX.message} 노선에 등록된 역이므로 삭제할 수 없습니다."),
    ALREADY_EXIST_STATION("${PREFIX.message} 이미 등록된 역입니다.");

    fun getMessage():String{
        return this.message
    }
}