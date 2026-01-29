import java.time.Duration
import java.time.LocalTime

class Meeting (val description: String, val startTime: LocalTime, val endTime: LocalTime){
    init{
        require(description.isNotEmpty()) { "Meeting description cannot be empty" }
        require(startTime.isBefore(endTime)){
            "startTime must be before endTime"
        }
    }
    fun durationInMinutes(): Long{
        return Duration.between(startTime, endTime).toMinutes()
    }
}