package subway.utils.constants

enum class MainMenuMent(private val message: String) {
    PRINT_MENU_NAME("${Common.PREFIX_MANUAL.getMessage()} 메인 화면"),
    MENU_MANAGE_STATION("1. 역 관리"),
    MENU_MANAGE_LINE("2. 노선 관리"),
    MENU_MANAGE_SECTION("3. 구간 관리"),
    MENU_PRINT_MAP("4. 지하철 노선도 출력"),
    MENU_QUIT("Q. 종료");

    fun getMessage(): String {
        return this.message
    }
}