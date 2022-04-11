package com.example.partieltest

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UserTDD {

    private var students: MutableList<UserTDD>? = null

    @Before
    fun setup() {
        students = mutableListOf()
    }

    @Test
    fun addStudent() {
        students?.add(Student("Yoan"))
        assertThat(students!!.size, equalTo(1))
    }

    @Test
    fun deleteStudent() {
        students?.remove(Student("Marius"))
        assertThat(students!!.size, equalTo(0)) //Hamcrest
        Assert.assertEquals(0, students!!.size)  // JUnit
    }

    @Test
    fun updateStudent() {
        assertThat(students!!.size, equalTo(1))
        val student = students!![0]
        student.name = "Yohann"
        assertThat(students!![0].name, equalTo("Yohann"))
    }
}