package vn.edu.ntu.hongtrinh.nguyenthihongtrinh_57130174_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView thoigian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("life cycle", "onCreate called");
        Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();
        thoigian = findViewById(R.id.TG);
        SimpleDateFormat xD = new SimpleDateFormat("HH:mm:ss");
        String date = xD.format(new Date());
        thoigian.setText(date);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life cycle", "onStart called");
        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("life cycle", "onResume called");
        Toast.makeText(getApplicationContext(), "onResume called", Toast.LENGTH_SHORT).show();
        thoigian = findViewById(R.id.TG);
        SimpleDateFormat xD = new SimpleDateFormat("HH:mm:ss");
        String date = xD.format(new Date());
        thoigian.setText(date);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life cycle", "onRestart called");
        Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life cycle", "onPause called");
        Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life cycle", "onDestroy called");
        Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life cycle", "onStop called");
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_SHORT).show();
    }
}
