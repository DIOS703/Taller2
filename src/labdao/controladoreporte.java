package labdao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import labdao.DAO.ventaDAO;
import labdao.modelo.Vendedor;
import labdao.modelo.Venta;
import labdao.vista.Reporte;
import labdao.vista.registrarventa;

public class controladoreporte implements ActionListener {
    private registrarventa re;
    private ventaDAO ventas;
    private Reporte reportes;
        public controladoreporte(Reporte reporte) {
            this.reportes = reporte;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
            int mese = reportes.getMesesCb().getSelectedIndex() +1 ;
            int totalventas=0;
            ArrayList<Integer> mayormonto = new ArrayList<>() ;
            ArrayList<Venta> todasventas = reportes.getVentas().getventas();
            for(int i=0;i<todasventas.size();i++){
                Venta v = todasventas.get(i);
                String mes = todasventas.get(i).getFecha();
                String[] meses = mes.split("-");
                int mesenint = Integer.parseInt(meses[1]);
                if(mese == mesenint){
                    totalventas= totalventas +1;
                    int mesEEE = todasventas.get(i).getMonto();
                    mayormonto.add(mesEEE);
                }
            }
            reportes.setTotalVentasLabel(Integer.toString(totalventas));
            if(Integer.toString(Collections.max(mayormonto))==null){
                reportes.setMayorVentaLabel("0");
            }
            else{
            reportes.setMayorVentaLabel(Integer.toString(Collections.max(mayormonto)));
            }
            if(Integer.toString(Collections.max(mayormonto)/totalventas)==null){
                reportes.setPromVentasLabel("0");
            }
            else{
            reportes.setPromVentasLabel(Integer.toString(Collections.max(mayormonto)/totalventas));
            }
        }
        
    }
    