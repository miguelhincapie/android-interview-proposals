package org.example.solid.employee

import org.example.solid.payment.Payment
import javax.inject.Inject

class PayrollManager @Inject constructor(
    private val payment: Payment
) {

    fun payEmployeeSalary(employee: Employee) = with(employee) {
        calculateAmount(hoursWorked).let {
            payment.pay(id, it)
        }
    }

    private fun calculateAmount(hoursWorked: Double): Double {
        return hoursWorked * 123
    }
}