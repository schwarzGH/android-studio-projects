package com.example.phrase_gen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button generator = (Button)findViewById(R.id.generator);
        final TextView output = (TextView) findViewById(R.id.tv1);
        final TextView result = (TextView) findViewById(R.id.tv_result);


        generator.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        String text = Phraser.PhraserGen();
                        output.setText(String.format("Всё, что нам нужно - это %s.", text));
                        String text2 = text.substring(0, 1).toUpperCase() + text.substring(1);
                        result.setText(text2 + " - это всё, что нам нужно.");
                    }
                }
        );
    }
}
