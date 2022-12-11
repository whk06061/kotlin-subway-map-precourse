package subway.utils.constants

enum class LineMenuMent(private val message: String) {
    PRINT_MENU_NAME("${Common.PREFIX_MANUAL.getMessage()} 노선 관리 화면"),
    MENU_ADD_LINE("1. 노선 등록"),
    MENU_REMOVE_LINE("2. 노선 삭제"),
    MENU_PRINT_LINE("3. 노선 조회"),
    MENU_BACK("B. 돌아가기"),

    INPUT_ADD_LINE("${Common.PREFIX_MANUAL.getMessage()} 등록할 노선 이름을 입력하세요."),
    INPUT_UP_TERMINAL("${Common.PREFIX_MANUAL.getMessage()} 등록할 노선의 상행 종점역 이름을 입력하세요."),
    INPUT_DOWN_TERMINAL("${Common.PREFIX_MANUAL.getMessage()} 등록할 노선의 하행 종점역 이름을 입력하세요."),
    SUCCESS_ADD_LINE_MENT("${Common.PREFIX_RESULT.getMessage()} 지하철 노선이 등록되었습니다."),

    INPUT_REMOVE_LINE("${Common.PREFIX_MANUAL.getMessage()} 삭제할 노선 이름을 입력하세요."),
    SUCCESS_REMOVE_LINE_MENT("${Common.PREFIX_RESULT.getMessage()} 지하철 노선이 삭제되었습니다."),

    PRINT_LINES_MENT("${Common.PREFIX_MANUAL.getMessage()} 노선 목록");

    fun getMessage(): String {
        return this.message
    }
}