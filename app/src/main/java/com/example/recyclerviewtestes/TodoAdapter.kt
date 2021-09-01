package com.example.recyclerviewtestes

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class TodoAdapter(
    var todos: List<Todo>
) : Adapter<TodoViewVolder>() {

    lateinit var context: Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewVolder {
        context = parent.context
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_todo, parent, false)
        return TodoViewVolder(view)

/*
        context = parent.context
        return TodoViewVolder(inflate(parent.context, R.layout.item_todo,null))
*/
    }

    override fun onBindViewHolder(
        holder: com.example.recyclerviewtestes.TodoViewVolder,
        position: Int
    ) {
        todos[position].run {
            val textTitle = todos[position].title
            val isChecked: Boolean = todos[position].isChecked


            holder.run {
                tvTitle.text = textTitle
                cbDone.isChecked = isChecked
            }
        }

    }

    override fun getItemCount(): Int {
        return todos.size
    }


}