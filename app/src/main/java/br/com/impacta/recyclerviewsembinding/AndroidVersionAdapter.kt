package br.com.impacta.recyclerviewsembinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AndroidVersionAdapter(var conjuntoDados: MutableList<String>) :
    RecyclerView.Adapter<AndroidVersionAdapter.AndroidVersionViewHolder>() {

    class AndroidVersionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView
        var imageView: ImageView

        init {
            textView = view.findViewById(R.id.textView)
            imageView = view.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidVersionViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return AndroidVersionViewHolder(view)
    }

    override fun onBindViewHolder(holder: AndroidVersionViewHolder, position: Int) {
        holder.textView.text = conjuntoDados[position]
    }

    override fun getItemCount(): Int {
        return conjuntoDados.size
    }

}