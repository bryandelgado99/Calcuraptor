package com.pauldev.calcuraptor

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    data class Operation(val operation: CalculatorOperations): CalculatorAction()
    object Calculate: CalculatorAction()
    object Decimal: CalculatorAction()
}
