package subway.constants

enum class ManageStationMenuMent(private val message: String) {
    PRINT_MENU_NAME("${Common.PREFIX_MANUAL.getMessage()} 역 관리 화면"),
    NAME_ADD_STATION("1. 역 등록"),
    NAME_REMOVE_STATION("2. 역 삭제"),
    NAME_PRINT_STATION("3. 역 조회"),
    NAME_BACK("B. 돌아가기"),

    INPUT_ADD_STATION("${Common.PREFIX_MANUAL.getMessage()} 등록할 역 이름을 입력하세요."),
    ADD_STATION_MENT("${Common.PREFIX_RESULT.getMessage()} 지하철 역이 등록되었습니다."),

    INPUT_REMOVE_STATION("${Common.PREFIX_MANUAL.getMessage()} 삭제할 역 이름을 입력하세요."),
    REMOVE_STATION_MENT("${Common.PREFIX_RESULT.getMessage()} 지하철 역이 삭제되었습니다.");

    fun getMessage(): String {
        return this.message
    }
}