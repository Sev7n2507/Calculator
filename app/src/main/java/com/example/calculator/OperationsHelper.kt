package com.example.calculator

class OperationsHelper {
    companion object {

        fun add(left_hand_side: Double, right_hand_side: Double): Double {
            return left_hand_side + right_hand_side
        }

        fun subtract(left_hand_side: Double, right_hand_side: Double): Double {
            return left_hand_side - right_hand_side
        }

        fun divide(left_hand_side: Double, right_hand_side: Double): Double {
            return left_hand_side / right_hand_side
        }

        fun multiply(left_hand_side: Double, right_hand_side: Double): Double {
            return left_hand_side * right_hand_side
        }
    }
}
