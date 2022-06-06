package com.example.krunalshah.info6130_lab1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InstructionsActivity : AppCompatActivity() {

    private lateinit var list: ListView
    private lateinit var levelText: TextView
    private lateinit var levelData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)

        list = findViewById(R.id.levelList)
        levelText = findViewById(R.id.levelTextView)
        levelData = findViewById(R.id.levelDataTextView)

        // showing the back button in action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val levels = arrayOf("Level 1", "Level 2", "Level 3", "Level 4")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, levels)

        list.adapter = arrayAdapter

        list.setOnItemClickListener { parent, view, position, _ ->
            if (position == 0) {
                levelText.text = getString(R.string.level_1)
                levelData.text = getString(R.string.level1Data)
            } else if (position == 1) {
                levelText.text = getString(R.string.level_2)
                levelData.text = getString(R.string.level2Data)
            } else if (position == 2) {
                levelText.text = getString(R.string.level_3)
                levelData.text = getString(R.string.level3Data)
            } else if (position == 3) {
                levelText.text = getString(R.string.level_4)
                levelData.text = getString(R.string.level4Data)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}