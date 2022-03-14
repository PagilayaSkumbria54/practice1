package ru.mirea.pashev_anton_bsbo_04_20.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClickButtons extends AppCompatActivity {
    private TextView tvout;
    private Button btnCancel;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buttons);

        tvout = (TextView) findViewById(R.id.tvOut);
        btnOK = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvout.setText("Нажата кнопка ОК");
            }
        };

        btnOK.setOnClickListener(oclBtnOK);
    }
    public void onMyButtonClick(View view){
        Toast.makeText(this, "Ещё один способ", Toast.LENGTH_SHORT).show();
    }
}