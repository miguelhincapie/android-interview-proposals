package org.example.solid.payment

interface Payment {

    fun pay(employeeId: Int, amount: Double)
}