package com.nasserkh.testproject1.View.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.nasserkh.testproject1.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton btnBack = findViewById(R.id.backBtn);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button editAvatar = findViewById(R.id.edit_avatar);
        editAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this,"ویرایش عکس کلیک شد", Toast.LENGTH_LONG);
            }
        });

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/b_yekan.ttf");

        EditText editText_firstName = findViewById(R.id.editText_firstName);
        editText_firstName.setTypeface(typeface);
        editText_firstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        EditText editText_LastName = findViewById(R.id.editText_LastName);
        editText_LastName .setTypeface(typeface);

        CheckBox javaCheckBox = findViewById(R.id.javaCheckBox);
        CheckBox cssCheckBox = findViewById(R.id.cssCheckBox);
        CheckBox htmlCheckBox = findViewById(R.id.htmlCheckBox);

        javaCheckBox.setTypeface(typeface);
        cssCheckBox.setTypeface(typeface);
        htmlCheckBox.setTypeface(typeface);

        javaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
Toast.makeText(ProfileActivity.this, String.valueOf(isChecked), Toast.LENGTH_SHORT).show();
            }
        });

        RadioButton maleRadioButton = findViewById(R.id.maleRadio);
        RadioButton femaleRadioButton = findViewById(R.id.femaleRadio);

        maleRadioButton.setTypeface(typeface);
        femaleRadioButton.setTypeface(typeface);

        maleRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(ProfileActivity.this, String.valueOf(isChecked), Toast.LENGTH_SHORT).show();
            }
        });

        Button saveForm = findViewById(R.id.saveForm);
        saveForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
