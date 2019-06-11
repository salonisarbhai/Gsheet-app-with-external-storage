package e.saloni.task1;
package e.saloni.task1.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.os.Environment;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddItem = (Button) findViewById(R.id.btn_add_item);
        buttonAddItem.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if (v == buttonAddItem) {

                    Intent intent = new Intent(getApplicationContext(), AddItem.class);
                    startActivity(intent);
                }
            }
        });
    }
}

