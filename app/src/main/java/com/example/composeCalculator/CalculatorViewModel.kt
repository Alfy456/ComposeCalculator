package com.example.composeCalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {


    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(calculatorActions: CalculatorActions) {
       when(calculatorActions){
           is CalculatorActions.Number -> enterNumber(calculatorActions.number)
           is CalculatorActions.Decimal -> enterDecimal()
           is CalculatorActions.Clear -> state = CalculatorState()
           is CalculatorActions.Operation -> enterOperation(calculatorActions.operation)
           is CalculatorActions.Calculate -> performCalculation()
           is CalculatorActions.Delete -> performDeletion()

       }
    }

    private fun performDeletion() {


    }

    private fun performCalculation() {


    }

    private fun enterOperation(operation: CalculatorOperation) {

    }

    private fun enterDecimal() {


    }

    private fun enterNumber(number: Int) {

    }
}