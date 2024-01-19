package solid.report

class PublicReport : Report {
    override fun printInternalReport(employeeId: Int, hoursWorked: Double, date: String) {
        /* No needed for public report */
    }

    override fun printPublicReport(employeeId: Int, hoursWorked: Double, date: String) {
        println("Printing public report...")
    }

    override fun printAuditoryReport(employeeId: Int, hoursWorked: Double, date: String) {
        /* No needed for public report */
    }
}