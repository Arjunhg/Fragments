package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val buttonClock = findViewById<Button>(R.id.btnClock)
        val buttonExam = findViewById<Button>(R.id.btnExam)
        val buttonValidate = findViewById<Button>(R.id.btnValidate)


        buttonClock.setOnClickListener {
            replaceFrameWithFragment(Clock_Fragments()) //calling the fragment
        }

        buttonExam.setOnClickListener {
            replaceFrameWithFragment(Date_Sheet())
        }

        buttonValidate.setOnClickListener {
            replaceFrameWithFragment(LoginFragment())
        }


    }

    private fun replaceFrameWithFragment(frag: Fragment) {
        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.frameLayout, frag)
        fragTransaction.commit()
    }
}