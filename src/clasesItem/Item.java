package clasesItem;
import Interfaces.I_toJSON;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable, I_toJSON
{
    private static final long serialVersionUID = -5284393591033893144L;

    private double precio; //chek
    private String nombreDuenio; //es el nombre del usuario
    private String descrip; //chek
    private String id; //chek

    public Item() {
        precio = 0;
        nombreDuenio = "";
        descrip = "";
        id = "";
    }

    public Item(double precio, String nombreDuenio, String descrip, String id) {
        this.precio = 0;
        this.nombreDuenio = nombreDuenio;
        this.descrip = descrip;
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return Double.compare(item.getPrecio(), getPrecio()) == 0 && Objects.equals(getNombreDuenio(), item.getNombreDuenio()) && Objects.equals(getDescrip(), item.getDescrip()) && Objects.equals(getId(), item.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrecio(), getNombreDuenio(), getDescrip(), getId());
    }

    @Override
    public String toString() {
        return "\n ******************** Item ********************\n"+
                "| precio = " + precio +"\n"+
                "| nombreDuenio = " + nombreDuenio +"\n"+
                "| descrip = " + descrip +"\n"+
                "| id = " + id +"\n";
    }

    @Override
    public JSONObject toJson() throws JSONException {
        return null;
    }

    @Override
    public void fromJson(JSONObject cartaJson) throws JSONException
    {

    }
}
