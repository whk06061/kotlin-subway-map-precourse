package subway.utils.constants

enum class SectionMenuMent(private val message: String) {
    PRINT_MENU_NAME("${Common.PREFIX_MANUAL.getMessage()} 구간 관리 화면"),
    MENU_ADD_SECTION("1. 구간 등록"),
    MENU_REMOVE_SECTION("2. 구간 삭제"),
    MENU_BACK("B. 돌아가기"),

    INPUT_LINE("${Common.PREFIX_MANUAL.getMessage()} 노선을 입력하세요."),
    INPUT_STATION("${Common.PREFIX_MANUAL.getMessage()} 역이름을 입력하세요."),
    INPUT_INDEX("${Common.PREFIX_MANUAL.getMessage()} 순서를 입력하세요."),
    SUCCESS_ADD_SECTION_MENT("${Common.PREFIX_RESULT.getMessage()} 구간이 등록되었습니다."),

    INPUT_DELETE_SECTION_LINE("${Common.PREFIX_MANUAL.getMessage()} 삭제할 구간의 노선을 입력하세요."),
    INPUT_DELETE_SECTION_STATION("${Common.PREFIX_RESULT.getMessage()} 삭제할 구간의 역을 입력하세요."),
    SUCCESS_DELETE_MENT("${Common.PREFIX_RESULT.getMessage()} 구간이 삭제되었습니다.");

    fun getMessage(): String {
        return this.message
    }
}