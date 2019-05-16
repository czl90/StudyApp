package com.example.studyapp_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private Button button;
    private EditText id,pd,ph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        button=findViewById(R.id.btn_1);
        id=findViewById(R.id.edit_1);
        ph=findViewById(R.id.edit_2);
        pd=findViewById(R.id.edit_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (id.getText().toString().trim().equals("123")&&ph.getText().toString().trim().equals("13289076543")&&pd.getText().toString().trim().equals("12345")) {
                    Toast.makeText(EditTextActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(EditTextActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                }

            }
        });
        id.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edittext",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
