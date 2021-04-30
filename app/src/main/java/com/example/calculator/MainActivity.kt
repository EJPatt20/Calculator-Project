package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.calculator.adapters.CalculatorGridAdapter
import com.example.calculator.data.CalculatorComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberGrid = findViewById<View>(R.id.calc_grid) as RecyclerView
        val calcComponents = mutableListOf<CalculatorComponent>()
        calcComponents.add(CalculatorComponent("C"))
        calcComponents.add(CalculatorComponent("( )"))
        calcComponents.add(CalculatorComponent("%"))
        calcComponents.add(CalculatorComponent("⬅"))
        for (i in 1..3) {
            val number = CalculatorComponent(i.toString())
            calcComponents.add(number)
        }
        calcComponents.add(CalculatorComponent("÷"))
        for (i in 4..6) {
            val number = CalculatorComponent(i.toString())
            calcComponents.add(number)
        }
        calcComponents.add(CalculatorComponent("×"))
        for (i in 7..9) {
            val number = CalculatorComponent(i.toString())
            calcComponents.add(number)
        }
        calcComponents.add(CalculatorComponent("-"))
        calcComponents.add(CalculatorComponent("0"))
        calcComponents.add(CalculatorComponent("."))
        calcComponents.add(CalculatorComponent("+/-"))
        calcComponents.add(CalculatorComponent("="))
        numberGrid.adapter = CalculatorGridAdapter(calcComponents)
        numberGrid.layoutManager = GridLayoutManager(this, 4)

//        val operatorGrid = findViewById<View>(R.id.operator_grid) as RecyclerView
//        val operators = mutableListOf<Operator>()
//        operators.add(Operator(operator = "CLEAR"))
//        operators.add(Operator(operator = "."))
//        operators.add(Operator(operator = "+/-"))
//        operators.add(Operator(operator = "-"))
//        operators.add(Operator(operator = "+"))
//        operators.add(Operator(operator = "*"))
//        operators.add(Operator(operator = "/"))
//        operators.add(Operator(operator = "="))
//        operatorGrid.adapter = OperatorGridAdapter(operators)
//        operatorGrid.layoutManager = GridLayoutManager(this, 3)
    }
}