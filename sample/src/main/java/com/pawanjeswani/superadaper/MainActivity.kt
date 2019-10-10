package com.pawanjeswani.superadaper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usersList = arrayListOf<User>()

        for (i in 0 until 9) {
            val user = User()
            user.id = i+1
            user.name = "first user"
            user.phoneNo = 9009009009
            usersList.add(user)
        }
        val userAdapter = UserAdapter()
        userAdapter.setUserList(usersList)
        val llm = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rv_useres.layoutManager = llm
        rv_useres.adapter = userAdapter

    }
}
