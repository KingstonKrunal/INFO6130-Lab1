package com.example.krunalshah.info6130_lab1

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class DialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_dialog, container, false)

        val cancelButton = view.findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener {
            dismiss()
        }

        val rGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
        val selectedId = rGroup.checkedRadioButtonId
        val radio = view.findViewById<RadioButton>(selectedId)

        val okButton = view.findViewById<Button>(R.id.okButton)
        okButton.setOnClickListener {
            Toast.makeText(context, "You chose $selectedId", Toast.LENGTH_LONG).show()
            dismiss()
        }

        return view
    }
}