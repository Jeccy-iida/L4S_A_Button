package app.iida.jessy.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)

        //OnClickListener
        button.setOnClickListener{
            //つけたい機能
        }

        //fun
        fun chagne(view: View){
            //つけたい機能
        }
    }
}