package solid.report

class PublicReport : Report {

    override fun printReport(employeeId: Int, hoursWorked: Double, date: String) {
        println("Printing public report...")
    }
}