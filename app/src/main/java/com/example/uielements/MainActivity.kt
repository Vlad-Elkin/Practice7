package com.example.uielements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText = findViewById<EditText>(R.id.editText)
        var checkBox = findViewById<CheckBox>(R.id.checkBox)
        var toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        var button = findViewById<Button>(R.id.button)
        var textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            var s1:String="EditText: " + editText.text.toString();
            var s2:String="CheckBox: "+if(checkBox.isChecked){"ON"}else{"OFF"};
            var s3:String="ToggleButton: "+if (toggleButton.isChecked){"ON"}else{"OFF"};
            var s4:String=when(radioGroup.checkedRadioButtonId){
                -1 ->""
                else ->{
                    "RadioGroup: "+findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString()
                }
            }
            textView.text = s1+"\n"+s2+"\n"+s3+"\n"+s4
        }
    }
}