package com.example.ethyl.studentportal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPortalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_portal);

        Button addPortal = findViewById(R.id.addPortalBtn);
        addPortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText urlText = findViewById(R.id.urlText);
                EditText titleText = findViewById(R.id.titleText);
                Portal portal = new Portal(urlText.getText().toString(),titleText.getText().toString());
                Intent intent = new Intent();
                intent.putExtra("portal", portal);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
