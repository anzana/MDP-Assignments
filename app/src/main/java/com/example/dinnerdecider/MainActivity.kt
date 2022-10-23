package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val foodList = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addFoodButton.setOnClickListener {
            if (addNewFoodEditText.text.isEmpty()) {
                Toast.makeText(this, "Please enter a food", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val newFood = addNewFoodEditText.text.toString()
            foodList.add(newFood)
            addNewFoodEditText.text.clear()
            println(foodList)
            Toast.makeText(this, "Added $newFood", Toast.LENGTH_SHORT).show()
      }
        decideButton.setOnClickListener {
          val random = Random()
          val randomFood = random.nextInt(foodList.count())
         dinnerText.text = foodList[randomFood]
        }
  }
}