package com.pauldev.calcuraptor

sealed class CalculatorOperations (var symbol: String){
    object Add: CalculatorOperations("+")
    object Subtract: CalculatorOperations("-")
    object Multiply: CalculatorOperations("x")
    object Divide: CalculatorOperations("/")
    object Percent: CalculatorOperations("%")
    object Potency: CalculatorOperations("^")
    object Square: CalculatorOperations("✓")
    object Sen: CalculatorOperations("sen()")
    object Cos: CalculatorOperations("cos()")
    object Tan: CalculatorOperations("tan()")
}