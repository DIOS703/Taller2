package labdao.vista;
import labdao.vista.Reporte;
import labdao.vista.registrarventa;
import java.awt.event.ActionEvent;
import javax.swing.*;
import labdao.DAO.vendedorDAO;
import labdao.DAO.ventaDAO;
public class Home extends JFrame{ 
    private JButton registrarVentaButton;
    private JButton verReporteButton;
    private ventaDAO ventas;
    private vendedorDAO vendedor;
    public Home() {
        super("Inicio");
        initComponents();
        //Codigo aquí
      
    }
    private void initComponents() {
        ventas = new ventaDAO();
        vendedor = new vendedorDAO();
        registrarVentaButton = new javax.swing.JButton();
        registrarVentaButton.addActionListener((e) ->{ accionboton1(e); });
        verReporteButton = new javax.swing.JButton();
        verReporteButton.addActionListener((e) ->{ accionboton2(e); });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrarVentaButton.setText("Registrar Venta");

        verReporteButton.setText("Ver Reporte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrarVentaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(verReporteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(registrarVentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verReporteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }
        private void accionboton1(ActionEvent e){
        registrarventa  v = new registrarventa( ventas, vendedor);
        v.setVisible(true);
    }
        private void accionboton2(ActionEvent e){
        Reporte  v = new Reporte(ventas, vendedor);
        v.setVisible(true);
    }
}
