package com.example.roomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomdatabase.Entity.BookEntity

@Dao
interface BookDAO {

    @Insert
    fun saveBooks(book: BookEntity)

    @Query(value="select * from BookEntity")
    fun getAllBooks():List<BookEntity>

}