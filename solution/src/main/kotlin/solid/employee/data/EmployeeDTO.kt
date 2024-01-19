package org.example.solid.employee.data

import com.google.gson.annotations.SerializedName
import org.example.solid.payment.Payment

data class EmployeeDTO(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String?,
    @SerializedName("hours_worked")
    val hoursWorked: String?,
    @SerializedName("payment_type")
    val paymentType: String?
)