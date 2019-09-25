package labdao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import labdao.DAO.ventaDAO;
import labdao.modelo.Vendedor;
import labdao.modelo.Venta;
import labdao.vista.Reporte;
import labdao.vista.registrarventa;

public class controlador implements ActionListener {
    private registrarventa re;
    private ventaDAO ventas;
    private Reporte reportes;
    private int mes;
    public controlador(registrarventa reg, ventaDAO ventas) {
        this.re = reg;
        this.ventas = ventas;
    }
        public controlador(Reporte reporte, int meseselegido) {
            this.reportes = reporte;
            this.mes = meseselegido;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String t = e.getActionCommand();
        if (t.equals("registrarventas")){
        String fecha = re.getFechaTf().getText();
        int monto = Integer.parseInt(re.getMontoTf().getText());
        String Sucursal = re.getSucursalCb().getSelectedItem().toString();
        Vendedor vendedor = (Vendedor) re.getVendedorCb().getSelectedItem();
        ventas.insertarventa(vendedor.getId(), fecha, monto, Sucursal);}
        else{
            int totalventas=0;
            ArrayList<Venta> todasventas = ventas.getventas();
            for(int i=0;i<todasventas.size();i++){
                Venta v = todasventas.get(i);
                String mes = todasventas.get(i).getFecha();
                String[] meses = mes.split("-");
                int mesenint = Integer.parseInt(meses[1]);
                if(this.mes+1 == mesenint){
                    totalventas= totalventas +1;
                }
            }
        }
        
    }
    
}
