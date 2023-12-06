package com.android.mcal

class Calculator {
    fun addOperation (operation: AddOperation, num1: Int, num2: Int) : Double {
        return operation.operate(num1,num2)
    }
    fun minusOperation (operation: MinusOperation, num1: Int,num2: Int) : Double {
        return operation.operate(num1,num2)
    }
    fun multipleOperation (operation: MultipeOperation, num1: Int, num2: Int) : Double {
        return operation.operate(num1,num2)
    }
    fun divideOperation (operation: DivideOperation, num1: Int, num2: Int) : Double {
        return operation.operate(num1,num2)
    }



}