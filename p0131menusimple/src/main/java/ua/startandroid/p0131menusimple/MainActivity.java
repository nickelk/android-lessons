package ua.startandroid.p0131menusimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Menu 1");
        menu.add("Menu 2");
        menu.add("Menu 3");
        menu.add("Menu 4");
        return super.onCreateOptionsMenu(menu);
    }
}
