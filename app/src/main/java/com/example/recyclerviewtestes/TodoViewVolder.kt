package com.example.recyclerviewtestes

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoViewVolder(view: View) : RecyclerView.ViewHolder(view) {

    val tvTitle: TextView by lazy {
        view.findViewById(R.id.tvTitle)
    }

    val cbDone: CheckBox by lazy {
        view.findViewById(R.id.cbDone)
    }

}