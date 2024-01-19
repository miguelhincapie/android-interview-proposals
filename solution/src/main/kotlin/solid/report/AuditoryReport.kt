package solid.report

class AuditoryReport : Report {

    override fun printReport(employeeId: Int, hoursWorked: Double, date: String) {
        println("Printing auditory report...")
    }
}