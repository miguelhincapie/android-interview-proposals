package solid.employee

import com.google.gson.annotations.SerializedName
import solid.payment.Payment
import solid.report.InternalReport

/**
 * This code merge Clean architecture and a modified version of Uncle Bob example used to explain
 * Single-responsibility principle.
 *
 * The problems:
 * 1. Employee contains logic related to all layers:
 * 1.1. printInternalReport() belongs to UI.
 * 1.2. payEmployeeSalary() belongs to domain.
 * 1.3. save() and SerializedName() belong to data.
 *
 * 2. The class behaves as DTO, Domain Model, Mapper, Use Case and repo.
 *
 * What we are look for here is to know if the candidate knows about:
 * 1. Separation of concerns.
 * 2. Single-responsibility principle.
 * 3. Clean architecture pattern.
 * 
 */
data class Employee(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String?,
    @SerializedName("hours_worked")
    val hoursWorked: String?,
    @SerializedName("payment_type")
    val paymentType: String?
) {

    fun payEmployeeSalary() {
        val paymentType = paymentType?.let { Payment.PaymentType.valueOf(it) }
        val amount: Double = hoursWorked?.let {
            //Business logic code to calculate payment
            //...
            //Imagine the value being returned is the result of apply the logic
            123.4
        } ?: 0.0
        Payment().pay(id, amount, paymentType)
    }

    fun save() {
        //Imagine code related to save employee info
    }

    fun printInternalReport() {
        val hours: Double = hoursWorked?.toDouble() ?: 0.0
        //Imagine there is more code related to PTO, FTO, OOO
        return InternalReport().printPublicReport(id, hours, "today")
    }
}