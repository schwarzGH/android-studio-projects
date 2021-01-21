package a.event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView textView = (TextView) findViewById(R.id.textView);
        switch (id)
        {
            case R.id.action_ButtonClick:
                Intent intent = new Intent(MainActivity.this, ButtonClickActivity.class);
                startActivity(intent);

            case R.id.action_MotionEvent:
                Intent intent2 = new Intent(MainActivity.this, MotionEventActivity.class);
                startActivity(intent2);

        }
        return super.onOptionsItemSelected(item);
    }
}