package com.example.partieltest

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class UserJUnit {

    private var users : MutableList<User>? = null

    @Before
    fun setup()
    {
        users = mutableListOf()
    }

    @Test
    fun addUser() {
        users?.add(User(1, "Yoan", 21))
        assertEquals(1, users!!.size)
    }

    @Test
    fun deleteUser() {
        users?.remove(User(1, "Yoan", 21))
        assertEquals(0, users!!.size)
    }

    @Test
    fun updateUser(){
        users?.add(User(1, "Yoan", 21))
        assertEquals(1, users!!.size)
        val user = users!![0]
        user.name = "Yohann"
        user.age = 42
        assertEquals("Yohann", user.name)
        assertEquals(42, user.age)

    }
}