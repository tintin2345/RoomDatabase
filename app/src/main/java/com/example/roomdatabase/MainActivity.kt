package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.room.Room
import com.example.roomdatabase.Database.AppDatabase
import com.example.roomdatabase.Entity.BookEntity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bookId=findViewById<EditText>(R.id.edt_bookId)

        var bookName=findViewById<EditText>(R.id.edt_bookName)

        var insert=findViewById<Button>(R.id.btn_insert)

        var show=findViewById<Button>(R.id.btn_show)

        var db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "BookDB").build()


        Thread {
            var bookEntity = BookEntity()
            bookEntity.bookId = 1
            bookEntity.bookName = "Kotlin for Android Developer"

            bookEntity.bookId = 2
            bookEntity.bookName = "Developer"

            db.bookDao().saveBooks(bookEntity)

            db.bookDao().saveBooks(bookEntity)

            db.bookDao().getAllBooks().forEach() {
                Log.i("Retch Records", "Id::${it.bookId}")

                Log.i("Fetch Records", "Name::${it.bookName}")
            }
        }.start()
    }
}

