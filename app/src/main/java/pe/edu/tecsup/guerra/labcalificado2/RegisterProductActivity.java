package pe.edu.tecsup.guerra.labcalificado2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.tecsup.guerra.labcalificado2.Repository.ProducRepository;
import pe.edu.tecsup.guerra.labcalificado2.Repository.UserRepository;

public class RegisterProductActivity extends AppCompatActivity {

    private EditText nameProduct;
    private EditText priceProduct;
    private EditText descProduct;
    private EditText imgProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_product);


        nameProduct=(EditText)findViewById(R.id.name_product);
        priceProduct=(EditText)findViewById(R.id.price_product);
        descProduct=(EditText)findViewById(R.id.desc_product);
        imgProduct=(EditText)findViewById(R.id.img_product);


    }





    public void callRegisterProducto(View view){
        String nombre_prodcut = nameProduct.getText().toString();
        String precio_product = priceProduct.getText().toString();
        String desc_product = descProduct.getText().toString();
        String img_product = imgProduct.getText().toString();

        if(nombre_prodcut.isEmpty() || precio_product.isEmpty() || desc_product.isEmpty()|| img_product.isEmpty()){
            Toast.makeText(this, "Deves completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }
        ProducRepository.create(nombre_prodcut,precio_product,desc_product, img_product);
        finish();

    }
}
