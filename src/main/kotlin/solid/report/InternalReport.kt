package solid.report

class InternalReport : Report {
    override fun printInternalReport(employeeId: Int, hoursWorked: Double, date: String) {
        println("Printing internal report...")
    }

    override fun printPublicReport(employeeId: Int, hoursWorked: Double, date: String) {
        /* No needed for internal report */
    }

    override fun printAuditoryReport(employeeId: Int, hoursWorked: Double, date: String) {
        /* No needed for internal report */
    }
}