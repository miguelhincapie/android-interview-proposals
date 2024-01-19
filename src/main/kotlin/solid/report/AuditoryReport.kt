package solid.report

class AuditoryReport : Report {
    override fun printInternalReport(employeeId: Int, hoursWorked: Double, date: String) {
        /* No needed for auditory report */
    }

    override fun printPublicReport(employeeId: Int, hoursWorked: Double, date: String) {
        /* No needed for auditory report */
    }

    override fun printAuditoryReport(employeeId: Int, hoursWorked: Double, date: String) {
        println("Printing auditory report...")
    }
}