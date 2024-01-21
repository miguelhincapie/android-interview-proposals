package org.example.solid.payment

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CheckPaymentQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class TransferPaymentQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CreditCardPaymentQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CashPaymentQualifier