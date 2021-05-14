package com.example.calculator.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.calculator.R
import com.example.calculator.data.CalculatorComponent

class CalculatorGridAdapter(private val calcComponents: List<CalculatorComponent>) :
    RecyclerView.Adapter<CalculatorGridAdapter.CalculatorViewHolder>() {

    override fun onBindViewHolder(calcViewHolder: CalculatorViewHolder, position: Int) {
        calcViewHolder.button.text = calcComponents[position].value

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalculatorViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.calc_grid_button, parent, false)

        return CalculatorViewHolder(v)
    }

    override fun getItemCount(): Int {
        return calcComponents.size
    }

    class CalculatorViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val button: Button = v.findViewById(R.id.calcComponent)
    }
}