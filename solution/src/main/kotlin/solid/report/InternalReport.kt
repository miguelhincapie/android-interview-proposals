package solid.report

class InternalReport : Report {

    override fun printReport(employeeId: Int, hoursWorked: Double, date: String) {
        println("Printing internal report...")
    }
}