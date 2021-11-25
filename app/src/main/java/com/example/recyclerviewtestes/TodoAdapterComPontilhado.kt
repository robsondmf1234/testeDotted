package com.example.recyclerviewtestes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class TodoAdapterComPontilhado(
    var todos: List<TodoComPontilhado>,
) : Adapter<TodoViewVolderComPontilhado>() {

    lateinit var context: Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewVolderComPontilhado {
        context = parent.context
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_todo_pontilhado, parent, false)
        return TodoViewVolderComPontilhado(view)

/*
        context = parent.context
        return TodoViewVolder(inflate(parent.context, R.layout.item_todo,null))
*/
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewVolderComPontilhado, position: Int) {

        todos[position].run {
            val textTitle = todos[position].title
            val textDescription = todos[position].description
            val status = todos[position].isChecked



            holder.run {
                tvTitle.text = textTitle
                tvDescription.text = textDescription

                if (status) {
                    imagemStatus.setImageResource(R.drawable.application_completed)
                } else {
                    imagemStatus.setImageResource(R.drawable.application_not_completed)
                }

//                tvDescription.visibility = View.GONE

                val isLastItem = getItemCount() - 1 == position

                if (isLastItem) {
                    holder.also {
                        it.pontilhado.visibility = View.GONE
                        // it.tvDescription.visibility = View.GONE
                    }
                }


            }
        }

/*        val isLastItem = getItemCount() - 1 == position
        if (isLastItem) {

            val lastItemView = holder.itemView
            lastItemView.doOnLayout {
                val recyclerViewHeight = recyclerView.height
                val lastItemBottom = lastItemView.bottom
                val heightDifference = recyclerViewHeight - lastItemBottom
                if (heightDifference > 0) {
                    lastItemView.minimumHeight = lastItemView.height + heightDifference
                }
            }
        }*/
    }
}
