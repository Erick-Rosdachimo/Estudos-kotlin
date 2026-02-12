import java.time.Duration
import java.time.LocalDateTime

class Enrollment(
    val student: Student,
) {
    var concluded: Boolean = false
        private set
    var enrollmentTime: LocalDateTime? = null
        private set

    val id = nextId()
    private val enrollments = mutableListOf<Course>()

    companion object {
        private var counter = 0
        private fun nextId() = ++counter
    }

    fun enroll(course: Course): Boolean{
        if ( concluded ) return false
        if ( enrollments.sumOf { Duration.between(it.startTime, it.endTime).toHours() } + Duration.between(course.startTime, course.endTime).toHours() > 22) return false
        val hasConflict = enrollments.any {
            course.dayOfWeek == it.dayOfWeek &&
            course.startTime < it.endTime &&
            course.endTime > it.startTime
        }
        if (hasConflict) return false

        return enrollments.add(course)
    }

    fun remove(course: Course){
        check( !concluded ){"A matrícula ja foi concluída"}
        enrollments.remove(course)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Enrollment

        return id == other.id
    }

    override fun hashCode(): Int {
        return id
    }

    fun getStateAsString(): String{
        if ( !concluded ) return "Enrollment not concluded!"
        val sb = StringBuilder()
        sb.append("$student\n")
        sb.append("Enrollment Time: $enrollmentTime\n")
        sb.append("$-----------------------------------------------------------\n")
        sb.append("Courses:\n")
        enrollments.forEach {
            sb.append("$it \n")
        }
        return sb.toString()
    }

    fun conclude(){
        check(!concluded) { "Enrollment already concluded" }
        concluded = true
        enrollmentTime = LocalDateTime.now()
    }
}