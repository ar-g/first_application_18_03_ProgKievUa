package e.ar_g.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    View view = findViewById(R.id.tvHelloWorld);

    view.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Toast.makeText(MainActivity.this, R.string.hello, Toast.LENGTH_LONG).show();
      }
    });
  }

  @Override protected void onStart() {
    super.onStart();

    Log.d(MainActivity.class.getSimpleName(),"аппликация стартовала");
  }
}
