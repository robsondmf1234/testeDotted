package com.example.recyclerviewtestes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvTodos: RecyclerView
    lateinit var btnAddTodo: Button
    lateinit var edtTodo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prepareLayout()

        /*var todoList = mutableListOf(
            Todo("Tarefa 1", false),
            Todo("Tarefa 2", true),
            Todo("Tarefa 3", false),
            Todo("Tarefa 4", true),
            Todo("Tarefa 5", false),
            Todo("Tarefa 6", true),
            Todo("Tarefa 2", true),
            Todo("Tarefa 3", false),
            Todo("Tarefa 4", true),
            Todo("Tarefa 5", false),
            Todo("Tarefa 6", true),
        )
*/

        var todoListPontilhado = mutableListOf(
            TodoComPontilhado("Tarefa 1", "Teste", true),
            TodoComPontilhado("Tarefa 2", "Teste", true),
            TodoComPontilhado("Tarefa 3", "Teste", true),
            TodoComPontilhado("Tarefa 4", "Teste", false),
            TodoComPontilhado("Tarefa 5", "Teste", true),
            TodoComPontilhado("Tarefa 7", "Teste", true),
            TodoComPontilhado("Tarefa 8", "Teste", true),
            TodoComPontilhado("Tarefa 9", "Teste", true),
            TodoComPontilhado("Tarefa 9", "Teste", true),
            TodoComPontilhado("Tarefa 10", "Teste", true),
            TodoComPontilhado("Tarefa 1", "Teste", true),
            TodoComPontilhado("Tarefa 2", "Teste", true),
            TodoComPontilhado("Tarefa 3", "Teste", true),
            TodoComPontilhado("Tarefa 4", "Teste", true),
            TodoComPontilhado("Tarefa 5", "Teste", true),
            TodoComPontilhado("Tarefa 6", "Teste", true),
            TodoComPontilhado("Tarefa 7", "Teste", true),
            TodoComPontilhado("Tarefa 8", "Teste", true),
            TodoComPontilhado("Tarefa 9", "Teste", true),
            TodoComPontilhado("Tarefa 10", "Teste", true)
        )

        val adapter = TodoAdapterComPontilhado(todoListPontilhado)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val titulo: String = edtTodo.text.toString()
            val todo = TodoComPontilhado(titulo, "Descrição", false)
            todoListPontilhado.add(todo)

//            todoListPontilhado.clear()

//            todoListPontilhado.addAll(todoListPontilhado)
            adapter.notifyItemInserted(todoListPontilhado.size - 1)
            adapter.notifyDataSetChanged()


        }

    }

    private fun prepareLayout() {
        rvTodos = findViewById(R.id.rvTodos)
        btnAddTodo = findViewById(R.id.btnAddTarefa)
        edtTodo = findViewById(R.id.edtTodo)
    }

}