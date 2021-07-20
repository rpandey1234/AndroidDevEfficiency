package com.rkpandey.devefficiency

import android.util.Log

private const val TAG = "EmployeeSickDayManager"

class EmployeeSickDayManager : EmployeeManager() {
    // Refactor to correct the spelling of this variable
    var sickDays: Int

    init {
        // Use multiple cursors to change the log level
        Log.i(TAG, "constructing EmployeeSickDayManager")
        sickDays = 0
    }

    fun addSickDays(days: Int) {
        Log.i(TAG, "addSickDays $days")
        sickDays += days
        Log.i(TAG, "Finished the body of the function addSickDays")
    }

    fun subtractSickDays(days: Int) {
        Log.i(TAG, "subtractSickDays $days")
        sickDays -= days
    }

    fun veryLongMethodNameWithManyParameters(
        param1: String, employeeId: Int,
        level: Int,
        manager: Employee
    ) {
    }

    fun wrongMethod() {}

    fun rightMethod() {}
}