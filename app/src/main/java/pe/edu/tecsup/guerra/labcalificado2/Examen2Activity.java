package pe.edu.tecsup.guerra.labcalificado2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import pe.edu.tecsup.guerra.labcalificado2.Adapter.ProductAdapter;
import pe.edu.tecsup.guerra.labcalificado2.Repository.ProducRepository;
import pe.edu.tecsup.guerra.labcalificado2.Repository.UserRepository;
import pe.edu.tecsup.guerra.labcalificado2.clases.Producto;

public class Examen2Activity extends AppCompatActivity {

    private static final int REGISTER_FORM_REQUEST = 110;
    private static final int RESTART = 103;

    private RecyclerView productList;
    private TextView meromero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen2);

        productList = (RecyclerView) findViewById(R.id.user_list);
        meromero=(TextView)findViewById(R.id.wellcomeUser);
        meromero.setText("Bienvenido  "+UserRepository.loooooooool);


        productList.setLayoutManager(new LinearLayoutManager(this));

        // Set Data Adapter to ReciclerView
        List<Producto> productos = ProducRepository.list();
        productList.setAdapter(new ProductAdapter(productos));




    }

    public void borrartodo(View view){
        ProducRepository.borrartodo();
        startActivityForResult(new Intent(this, Examen2Activity.class), RESTART);
        finish();

    }

    public void mostrarfavoritos(View view){


    }

    public void callRegisterProductForm(View view){
        startActivityForResult(new Intent(this, RegisterProductActivity.class), REGISTER_FORM_REQUEST);
        finish();
    }
}
