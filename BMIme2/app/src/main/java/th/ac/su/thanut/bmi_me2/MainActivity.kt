package th.ac.su.thanut.bmi_me2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var height = findViewById<EditText>(R.id.youheight)
        var weight = findViewById<EditText>(R.id.youweight)
        var cal = findViewById<Button>(R.id.bthcal)



        cal.setOnClickListener {


            var intent = Intent(this@MainActivity,activity_show_text::class.java)
            intent.putExtra("height",height.text.toString().toDouble())
            intent.putExtra("weight",weight.text.toString().toDouble())



            startActivity(intent)
            /// TODO
        }

    }
}
