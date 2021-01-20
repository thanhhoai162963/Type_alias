package com.example.typealiases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name: name = "!23"
        var id: id = 123
        var price: Double = 12.3
        var boo: boo = false
        var set: chuoi = setOf("1", "2")
        var map: api = mapOf("1" to 2, "2" to 3)
        var list:danhSachtyyyuj j  7 eeeruujujuujuuuu = listOf(1,2,4,5)
    }
}
typealias name = String
typealias id = Int
typealias chuoi = Set<String>
typealias boo = Boolean
typealias api = Map <String,Int>
typealias danhSach = List<Int>