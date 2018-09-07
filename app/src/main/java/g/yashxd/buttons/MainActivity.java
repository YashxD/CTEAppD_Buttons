package g.yashxd.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    EditText editText1;
    EditText editText2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.tv1);
        editText1 = findViewById(R.id.et1);
        editText2 = findViewById(R.id.et2);
        button1 = findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int result = num1 + num2;
                textView1.setText(result + " ");

            }
        });
    }
}
