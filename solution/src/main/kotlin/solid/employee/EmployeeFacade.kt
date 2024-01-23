package org.example.solid.employee

import org.example.solid.payment.*
import org.example.solid.payment.PaymentType.*
import javax.inject.Inject

class EmployeeFacade @Inject constructor(
    private val payrollManagerFactory: PayrollManager.PayrollManagerFactory,
    private val employeeRepo: EmployeeRepo,
    private val reportManager: ReportManager,
    @CheckPaymentQualifier private val checkPayment: Payment,
    @TransferPaymentQualifier private val transferPayment: Payment,
    @CreditCardPaymentQualifier private val creditCardPayment: Payment,
    @CashPaymentQualifier private val cashPayment: Payment,
) {

    fun payEmployeeSalary(employee: Employee, selectedPaymentType: PaymentType) {
        when (selectedPaymentType) {
            CHECK -> checkPayment
            TRANSFER -> transferPayment
            CREDIT_CARD -> creditCardPayment
            CASH -> cashPayment
        }.let {
            payrollManagerFactory.create(it).payEmployeeSalary(employee)
        }
    }

    fun save(employee: Employee) {
        employeeRepo.save(employee)
    }

    fun printInternalReport(employee: Employee) {
        reportManager.printInternalReport(employee)
    }
}