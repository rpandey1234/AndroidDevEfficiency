package com.rkpandey.devefficiency

import android.util.Log

private const val TAG = "EmployeeSickDayManager"

class EmployeeSickDayManager : EmployeeManager() {
    // Refactor to correct the spelling of this variable
    var sikDays: Int
    init {
        // Use multiple cursors to change the log level
                        Log.e(TAG, "constructing EmployeeSickDayManager")
        sikDays = 0
    }

    fun addSickDays(days: Int) {
Log.e(TAG, "addSickDays $days")
                                sikDays += days
        Log.e(TAG, "Finished the body of the function addSickDays")
    }

    fun subtractSickDays(days: Int) {
        Log.e(TAG, "subtractSickDays $days")
        sikDays -= days
    }

    fun veryLongMethodNameWithManyParameters

                (
                          param1: String, employeeId: Int,
        level: Int,
        manager: Employee
    )


    {}

    fun wrongMethod() {}

    fun rightMethod() {}
}