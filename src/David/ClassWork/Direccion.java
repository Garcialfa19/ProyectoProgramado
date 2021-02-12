import java.awt.*;

public class Direccion {

    public String DireccionGeneral;
    public String Distrito;
    public String Canton;
    public String Provincia;
    public Image imagen;


    public Direccion(String direccionGeneral, String distrito, String canton, String provincia, Image imagen) {
        DireccionGeneral = direccionGeneral;
        Distrito = distrito;
        Canton = canton;
        Provincia = provincia;
        this.imagen = imagen;
    }
}
