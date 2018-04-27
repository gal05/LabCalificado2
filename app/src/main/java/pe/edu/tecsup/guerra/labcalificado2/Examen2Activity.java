package pe.edu.tecsup.guerra.labcalificado2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import pe.edu.tecsup.guerra.labcalificado2.Adapter.ProductAdapter;
import pe.edu.tecsup.guerra.labcalificado2.Repository.ProducRepository;
import pe.edu.tecsup.guerra.labcalificado2.clases.Producto;

public class Examen2Activity extends AppCompatActivity {

    private static final int REGISTER_FORM_REQUEST = 110;

    private RecyclerView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen2);

        productList = (RecyclerView) findViewById(R.id.user_list);
        productList.setLayoutManager(new LinearLayoutManager(this));

        // Set Data Adapter to ReciclerView
        List<Producto> productos = ProducRepository.list();
        productList.setAdapter(new ProductAdapter(productos));


    }


    public void callRegisterProductForm(View view){
        startActivityForResult(new Intent(this, RegisterProductActivity.class), REGISTER_FORM_REQUEST);
        finish();
    }
}
