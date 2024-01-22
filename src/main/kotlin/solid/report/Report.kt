package solid.report

interface Report {
    fun printInternalReport(employeeId: Int, hoursWorked: Double, date: String)
    fun printPublicReport(employeeId: Int, hoursWorked: Double, date: String)
    fun printAuditoryReport(employeeId: Int, hoursWorked: Double, date: String)
}