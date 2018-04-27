package pe.edu.tecsup.guerra.labcalificado2.Repository;

import com.orm.SugarRecord;

import java.util.List;

import pe.edu.tecsup.guerra.labcalificado2.clases.Producto;

public class ProducRepository {

    public static List<Producto> list(){
        List<Producto> productos = SugarRecord.listAll(Producto.class);
        return productos;
    }

    public static Producto read(Long id){
        Producto producto = SugarRecord.findById(Producto.class, id);
        return producto;
    }

    public static void create(String nombre, String precio, String desc,String img,String owner){
        Producto producto = new Producto(nombre, precio,desc,img,"inicio",owner);
        SugarRecord.save(producto);
    }

    public static void update(String nombre, String precio, String desc,String img,Long id,String owner){
        Producto producto= SugarRecord.findById(Producto.class, id);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setDescripcion(desc);
        producto.setImganes(img);

        //user.setEmail(email);
        SugarRecord.save(producto);
    }

    public static void delete(Long id){
        Producto producto = SugarRecord.findById(Producto.class, id);
        SugarRecord.delete(producto);
    }





}
