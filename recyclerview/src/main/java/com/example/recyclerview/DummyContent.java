package com.example.thirdapplication;

import android.content.res.Resources;
import android.util.Log;

import java.util.Random;


public class DummyContent {

    public static int ItemCount = 20;
    public final DummyItem[] items;

    public static DummyContent getContent() { return  new DummyContent(ItemCount); }

    private DummyContent(int count) {
        items = generate(count);
    }

    public DummyItem getItem(int position) { return items[position]; }

    public DummyItem getItemById(String id) { return items[Integer.parseInt(id)-1]; }

    public int getItemCount() { return items.length; }


    static DummyItem[] generate(int count) {

        DummyItem[] items = new DummyItem[count];
        for (int k = 1; k <= count; k++) {
            StringBuilder builder = new StringBuilder();
            builder.append("Информация об элементе: ").append(k);
            for (int j = 0; j < k; j++) {
                builder.append("\n Детальная информация. ");
            }
            items[k - 1] = new DummyItem(String.valueOf(k), "Элемент " + k, builder.toString());
        }

        return items;
    }
}
