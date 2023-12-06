package com.android.mcal

fun main() {
    println("계산기")
    println("숫자를 입력하시오")
    var num1 = readLine()!!.toInt()
    println("연산자를 입력하시오")
    var oper = readLine()!!.toString()
    println("숫자를 입력하시오")
    var num2 = readLine()!!.toInt()

    val calc = Calculator()
    var result = 0.0

    if (oper == "+") {
        result = calc.addOperation(AddOperation(),num1,num2)
        println("$num1 더하기 $num2 결과는 : $result 입니다")
    } else if (oper == "-") {
        result = calc.minusOperation(MinusOperation(),num1,num2)
        println("$num1 빼기 $num2 결과는 : $result 입니다")
    } else if (oper == "*") {
        result = calc.multipleOperation(MultipeOperation(),num1,num2)
        println("$num1 곱하기 $num2 결과는 : $result 입니다")
    } else if (oper == "/") {
        result = calc.divideOperation(DivideOperation(),num1,num2)
        println("$num1 나누기 $num2 결과는 : $result 입니다")
    }else {
        println("다시 적으시오")
    }


    while (true) {


        println("여기서 더 계산 하시려면 [1]번을, 종료하시려면 다른 키를 누르시오.")

        var num3 = readLine()!!.toInt()


        if (num3 == 1) {
            println("연산자를 입력하시오")
        } else {
            println("종료합니다.")
            break
        }

        var opp2 = readLine()!!.toString()
        println("숫자를 입력하시오")
        var num4 = readLine()!!.toInt()

        var num5 = result.toInt()

        if (opp2 == "+") {
            result = calc.addOperation(AddOperation(),num5,num4)
            println("$num5 더하기 $num4 결과는 : $result 입니다")
        } else if (opp2 == "-") {
            result = calc.minusOperation(MinusOperation(),num5,num4)
            println("$num5 빼기 $num4 결과는 : $result 입니다")
        } else if (opp2 == "*") {
            result = calc.multipleOperation(MultipeOperation(),num5,num4)
            println("$num5 곱하기 $num4 결과는 : $result 입니다")
        } else if (opp2 == "/") {
            result = calc.divideOperation(DivideOperation(),num5,num4)
            println("$num5 나누기 $num4 결과는 : $result 입니다")
        }else {
            println("다시 적으시오")
        }
        continue
    }


    //println("1 더하기 2 결과는 : ${calc.addOperation(AddOperation(),1,2)}입니다")
    //println("1 빼기 2 결과는 : ${calc.minusOperation(MinusOperation(),1,2)}입니다")
    //println("1 곱하기 2 결과는 : ${calc.multipleOperation(MultipeOperation(),1,2)}입니다")
    //println("1 나누기 2 결과는 : ${calc.divideOperation(DivideOperation(),1,2)}입니다")

}








