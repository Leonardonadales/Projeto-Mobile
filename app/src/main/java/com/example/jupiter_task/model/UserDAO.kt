package com.example.jupiter_task.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UserDAO(context: Context) : SQLiteOpenHelper(context, db_name, null, db_version) {
    companion object{
        private val db_name = "users.db"
        private val db_version = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
       db.execSQL("CREATE TABLE IF NOT EXIST users(id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT, password TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        if (newVersion > oldVersion) {
            db.execSQL("DROP TABLE users")
            onCreate(db)

        }
    }
}