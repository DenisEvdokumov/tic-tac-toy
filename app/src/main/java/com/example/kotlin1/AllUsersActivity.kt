package com.example.kotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_all_users.*

class AllUsers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_users)
        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this)


    }

    override fun onStart() {
        super.onStart()


    }
}
