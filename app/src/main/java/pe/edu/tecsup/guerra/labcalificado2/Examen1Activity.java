package pe.edu.tecsup.guerra.labcalificado2;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import pe.edu.tecsup.guerra.labcalificado2.Repository.UserRepository;
import pe.edu.tecsup.guerra.labcalificado2.clases.User;

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
        final String usern = username.getText().toString();
        String pass = password.getText().toString();


        List<User> user_val = UserRepository.validar();

        User encontrado=UserRepository.find(user_val,usern,pass);



        if(usern.isEmpty() || pass.isEmpty() ){
            Toast.makeText(this, "debes completar los campos!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (encontrado==null){
            Toast.makeText(this, "Error en las credenciales", Toast.LENGTH_SHORT).show();
            return;
        }else{
           /* Intent i=new Intent(this,Examen2Activity.class);
            i.putExtra("owner",encontrado.getUnsername());
            startActivity(i);*///pero mejor aun para salir de apuro estatico nomas XDDDDDDDDDDDDDDDDDDD

            startActivity(new Intent(this, Examen2Activity.class));
            finish();
        }
   }


    public void new_user(View view){
        startActivity(new Intent(this, Examen1Activity.class));
        finish();
    }
}


