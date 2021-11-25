package com.example.recyclerviewtestes

import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView

class TodoViewVolderComPontilhado(view: View) : RecyclerView.ViewHolder(view) {

    val tvTitle: TextView by lazy {
        view.findViewById(R.id.tvBottomSheetItem)
    }

    val tvDescription: TextView by lazy {
        view.findViewById(R.id.tvBottomSheetItemDescription)
    }

    val pontilhado: View by lazy {
        view.findViewById(R.id.pontilhado)
    }

    val imagemStatus: AppCompatImageView by lazy {
        view.findViewById(R.id.imgIconTracking2)
    }

}