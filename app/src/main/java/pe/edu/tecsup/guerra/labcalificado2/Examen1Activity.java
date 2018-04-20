package pe.edu.tecsup.guerra.labcalificado2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.tecsup.guerra.labcalificado2.Repository.UserRepository;

public class Examen1Activity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen1);

        username = (EditText)findViewById(R.id.username_input_login);
        password = (EditText)findViewById(R.id.password_input_login);
    }


    public void validate_user(View view){
        String usern = username.getText().toString();
        String pass = password.getText().toString();
        if(usern.isEmpty() || pass.isEmpty() ){
            Toast.makeText(this, "debes completar los campos!", Toast.LENGTH_SHORT).show();
            return;
        }
        boolean val = UserRepository.validar(usern,pass);

        if (val==true){
            Toast.makeText(this, "User vacio >:(", Toast.LENGTH_SHORT).show();
            return;
        }else{
            Toast.makeText(this, "DAmn this", Toast.LENGTH_SHORT).show();
            return;
            /*Toast.makeText(this, "Error :v ", Toast.LENGTH_SHORT).show();
            return;*/
        }

    }


    public void new_user(View view){
        startActivity(new Intent(this, Examen1Activity.class));
        finish();
    }
}


