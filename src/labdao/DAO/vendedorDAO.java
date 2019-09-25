package labdao.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import labdao.DAO.conexion;
import labdao.modelo.Vendedor;
public class vendedorDAO {
conexion con;
    public vendedorDAO() {
        this.con = new conexion();}
    public Vendedor getvendedor(int id){
        Vendedor p = null;
        Connection accesoBD = con.getConexion();
        try{
            String sql="SELECT * FROM vendedor WHERE IDPERSONA = "+id+"" ;
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
            if(resultados.first()){
                int id1 = resultados.getInt("id_vendedor");
                String Nombre = resultados.getString("nombre");
                String Apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
                p = new Vendedor(id1, Nombre, Apellido, rut);
            accesoBD.close();
            return p;}
            else{
                return null;
            }
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener vendedor");
            e.printStackTrace();
            return null;
        }}
        public ArrayList<Vendedor> getvendedores(){
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        Connection accesoBD = con.getConexion();
        try{
            String sql="SELECT * FROM vendedor ";
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
            while ( resultados.next() ) {
                int id = resultados.getInt("id_vendedor");
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
                vendedores.add(new Vendedor(id,  nombre,  apellido,  rut));}
            accesoBD.close();
            return vendedores;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }}
    
}