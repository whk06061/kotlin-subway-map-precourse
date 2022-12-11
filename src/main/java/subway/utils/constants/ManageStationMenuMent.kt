package subway.utils.constants

enum class ManageStationMenuMent(private val message: String) {
    PRINT_MENU_NAME("${Common.PREFIX_MANUAL.getMessage()} 역 관리 화면"),
    MENU_ADD_STATION("1. 역 등록"),
    MENU_REMOVE_STATION("2. 역 삭제"),
    MENU_PRINT_STATION("3. 역 조회"),
    MENU_BACK("B. 돌아가기"),

    INPUT_ADD_STATION("${Common.PREFIX_MANUAL.getMessage()} 등록할 역 이름을 입력하세요."),
    SUCCESS_ADD_STATION_MENT("${Common.PREFIX_RESULT.getMessage()} 지하철 역이 등록되었습니다."),

    INPUT_REMOVE_STATION("${Common.PREFIX_MANUAL.getMessage()} 삭제할 역 이름을 입력하세요."),
    SUCCESS_REMOVE_STATION_MENT("${Common.PREFIX_RESULT.getMessage()} 지하철 역이 삭제되었습니다."),

    PRINT_STATIONS_MENT("${Common.PREFIX_MANUAL.getMessage()} 역 목록");

    fun getMessage(): String {
        return this.message
    }
}