package com.example.jupiter_task.repository

import android.content.ContentValues
import android.content.Context
import androidx.compose.ui.platform.LocalContext
import com.example.jupiter_task.model.User
import com.example.jupiter_task.model.UserDAO


class UserRepository(val context:Context) {
    companion object{
        private val TABLE = "users"

    }
    private val db = UserDAO(LocalContext.current).writableDatabase

    fun insert (user:User): Long {
        val contentValues = ContentValues().apply {
            put("email",user.email)
            put("Password",user.password)
        }
        return db.insert(TABLE,null,contentValues)
    }
    fun finUser(user:User):User{
        var userResult:User?
        var cursor = db.query(TABLE, arrayOf("id","email","password",),"email = ? and password = ?",
            arrayOf(user.email,user.password),
        null,null,null
        )
        cursor.moveToFirst()
        val id = cursor.getLong(0)
        val email = cursor.getString(1)
        val password = cursor.getString(2)
        userResult = User(id,email,password)
        return userResult
    }
}

