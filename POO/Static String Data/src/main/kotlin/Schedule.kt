import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime

class Schedule(val day: LocalDate, val startTime: LocalTime, val endTime: LocalTime) {
    init{
        require(startTime.isBefore(endTime)){
            "startTime must be before endTime"
        }
    }

    val meetings: MutableList<Meeting> = mutableListOf()

    fun addMeeting(meeting: Meeting) {
        meetings.forEach { if ( meeting.startTime < it.endTime && meeting.endTime > it.startTime ) return }
        if (meeting.startTime < startTime || meeting.endTime > endTime) return
        meetings.add(meeting)
    }

    fun removeMeeting(meeting: Meeting) {
        meetings.remove(meeting)
    }

    fun percentageSpentInMeetings(): Double {
        var totalMeetings = 0.0
        val totalDay = Duration.between(startTime, endTime).toMinutes()
        meetings.forEach { totalMeetings += it.durationInMinutes()}

        return (totalMeetings / totalDay) * 100
    }

    fun scheduleAsString(): String{
        val sb = StringBuilder()

        for (meeting in meetings) {
            sb.append("Descrição: ${meeting.description} | Inicio: ${meeting.startTime} | Final: ${meeting.endTime} | Duração: ${meeting.durationInMinutes()}\n")
        }
        return sb.toString()
    }
}