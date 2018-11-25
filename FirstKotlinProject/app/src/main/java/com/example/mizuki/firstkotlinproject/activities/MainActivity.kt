package com.example.mizuki.firstkotlinproject.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.mizuki.firstkotlinproject.R
import com.example.mizuki.firstkotlinproject.adapters.NewListRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : BaseActivity() {

    private var mAdapter : NewListRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        btn_login.setOnClickListener({
//
//            if (et_email.text.toString().equals("bluemoonhlaing@gmail.com" , ignoreCase = true) && et_password.text.toString().equals("1111") ){
//                Toast.makeText(this,"Correct!",Toast.LENGTH_LONG).show()
//            }
//            else{
//                Toast.makeText(this,"Wrong!",Toast.LENGTH_LONG).show()
//            }
//        })
        setUpRecyclerView()


    }

    private fun setUpRecyclerView() {
        mAdapter = NewListRecyclerAdapter()
        rv_dog.layoutManager = LinearLayoutManager(this)
        rv_dog.adapter = mAdapter


    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }
}



