package solid.payment

/**
 * The main task in this exercise is just add another payment type CASH and be able to
 * pay using the four payment types.
 *
 * The problem:
 * A naive solution would be just add the CASH type to the enum, create a private fun to pay using cash
 * and last, add the new case inside the "when" in pay function.
 *
 * What we are look for here is to know if the candidate knows about Open-closed principle.
 */
class Payment {

    fun pay(employeeId: Int, amount: Double, paymentType: PaymentType?) {
        when (paymentType) {
            PaymentType.CHECK -> payUsingCheck(employeeId, amount)
            PaymentType.TRANSFER -> payUsingTransfer(employeeId, amount)
            else -> payUsingCreditCard(employeeId, amount)
        }
    }

    private fun payUsingCheck(employeeId: Int, amount: Double) {
        // Don't implement it, just imagine there is working code here.
    }

    private fun payUsingTransfer(employeeId: Int, amount: Double) {
        // Don't implement it, just imagine there is working code here.
    }

    private fun payUsingCreditCard(employeeId: Int, amount: Double) {
        // Don't implement it, just imagine there is working code here.
    }

    enum class PaymentType {
        CHECK,
        TRANSFER,
        CREDIT_CARD
    }
}
