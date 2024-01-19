package solid.report

/**
 * The problem:
 * The interface defines functions for all kind of reports, so the implementations are implementing two of
 * those functions as empty due they don't apply to them.
 *
 * What we are look for here is to know if the candidate knows about Interface Segregation principle.
 */
interface Report {
    fun printInternalReport(employeeId: Int, hoursWorked: Double, date: String)
    fun printPublicReport(employeeId: Int, hoursWorked: Double, date: String)
    fun printAuditoryReport(employeeId: Int, hoursWorked: Double, date: String)
}