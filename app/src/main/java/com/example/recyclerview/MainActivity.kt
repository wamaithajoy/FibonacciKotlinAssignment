package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var number=fabonacci(100)
        println(number)
        binding.rvFibonacci.layoutManager= LinearLayoutManager(this)
        binding.rvFibonacci.adapter=fibonnacCiRecyclerView(number)
    }
    fun fabonacci(numbers:Int):List<Int>{
        var list=ArrayList<Int>()
        var i = 1
        var t1 = 0
        var t2 = 1
        print("First $numbers terms: ")
        while (i <= numbers) {
            println(t1)
            val sum = t1 + t2
            t1 = t2
            t2 = sum
            i++
            list+=sum
        }
        return list
    }
}