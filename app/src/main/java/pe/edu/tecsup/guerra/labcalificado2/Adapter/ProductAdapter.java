package pe.edu.tecsup.guerra.labcalificado2.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.tecsup.guerra.labcalificado2.R;
import pe.edu.tecsup.guerra.labcalificado2.clases.Producto;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    //definiendo el List para guardar info de su respectiva clase
    private List<Producto> products;

    public ProductAdapter(List<Producto> products) {
        this.products = products;
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
            name=(TextView) itemView.findViewById(R.id.name_text);
            price=(TextView) itemView.findViewById(R.id.price_text);
            description=(TextView) itemView.findViewById(R.id.desc_text);
            label=(TextView) itemView.findViewById(R.id.label_text);
            image=(ImageView) itemView.findViewById(R.id.picture_image);
        }
    }

    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        ViewHolder viewHolder=new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProductAdapter.ViewHolder holder, int position) {
        Producto productos=products.get(position);

        holder.name.setText(productos.getNombre());
        holder.price.setText(productos.getPrecio());
        holder.description.setText(productos.getDescripcion());
        holder.label.setText(String.valueOf(productos.getEtiqueta1()));


        int resID=holder.itemView.getContext().getResources().getIdentifier(productos.getImganes(),"drawable",holder.itemView.getContext().getPackageName());
        holder.image.setImageResource(resID);
        //holder.pictureImage.setImageResource(R.drawable.gatonegro);// esto seria no dinamico

    }

    @Override
    public int getItemCount() {
        return this.products.size();
    }


}
