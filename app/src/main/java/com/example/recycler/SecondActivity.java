package com.example.recycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    ImageView img;
    TextView name, description;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        img = findViewById(R.id.imageView);
        name = findViewById(R.id.group_name);
        description = findViewById(R.id.description);
        btn = findViewById(R.id.btn);

        Intent intent = getIntent();
        String namee = intent.getStringExtra("name");
        int imagee = intent.getIntExtra("image", 0);
        String descriptionn = intent.getStringExtra("description");

        name.setText(namee);
        description.setText(descriptionn);
        img.setImageResource(imagee);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}