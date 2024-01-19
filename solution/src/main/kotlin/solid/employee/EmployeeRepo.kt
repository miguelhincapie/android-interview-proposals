package org.example.solid.employee

import javax.inject.Inject

/**
 * For a more strictly design, an interface would be created and placed in domain layer
 * and this implementation in data layer.
 */
class EmployeeRepo @Inject constructor() {

    fun save(employee: Employee) {
        //Imagine code related to save employee info
    }
}