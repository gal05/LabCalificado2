package pe.edu.tecsup.guerra.labcalificado2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.tecsup.guerra.labcalificado2.Repository.UserRepository;

public class RegisterActivity extends AppCompatActivity {
    private EditText fullnameInput;
    private EditText emailInput;
    private EditText passwordInput;
    private EditText usernameInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        fullnameInput = (EditText)findViewById(R.id.fullname_input);
        emailInput = (EditText)findViewById(R.id.email_input);
        passwordInput = (EditText)findViewById(R.id.password_input);
        usernameInput = (EditText)findViewById(R.id.username_input);




    }

    public void callRegister(View view){
        String fullname = fullnameInput.getText().toString();
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();
        String username = passwordInput.getText().toString();

        if(fullname.isEmpty() || email.isEmpty() || password.isEmpty()|| username.isEmpty()){
            Toast.makeText(this, "You must complete these fields", Toast.LENGTH_SHORT).show();
            return;
        }

        UserRepository.create(username,password,fullname, email );

        finish();

    }

    public void GoToExamen(View view){
        startActivity(new Intent(this, Examen1Activity.class));
        finish();
    }

}
