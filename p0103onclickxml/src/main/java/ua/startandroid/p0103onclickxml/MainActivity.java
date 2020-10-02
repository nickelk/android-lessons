package ua.startandroid.p0103onclickxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);

    }

    public void onClickOk(View view){
        tvOut.setText("OK pressed");
    }

    public void onClickCancel(View view){
        tvOut.setText("Cancel pressed");
    }
}
