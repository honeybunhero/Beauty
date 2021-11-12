package app.beautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_MakeUp, btn_SkinCare, btn_BodyCare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_MakeUp = findViewById(R.id.btn_MakeUp);
        btn_SkinCare = findViewById(R.id.btn_SkinCare);
        btn_BodyCare = findViewById(R.id.btn_BodyCare);
    }

    public void OnSkinCareClick(View v) {
        Intent intent = new Intent(this, SkinCare.class);
        OpenActivity(intent);
    }

    public void OnMakeUpClick(View v) {
        Intent intent = new Intent(this, MakeUp.class);
        OpenActivity(intent);
    }

    public void OnBodyCareClick(View v) {
        Intent intent = new Intent(this, BodyCare.class);
        OpenActivity(intent);
    }

    void OpenActivity(Intent intent){
        startActivity(intent);
    }
}