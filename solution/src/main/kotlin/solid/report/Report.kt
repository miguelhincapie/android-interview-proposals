package solid.report

/**
 * To avoid Interface Segregation, just define a generic print report function.
 */
interface Report {
    fun printReport(employeeId: Int, hoursWorked: Double, date: String)
}