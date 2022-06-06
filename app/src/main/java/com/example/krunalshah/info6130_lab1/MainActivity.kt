package com.example.krunalshah.info6130_lab1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var instructionButton: Button
    private lateinit var takeSurveyButton: Button
    private lateinit var survey: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        survey = findViewById(R.id.surveyText)

        instructionButton = findViewById(R.id.instructionButton)
        instructionButton.setOnClickListener {
            startActivity(Intent(this, InstructionsActivity::class.java))
        }

        takeSurveyButton = findViewById(R.id.takeSurveyButton)
        takeSurveyButton.setOnClickListener {
            val dialogFragment = DialogFragment()
            dialogFragment.show(supportFragmentManager, "DialogFragment")

            val dialog = dialogFragment.dialog
            dialog?.findViewById<Button>(R.id.okButton)?.setOnClickListener {
                val sText = survey.text
                survey.text = sText.toString() + "ABC"
            }
        }
    }
}