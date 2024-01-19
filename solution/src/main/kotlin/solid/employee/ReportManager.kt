package org.example.solid.employee

import solid.report.InternalReport
import javax.inject.Inject

class ReportManager @Inject constructor() {

    fun printInternalReport(employee: Employee) = with(employee) {
        InternalReport().printReport(id, hoursWorked, "today")
    }
}