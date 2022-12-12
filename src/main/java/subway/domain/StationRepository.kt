package subway.domain

import java.util.*

object StationRepository {
    private val stations: MutableList<Station> = ArrayList()
    fun stations(): List<Station> {
        return stations
    }

    fun addStation(station: Station) {
        stations.add(station)
    }

    fun deleteStation(name: String?): Boolean {
        return stations.removeIf { station: Station -> station.name == name }
    }
}