package br.com.impacta.recyclerviewsembinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private val AndroidVersionList = mutableListOf<String>(
        "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
        "Honycomb", "Ice cream sandwich", "Jelly Bean",
        "Kitkat", "Lollipop", "Marshmallow", "Nougat",
        "Oreo", "Pie", "11", "12", "13"
    )

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val adapter = AndroidVersionAdapter(AndroidVersionList)
        recyclerView?.layoutManager = Line(2, RecyclerView.VERTICAL)
        recyclerView?.adapter = adapter
    }
}