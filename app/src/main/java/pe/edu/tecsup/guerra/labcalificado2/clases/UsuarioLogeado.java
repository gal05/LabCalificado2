package pe.edu.tecsup.guerra.labcalificado2.clases;

public class UsuarioLogeado {

    private static String lemeromero;

    public static String getLemeromero() {
        return lemeromero;
    }

    public static void setLemeromero(String lemeromero) {
        UsuarioLogeado.lemeromero = lemeromero;
    }
}
