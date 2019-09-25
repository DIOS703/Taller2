package labdao.vista;
import java.awt.event.ActionEvent;
import labdao.controlador;
import javax.swing.*;
import labdao.DAO.vendedorDAO;
import labdao.DAO.ventaDAO;
import labdao.controladoreporte;
public class Reporte extends JFrame{

    private JButton cerrarButton;
    private JButton imprimirButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel mayorVentaLabel;
    private JLabel mejorVendedorLabel;
    private JComboBox<String> mesesCb;
    private JButton obtenerButton;
    private JLabel promVentasLabel;
    private JLabel totalVentasLabel;
    private JLabel vendedorLabel;
    private ventaDAO ventas;
    private vendedorDAO vendedor;
    
    public Reporte( ventaDAO ventas, vendedorDAO vendedor) {
        super("Reportes");
        this.ventas =ventas;
        this.vendedor=  vendedor;
        initComponents();
      
        //Codigo aquí
    }

    
    private void initComponents() {

        mesesCb = new javax.swing.JComboBox<>();
        obtenerButton = new javax.swing.JButton();
        obtenerButton.setActionCommand("reportes");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JButton();
        cerrarButton.addActionListener((e) ->{ accionboton2(e); });
        imprimirButton = new javax.swing.JButton();
        imprimirButton.addActionListener((e) ->{ accionboton1(e); });
        mejorVendedorLabel = new javax.swing.JLabel();
        totalVentasLabel = new javax.swing.JLabel();
        mayorVentaLabel = new javax.swing.JLabel();
        vendedorLabel = new javax.swing.JLabel();
        promVentasLabel = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mesesCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        obtenerButton.addActionListener(new controladoreporte(this));
        obtenerButton.setText("Obtener");

        jLabel1.setText("Mejor Vendedor:");

        jLabel2.setText("Total Ventas:");

        jLabel3.setText("Mayor Venta:");

        jLabel4.setText("Vendedor: ");

        jLabel5.setText("Promedio Ventas:");

        cerrarButton.setText("Cerrar");

        imprimirButton.setText("Imprimir");

        mejorVendedorLabel.setText("-");

        totalVentasLabel.setText("-");

        mayorVentaLabel.setText("-");

        vendedorLabel.setText("-");

        promVentasLabel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(mesesCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(obtenerButton)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imprimirButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cerrarButton)
                    .addComponent(mejorVendedorLabel)
                    .addComponent(totalVentasLabel)
                    .addComponent(vendedorLabel)
                    .addComponent(promVentasLabel)
                    .addComponent(mayorVentaLabel))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesesCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obtenerButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mejorVendedorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalVentasLabel)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mayorVentaLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vendedorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(promVentasLabel))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimirButton)
                    .addComponent(cerrarButton))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }

    public JLabel getMayorVentaLabel() {
        return mayorVentaLabel;
    }

    public void setMayorVentaLabel(String mayorVentaLabel) {
        this.mayorVentaLabel.setText(mayorVentaLabel);
    }

    public JLabel getMejorVendedorLabel() {
        return mejorVendedorLabel;
    }

    public void setMejorVendedorLabel(JLabel mejorVendedorLabel) {
        this.mejorVendedorLabel = mejorVendedorLabel;
    }

    public JLabel getPromVentasLabel() {
        return promVentasLabel;
    }

    public void setPromVentasLabel(String promVentasLabel) {
        this.promVentasLabel.setText(promVentasLabel);
    }

    public JLabel getTotalVentasLabel() {
        return totalVentasLabel;
    }

    public void setTotalVentasLabel(String totalVentasLabel) {
        this.totalVentasLabel.setText(totalVentasLabel);
    }

    public JLabel getVendedorLabel() {
        return vendedorLabel;
    }

    public void setVendedorLabel(JLabel vendedorLabel) {
        this.vendedorLabel = vendedorLabel;
    }

    public ventaDAO getVentas() {
        return ventas;
    }

    public void setVentas(ventaDAO ventas) {
        this.ventas = ventas;
    }

    public JComboBox<String> getMesesCb() {
        return mesesCb;
    }

    public void setMesesCb(JComboBox<String> mesesCb) {
        this.mesesCb = mesesCb;
    }
        private void accionboton2(ActionEvent e){
            this.dispose();
    }
        private void accionboton1(ActionEvent e){
            JOptionPane.showMessageDialog(null,"IMPRIMIENDO PLANILLA");
    }
        private void cambiartotalventas(int nro){
            totalVentasLabel.setText(""+nro);
        }
}
