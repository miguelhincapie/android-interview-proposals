package solid.report

interface Report {
    fun printReport(employeeId: Int, hoursWorked: Double, date: String)
}