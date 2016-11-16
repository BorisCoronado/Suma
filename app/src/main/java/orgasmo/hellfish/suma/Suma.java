package orgasmo.hellfish.suma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Suma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }

    public void calcularSuma(View view){
        EditText n1 = (EditText)findViewById(R.id.editText);
        EditText n2 = (EditText)findViewById(R.id.editText3);
        int numero1 = Integer.parseInt(n1.getText().toString());
        int numero2 = Integer.parseInt(n2.getText().toString());
        int suma = numero1 + numero2;
        Toast.makeText(this, "La Suma Es: " + suma,Toast.LENGTH_LONG).show();
    }
}
