package labdao.modelo;
public class Venta {
    private int id;
    private String Fecha;
    private int Monto;
    private String Sucursal;
    public Venta(int id, String Fecha, int Monto, String Sucursal) {
        this.id = id;
        this.Fecha = Fecha;
        this.Monto = Monto;
        this.Sucursal = Sucursal;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    public int getMonto() {
        return Monto;
    }
    public void setMonto(int Monto) {
        this.Monto = Monto;
    }
    public String getSucursal() {
        return Sucursal;
    }
    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }
}
