package co.il.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnadd;
    Button btnMinus;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd = (Button) findViewById(R.id.btnplus);
        btnMinus = (Button) findViewById(R.id.btnminus);
        tvDisplay = (TextView) findViewById(R.id.bj);
    }
}
