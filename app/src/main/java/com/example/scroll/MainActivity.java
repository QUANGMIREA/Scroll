package com.example.scroll;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        LinearLayout linearLayout = findViewById(R.id.linear_layout);
        EditText editText = findViewById(R.id.edit_text);
        Button addButton = findViewById(R.id.add_button);
        // Optionally, you can add TextViews dynamically here
        for (int i = 2; i <= 100; i++) { // Example to add more TextViews dynamically
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setText("Item " + i);
            textView.setPadding(0, 10, 0, 10); // Set padding as needed
            linearLayout.addView(textView);
        }
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                if (!inputText.isEmpty()) {
                    TextView textView = new TextView(MainActivity.this);
                    textView.setLayoutParams(new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    textView.setText(inputText);
                    textView.setPadding(0, 10, 0, 10); // Set padding as needed

                    linearLayout.addView(textView);
                    editText.setText(""); // Clear the EditText for new input
                }
            }
        });
    }
}
