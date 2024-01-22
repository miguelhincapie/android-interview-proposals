package solid.payment

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
