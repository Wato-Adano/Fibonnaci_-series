package com.akirachix.fibonacciseries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fibonacciGenerator = FibonacciGenerator()
        val fibonacciNumbers = fibonacciGenerator.generateFibonacciSequence(100)
        binding.tvNumber.layoutManager = LinearLayoutManager(this)
        val fibonacciAdapter = NumberRecyclerViewAdapter(fibonacciNumbers)
        binding.tvNumber.adapter = fibonacciAdapter
    }
}
class FibonacciGenerator {
    fun generateFibonacciSequence(n: Int): List<Int> {
        val fibSequence = mutableListOf(0, 1)
        var a = 0
        var b = 1
        while (fibSequence.size < n) {
            val sum = a + b
            if (sum < 0) {
                break
            }
            fibSequence.add(sum)
            a = b
            b = sum
        }
        return fibSequence
    }
}