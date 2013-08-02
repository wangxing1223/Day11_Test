package com.example.Day11_Test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    final String msg1 = "时间显示长点";
    final String msg2 = "时间显示短点";
    private Button button1 = null;
    private Button button2 = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t1 = Toast.makeText(MyActivity.this,msg1,Toast.LENGTH_LONG);
                t1.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t2 = Toast.makeText(getApplicationContext(),msg2,Toast.LENGTH_SHORT);
                t2.show();
            }
        });
    }
}
