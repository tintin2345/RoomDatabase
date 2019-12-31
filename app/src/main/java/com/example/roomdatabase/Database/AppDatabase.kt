package com.example.roomdatabase.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabase.Entity.BookEntity
import com.example.roomdatabase.dao.BookDAO

@Database (entities=[(BookEntity::class)],version=1)

abstract class AppDatabase:RoomDatabase(){
    abstract  fun bookDao():BookDAO
}