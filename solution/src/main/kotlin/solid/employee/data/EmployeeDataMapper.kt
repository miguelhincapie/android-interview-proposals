package org.example.solid.employee.data

import org.example.solid.employee.Employee
import javax.inject.Inject

class EmployeeDataMapper @Inject constructor() {

    fun EmployeeDTO.toDomain(): Employee {
        TODO()
    }

    fun Employee.toDTO(): EmployeeDTO {
        TODO()
    }
}