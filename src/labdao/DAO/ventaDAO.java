package labdao.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import labdao.modelo.Venta;
public class ventaDAO {
conexion con;
    public ventaDAO() {
        this.con = new conexion();}
 
    public boolean insertarventa(int id, String Fecha, int Monto, String Sucursal){
        Connection accesoBD = con.getConexion();
        try{
            String sql="INSERT INTO venta (sucursal, monto, fecha, id_vendedor)" + " VALUES ('" +Sucursal+"', "+Monto+" ,'"+Fecha+"',"+id+")";
            Statement st = accesoBD.createStatement();
            st.executeUpdate(sql);
            return true;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al insertar venta");
            e.printStackTrace();
            return false;
        }}
    public ArrayList<Venta> getventas(){
        ArrayList<Venta> venta = new ArrayList<>();
        Connection accesoBD = con.getConexion();
        try{
            String sql="SELECT * FROM venta ";
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
            while ( resultados.next() ) {
                String sucursal = resultados.getString("sucursal");
                int monto = resultados.getInt("monto");
                int id = resultados.getInt("id_vendedor");
                String fecha = resultados.getString("fecha");
                venta.add(new Venta(id, fecha, monto,sucursal));}
            return venta;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }}
}