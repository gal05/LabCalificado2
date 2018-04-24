package pe.edu.tecsup.guerra.labcalificado2.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.tecsup.guerra.labcalificado2.clases.Producto;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    //definiendo el List para guardar info de su respectiva clase
    private List<Producto> products;

    public List<Producto> getProducts() {
        return products;
    }

    public void setProducts(List<Producto> products) {
        this.products = products;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView  name;
        public  TextView price;
        public TextView description;
        public TextView label;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
           /* name=(TextView) itemView.findViewById();
            price=(TextView) itemView.findViewById();
            description=(TextView) itemView.findViewById();
            label=(TextView) itemView.findViewById();
            image=(ImageView) itemView.findViewById();*/
        }
    }

    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProductAdapter.ViewHolder holder, int position) {
       // Producto producto=this.products.get(position);
        //holder.;

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
