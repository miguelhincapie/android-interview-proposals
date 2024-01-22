package solid.employee

import com.google.gson.annotations.SerializedName
import solid.payment.Payment
import solid.report.InternalReport

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