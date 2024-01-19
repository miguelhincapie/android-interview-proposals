package org.example.solid.employee

import org.example.solid.payment.PaymentType

data class Employee(
    val id: Int,
    val name: String,
    val hoursWorked: Double,
    val paymentType: PaymentType
)