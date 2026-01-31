import java.time.LocalDate

class Paycheck (val payday: LocalDate, val salary: Double) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Paycheck

        if (salary != other.salary) return false
        if (payday != other.payday) return false

        return true
    }

    override fun hashCode(): Int {
        var result = salary.hashCode()
        result = 31 * result + payday.hashCode()
        return result
    }

    override fun toString(): String {
        return "Paycheck(payday=$payday, salary=$salary)"
    }
}