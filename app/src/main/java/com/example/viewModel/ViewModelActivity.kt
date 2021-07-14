package com.example.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.demoapp.R

class ViewModelActivity : AppCompatActivity() {


    var count:Int=0
    lateinit  var tvCount:TextView
    lateinit var btn_submit:Button
    lateinit var viewModelDemo: ViewModelDemo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        tvCount = findViewById(R.id.tv_count)
        btn_submit = findViewById(R.id.btn_submit)

        viewModelDemo = ViewModelProvider(this,ViewModelFactory(10)).get(ViewModelDemo::class.java)

        setText()

        btn_submit.setOnClickListener{
            viewModelDemo.increment()
            setText()
        }

    }

    fun setText(){
        tvCount.text = viewModelDemo.count.toString()
    }

}