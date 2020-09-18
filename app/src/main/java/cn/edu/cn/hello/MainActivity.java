package cn.edu.cn.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R：资源文件，来自res目录
        setContentView(R.layout.activity_main4);

        EditText input = findViewById(R.id.editTextTextPersonName2);
        String str = input.getText().toString();
        double degreeC = 0.0;
        degreeC = Double.parseDouble(str);

        Button button = findViewById(R.id.bottom);
        final double finalDegreeC = degreeC;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degreeF = 0;
                degreeF = (finalDegreeC *1.8) + 32.0;
                TextView output = findViewById(R.id.textView2);
                String result = output.getText().toString()+degreeF;
                output.setText(result);
            }
        });


    }

}