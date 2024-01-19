package org.example.solid.employee

import javax.inject.Inject

class EmployeeFacade @Inject constructor(
    private val payrollManager: PayrollManager,
    private val employeeRepo: EmployeeRepo,
    private val reportManager: ReportManager
) {

    fun payEmployeeSalary(employee: Employee) {
        payrollManager.payEmployeeSalary(employee)
    }

    fun save(employee: Employee) {
        employeeRepo.save(employee)
    }

    fun printInternalReport(employee: Employee) {
        reportManager.printInternalReport(employee)
    }
}