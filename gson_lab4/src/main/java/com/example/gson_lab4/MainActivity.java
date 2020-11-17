package com.example.gson_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    TextView tv_cat;
    TextView tv_address;
    View view_color;
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_cat = (TextView) findViewById(R.id.tv_cat);
        tv_address = (TextView) findViewById(R.id.tv_address);
        view_color = (View) findViewById(R.id.view_color);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        Gson gson = new Gson();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cat jsoncat = new Cat();
                jsoncat.name = "Вельзевул";
                jsoncat.age = 30;

                jsoncat.color = Color.BLACK;
                jsoncat.address = new Address("Арбат", "Москва", "Россия");


                String[] jsonstring = (gson.toJson(jsoncat)).split("\"");
                tv_cat.setText(String.format("Кот: %s, %s лет, цвет:", jsonstring[21], jsonstring[16].substring(1,3)));
                tv_address.setText(String.format("Адрес: страна %s, город %s, улица %s", jsonstring[9], jsonstring[5], jsonstring[13]));
                view_color.setBackgroundColor(Integer.parseInt(jsonstring[18].substring(1,10)));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String jsontext = "{\"address\":{\"city\":\"Пермь\",\"country\":\"Россия\",\"street\":\"Ленина\"},\"age\":5,\"color\":-65281,\"name\":\"Леопольд\"}";
                Cat leopold = gson.fromJson(jsontext, Cat.class);
                tv_cat.setText(String.format("Кот: %s, %s лет, цвет:", leopold.name, leopold.age));
                tv_address.setText(String.format("Адрес: страна %s, город %s, улица %s", leopold.address.country, leopold.address.city, leopold.address.street));
                view_color.setBackgroundColor(leopold.color);
            }
        });

    }







}