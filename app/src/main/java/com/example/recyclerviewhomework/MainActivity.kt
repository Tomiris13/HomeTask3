package com.example.recyclerviewhomework

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewhomework.databinding.ActivityMainBinding
//tomiris
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var mutableList = mutableListOf(
        R.string.nursultan,
        R.string.aktau,
        R.string.aktobe,
        R.string.almaty,
        R.string.atyrau,
        R.string.kostanay,
        R.string.kyzylorda,
        R.string.oral,
        R.string.oskemen,
        R.string.pavlodar,
        R.string.petropavl,
        R.string.semey,
        R.string.shymkent,
        R.string.taraz,
        R.string.tashkent,
        R.string.turkistan
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rate = getLists(this)
        binding.recyclerView.adapter = TownAdapter(rate)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)


    }





   private fun getLists(context : Context) : MutableList<String>{
        val itemList : MutableList<String> = mutableListOf()
        mutableList.forEach{
            itemList.add(context.getString(it))
        }
       return itemList
    }
}