package org.example.solid.payment

import dagger.Binds

//@Module
//@InstallIn(SingletonComponent::class)
abstract class PaymentModule {

    @Binds
    @CheckPaymentQualifier
    abstract fun bindCheckPayment(payment: CheckPayment): Payment

    @Binds
    @TransferPaymentQualifier
    abstract fun bindTransferPayment(payment: TransferPayment): Payment

    @Binds
    @CreditCardPaymentQualifier
    abstract fun bindCreditCardPayment(payment: CreditCardPayment): Payment

    @Binds
    @CashPaymentQualifier
    abstract fun bindCashPayment(payment: CashPayment): Payment
}