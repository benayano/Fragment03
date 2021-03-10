package com.example.fragment03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace(
                R.id.container_main,
                FragmentText.newInstance(
                    message = "this my message",
                    name = "moshe david",
                    phone = "000404580486"
                )
            )
        }

    }
}