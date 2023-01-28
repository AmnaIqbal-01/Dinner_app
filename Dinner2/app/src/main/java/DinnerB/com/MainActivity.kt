package DinnerB.com

import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import java.util.Random
import kotlin.random.Random as Random1


class MainActivity : AppCompatActivity() {
 val foodList = arrayListOf("Chinese","fastFood","indian","desi","eat" ,"nothing","air","grass","shut up you always eating")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 val button = findViewById<Button>(R.id.btnSelect) 
        val selectText = findViewById<TextView>(R.id.selectText)
button.setOnClickListener(){
    val random = Random()
    val randomFood = random.nextInt(foodList.count())
    selectText.text = foodList[randomFood]
}

    }}



