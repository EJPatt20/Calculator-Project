package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.calculator.adapters.CalculatorGridAdapter
import com.example.calculator.data.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberGrid = findViewById<View>(R.id.calc_grid) as RecyclerView
        val calcComponents = mutableListOf<CalculatorComponent>()
        calcComponents.add(ClearButtonComponent())
        calcComponents.add(ParenthesisButtonComponent())
        calcComponents.add(PercentButtonComponent())
        calcComponents.add(PlusButtonComponent())
        for (i in 1..3) {
            val number = NumberButtonComponent(i.toString())
            calcComponents.add(number)
        }
        calcComponents.add(DivideButtonComponent())
        for (i in 4..6) {
            val number = NumberButtonComponent(i.toString())
            calcComponents.add(number)
        }
        calcComponents.add(MultiplyButtonComponent())
        for (i in 7..9) {
            val number = NumberButtonComponent(i.toString())
            calcComponents.add(number)
        }
        calcComponents.add(MinusButtonComponent())
        calcComponents.add(NumberButtonComponent("0"))
        calcComponents.add(DecimalButtonComponent())
        calcComponents.add(SignButtonComponent())
        calcComponents.add(EqualsButtonComponent())
        numberGrid.adapter = CalculatorGridAdapter(calcComponents)
        numberGrid.layoutManager = GridLayoutManager(this, 4)
    }
}