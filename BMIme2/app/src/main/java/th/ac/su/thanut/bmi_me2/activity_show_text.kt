package th.ac.su.thanut.bmi_me2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class activity_show_text : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_text)
        val height = intent.getDoubleExtra("height", -1.0)
        val weight = intent.getDoubleExtra("weight", -1.0)

        var handw = findViewById<TextView>(R.id.handw)

        var bmiis = findViewById<TextView>(R.id.bmiis)
        var valuee = findViewById<TextView>(R.id.valuee)
        var heightformcm: Double = 0.0
        var result: Double = 0.0

        heightformcm = height / 100
        result = weight / (heightformcm * heightformcm)

        handw.setText(result.toString())

        if (result < 18.50) {
            bmiis.setText("(Underweight)")

        } else if (result >= 18.50 && result <= 25.00) {
            bmiis.setText("(Healthy)")

        } else if (result > 25.00 && result <= 30.00) {
            bmiis.setText("(Overweight)")

        } else if (result > 30) {
            bmiis.setText("(Obese)")

        }

        valuee.setText("height :" + height.toString() + "weight :" + weight.toString())

        var btnShare = findViewById<Button>(R.id.btnShare)
        btnShare.setOnClickListener {

            val value = ("height :" + height.toString() + "weight :" + weight.toString())

            var intent = Intent();
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, value)
            intent.type = "text/plan"

            startActivity(Intent.createChooser(intent, "share info"))
        }
    }
}










