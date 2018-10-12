package com.example.guldana.aboutfragment

import android.arch.persistence.room.*

@Dao
interface TodoDao {

    @Query("select * from todo")
    fun getAllTodos(): List<Todo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTodo(todo: Todo)


}