package iteso.mx.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mCounter: TextView
    private lateinit var mDecrement: Button
    private lateinit var mIncrement: Button
    private lateinit var mReset: Button

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mCounter = findViewById(R.id.activity_main_tv_counter)
        mDecrement = findViewById(R.id.activity_main_btn_decrement)
        mIncrement = findViewById(R.id.activity_main_btn_increment)
        mReset = findViewById(R.id.activity_main_btn_reset)

        mDecrement.setOnClickListener {counter--
            mCounter.text = counter.toString()
        }
        mIncrement.setOnClickListener(this)
        mReset.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.activity_main_btn_decrement -> counter--
                R.id.activity_main_btn_increment -> counter++
                R.id.activity_main_btn_reset -> counter = 0
            }
            mCounter.text = counter.toString()
        }
    }
}
