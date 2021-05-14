package com.example.calculator.data

abstract class CalculatorComponent(
    open val value: String,
)

data class PlusButtonComponent(
    override val value: String = "+",

) : CalculatorComponent(value)

data class MinusButtonComponent(
    override val value: String = "-",

) : CalculatorComponent(value)

data class DivideButtonComponent(
    override val value: String = "÷",

) : CalculatorComponent(value)

data class MultiplyButtonComponent(
    override val value: String = "×",

) : CalculatorComponent(value)

data class PercentButtonComponent(
    override val value: String = "%",

) : CalculatorComponent(value)

data class ParenthesisButtonComponent(
    override val value: String = "%",

) : CalculatorComponent(value)

data class ClearButtonComponent(
    override val value: String = "⬅",

    ) : CalculatorComponent(value)

data class DecimalButtonComponent(
    override val value: String = ".",

    ) : CalculatorComponent(value)

data class SignButtonComponent(
    override val value: String = "+/-",

    ) : CalculatorComponent(value)

data class EqualsButtonComponent(
    override val value: String = "=",

    ) : CalculatorComponent(value)

data class NumberButtonComponent(
    override val value: String,
    val intVal: Int = value.toInt()

    ) : CalculatorComponent(value)