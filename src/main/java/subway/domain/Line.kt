package subway.domain

import java.util.*

class Line( // 추가 기능 구현
    val name: String
) {

    private val stations: MutableList<Station> = mutableListOf()

    fun stations(): List<Station> {
        return Collections.unmodifiableList(stations)
    }

    fun addStation(station: Station) {
        stations.add(station)
    }
}