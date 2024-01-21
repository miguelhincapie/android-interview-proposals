package org.example.solid.employee

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import org.example.solid.payment.Payment

class PayrollManager @AssistedInject constructor(
    @Assisted private val payment: Payment
) {

    fun payEmployeeSalary(employee: Employee) = with(employee) {
        calculateAmount(hoursWorked).let {
            payment.pay(id, it)
        }
    }

    private fun calculateAmount(hoursWorked: Double): Double {
        return hoursWorked * 123
    }

    @AssistedFactory
    interface PayrollManagerFactory {
        fun create(payment: Payment): PayrollManager
    }
}