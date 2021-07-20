package com.rkpandey.devefficiency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "EmployeeActivity"
class EmployeeActivity : AppCompatActivity() {
    /**
     * Navigation shortcuts:
     * 1. Search everywhere
     * 2. Open tool window
     * 3. Close tool windows
     * 4. Open file (use fuzzy smart search)
     * 5. Jump to declaration
     * 6. Recent files
     * 7. Find usages
     * 8. Navigate between files: with tabs or by last location of cursor
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        val employee = Employee(123, "John", "Smith", false)
        Log.i(TAG, "Created new employee")

        // Save the employee name in a local variable
        val fullName = employee.fullName()

        val sickDayManager = EmployeeSickDayManager()
        sickDayManager.rightMethod()
        // Define method which takes in employee name and id
        myMethod(fullName, employee.employeeId)
    }

    private fun myMethod(fullName: String, employeeId: Int) {

    }
}