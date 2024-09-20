package paqueteinicial;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaInicial extends javax.swing.JFrame 
{
    private Registro registro;
    private ExecutorService ejecutorDeServicio = Executors.newFixedThreadPool(5);
    private String resultadoAltaMensaje;
    private String resultadoBajaMensaje;
    private String resultadoModificacionMensaje;
    private DefaultComboBoxModel<String> comboBoxModel;

    public VentanaInicial() 
    {
        initComponents();
        setIconImage(getIcono());
        setResizable(false);
        setLocationRelativeTo(null);
        
        
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        FlatLightLaf.setup();

        datoEliminar.setModel(new DefaultComboBoxModel<>());
        this.registro = new Registro(datoEliminar);
        this.comboBoxModel = registro.getComboBoxModel();
        
        try 
        {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } 
        catch (UnsupportedLookAndFeelException e) 
        {
            e.printStackTrace();
        }

        menuAltas.setVisible(false);
        menuBajas.setVisible(false);
        menuModificar.setVisible(false);
        menuConsultar.setVisible(false);
        valoresEncontrados.setEditable(false);
        valoresEncontrados.setFocusable(false);

        iconoAltas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etiAltas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoBajas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etiBajas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etiModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etiConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoVolverAltas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoDarAlta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoVolverBajas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoDarBaja.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoVolverModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoModificarDato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoVolverConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoConsultarDatos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    public static Image getIcono()
    {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/logo.png"));
    }
    
    Timer timerAlta = new Timer(2000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            resultadoAltaMensaje = "";
            resultadoAlta.setText("");
            nuevoDato.setText("");
            nuevoDato.setEditable(true);
            nuevoDato.setFocusable(true);
            mensajeEspera.setText("");
            timerAlta.stop();
        }
    });
    
    Timer timerBaja = new Timer(2000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            resultadoBajaMensaje = "";
            resultadoBaja.setText("");
            nuevoDato.setText("");
            nuevoDato.setEditable(true);
            nuevoDato.setFocusable(true);
            mensajeEspera.setText("");
            timerBaja.stop();
        }
    });
    
    Timer timerModificacion = new Timer(2000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            resultadoModificacionMensaje = "";
            resultadoModificacion.setText("");
            nuevoValor.setText("");
            datoModificar.setText("");
            datoModificar.setEditable(true);
            datoModificar.setFocusable(true);
            nuevoValor.setEditable(true);
            nuevoValor.setFocusable(true);
            mensajeEspera.setText("");
            timerModificacion.stop();
        }
    });
    
    Timer timerConsulta = new Timer(5000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            valoresEncontrados.setText("");
            timerModificacion.stop();
        }
    });

    Timer timerMensajeEspera = new Timer(1000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            mensajeEspera.setText("");
            mensajeEsperaBaja.setText("");
            mensajeEsperaModificacion.setText("");
            mensajeEsperaConsulta.setText("");
            timerMensajeEspera.stop();
        }
    });

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        parteUnoTitulo = new javax.swing.JLabel();
        parteDosTitulo = new javax.swing.JLabel();
        base = new javax.swing.JPanel();
        menuOpciones = new javax.swing.JPanel();
        iconoAltas = new javax.swing.JLabel();
        etiAltas = new javax.swing.JLabel();
        etiBajas = new javax.swing.JLabel();
        iconoBajas = new javax.swing.JLabel();
        iconoModificar = new javax.swing.JLabel();
        etiModificar = new javax.swing.JLabel();
        iconoConsultar = new javax.swing.JLabel();
        etiConsultar = new javax.swing.JLabel();
        iconoSalir = new javax.swing.JLabel();
        etiSalir = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        menuAltas = new javax.swing.JPanel();
        iconoDarAlta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nuevoDato = new javax.swing.JTextField();
        iconoVolverAltas = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        resultadoAlta = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mensajeEspera = new javax.swing.JLabel();
        menuBajas = new javax.swing.JPanel();
        iconoDarBaja = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iconoVolverBajas = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        resultadoBaja = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        mensajeEsperaBaja = new javax.swing.JLabel();
        datoEliminar = new javax.swing.JComboBox<>();
        menuModificar = new javax.swing.JPanel();
        iconoModificarDato = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        iconoVolverModificar = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        resultadoModificacion = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        mensajeEsperaModificacion = new javax.swing.JLabel();
        nuevoValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        datoModificar = new javax.swing.JTextField();
        menuConsultar = new javax.swing.JPanel();
        iconoConsultarDatos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        iconoVolverConsultar = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        valoresEncontrados = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        mensajeEsperaConsulta = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 238, 234));

        parteUnoTitulo.setBackground(new java.awt.Color(244, 107, 82));
        parteUnoTitulo.setFont(new java.awt.Font("DM Serif Display", 0, 48)); // NOI18N
        parteUnoTitulo.setForeground(new java.awt.Color(244, 107, 82));
        parteUnoTitulo.setText("Gestor de ");

        parteDosTitulo.setBackground(new java.awt.Color(244, 107, 82));
        parteDosTitulo.setFont(new java.awt.Font("DM Serif Display", 2, 48)); // NOI18N
        parteDosTitulo.setForeground(new java.awt.Color(244, 107, 82));
        parteDosTitulo.setText("Empleados");

        base.setBackground(new java.awt.Color(204, 51, 255));
        base.setLayout(new java.awt.CardLayout());

        menuOpciones.setBackground(new java.awt.Color(240, 238, 234));

        iconoAltas.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/alta.png"))); // NOI18N
        iconoAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoAltasMouseClicked(evt);
            }
        });

        etiAltas.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        etiAltas.setText("Altas");
        etiAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiAltasMouseClicked(evt);
            }
        });

        etiBajas.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        etiBajas.setText("Bajas");
        etiBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiBajasMouseClicked(evt);
            }
        });

        iconoBajas.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/baja.png"))); // NOI18N
        iconoBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoBajasMouseClicked(evt);
            }
        });

        iconoModificar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/modificar.png"))); // NOI18N
        iconoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoModificarMouseClicked(evt);
            }
        });

        etiModificar.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        etiModificar.setText("Modificar");
        etiModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiModificarMouseClicked(evt);
            }
        });

        iconoConsultar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/consultar.png"))); // NOI18N
        iconoConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoConsultarMouseClicked(evt);
            }
        });

        etiConsultar.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        etiConsultar.setText("Consultar");
        etiConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiConsultarMouseClicked(evt);
            }
        });

        iconoSalir.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/salir.png"))); // NOI18N
        iconoSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoSalirMouseClicked(evt);
            }
        });

        etiSalir.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        etiSalir.setText("Salir");
        etiSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiSalirMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(82, 81, 81));
        jSeparator2.setForeground(new java.awt.Color(82, 81, 81));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout menuOpcionesLayout = new javax.swing.GroupLayout(menuOpciones);
        menuOpciones.setLayout(menuOpcionesLayout);
        menuOpcionesLayout.setHorizontalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOpcionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoAltas)
                    .addGroup(menuOpcionesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(etiAltas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuOpcionesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(etiBajas))
                    .addComponent(iconoBajas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiModificar)
                    .addComponent(iconoModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiConsultar)
                    .addComponent(iconoConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoSalir)
                    .addGroup(menuOpcionesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(etiSalir)))
                .addGap(34, 34, 34))
        );
        menuOpcionesLayout.setVerticalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOpcionesLayout.createSequentialGroup()
                        .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOpcionesLayout.createSequentialGroup()
                                .addComponent(iconoSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOpcionesLayout.createSequentialGroup()
                                .addComponent(iconoBajas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiBajas))
                            .addGroup(menuOpcionesLayout.createSequentialGroup()
                                .addComponent(iconoModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiModificar))
                            .addGroup(menuOpcionesLayout.createSequentialGroup()
                                .addComponent(iconoAltas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiAltas))
                            .addGroup(menuOpcionesLayout.createSequentialGroup()
                                .addComponent(iconoConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiConsultar)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOpcionesLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );

        menuAltas.setBackground(new java.awt.Color(240, 238, 234));

        iconoDarAlta.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoDarAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/alta.png"))); // NOI18N
        iconoDarAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoDarAltaMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el nombre del nuevo empleado");

        nuevoDato.setBackground(new java.awt.Color(240, 238, 234));
        nuevoDato.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        nuevoDato.setForeground(new java.awt.Color(0, 0, 0));
        nuevoDato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        iconoVolverAltas.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoVolverAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoVolverAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoVolverAltasMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(240, 238, 234));

        resultadoAlta.setBackground(new java.awt.Color(244, 107, 82));
        resultadoAlta.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        resultadoAlta.setForeground(new java.awt.Color(244, 107, 82));

        jPanel6.setBackground(new java.awt.Color(240, 238, 234));

        mensajeEspera.setBackground(new java.awt.Color(236, 0, 0));
        mensajeEspera.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeEspera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensajeEspera, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadoAlta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(resultadoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuAltasLayout = new javax.swing.GroupLayout(menuAltas);
        menuAltas.setLayout(menuAltasLayout);
        menuAltasLayout.setHorizontalGroup(
            menuAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAltasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menuAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevoDato)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(menuAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoDarAlta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconoVolverAltas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        menuAltasLayout.setVerticalGroup(
            menuAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAltasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAltasLayout.createSequentialGroup()
                        .addComponent(iconoVolverAltas)
                        .addGap(18, 18, 18)
                        .addComponent(iconoDarAlta))
                    .addGroup(menuAltasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(nuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        menuBajas.setBackground(new java.awt.Color(240, 238, 234));

        iconoDarBaja.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoDarBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/baja.png"))); // NOI18N
        iconoDarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoDarBajaMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel5.setText("Seleccion al empleado a eliminar");

        iconoVolverBajas.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoVolverBajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoVolverBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoVolverBajasMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(240, 238, 234));

        resultadoBaja.setBackground(new java.awt.Color(244, 107, 82));
        resultadoBaja.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        resultadoBaja.setForeground(new java.awt.Color(244, 107, 82));

        jPanel8.setBackground(new java.awt.Color(240, 238, 234));

        mensajeEsperaBaja.setBackground(new java.awt.Color(236, 0, 0));
        mensajeEsperaBaja.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeEsperaBaja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensajeEsperaBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadoBaja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(resultadoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        datoEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un empleado" }));

        javax.swing.GroupLayout menuBajasLayout = new javax.swing.GroupLayout(menuBajas);
        menuBajas.setLayout(menuBajasLayout);
        menuBajasLayout.setHorizontalGroup(
            menuBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBajasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menuBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(datoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(menuBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoDarBaja, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconoVolverBajas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        menuBajasLayout.setVerticalGroup(
            menuBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBajasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuBajasLayout.createSequentialGroup()
                        .addComponent(iconoVolverBajas)
                        .addGap(18, 18, 18)
                        .addComponent(iconoDarBaja))
                    .addGroup(menuBajasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        menuModificar.setBackground(new java.awt.Color(240, 238, 234));

        iconoModificarDato.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoModificarDato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/modificar.png"))); // NOI18N
        iconoModificarDato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoModificarDatoMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel6.setText("Nombre del Empleado");

        iconoVolverModificar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoVolverModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoVolverModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoVolverModificarMouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(240, 238, 234));

        resultadoModificacion.setBackground(new java.awt.Color(244, 107, 82));
        resultadoModificacion.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        resultadoModificacion.setForeground(new java.awt.Color(244, 107, 82));

        jPanel10.setBackground(new java.awt.Color(240, 238, 234));

        mensajeEsperaModificacion.setBackground(new java.awt.Color(236, 0, 0));
        mensajeEsperaModificacion.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeEsperaModificacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensajeEsperaModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadoModificacion)
                .addContainerGap(138, Short.MAX_VALUE))
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(resultadoModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Actualizado");

        javax.swing.GroupLayout menuModificarLayout = new javax.swing.GroupLayout(menuModificar);
        menuModificar.setLayout(menuModificarLayout);
        menuModificarLayout.setHorizontalGroup(
            menuModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuModificarLayout.createSequentialGroup()
                .addGroup(menuModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuModificarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(menuModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(menuModificarLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel1)))
                            .addComponent(nuevoValor, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(datoModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(menuModificarLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(menuModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoModificarDato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconoVolverModificar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        menuModificarLayout.setVerticalGroup(
            menuModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuModificarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuModificarLayout.createSequentialGroup()
                        .addComponent(iconoVolverModificar)
                        .addGap(18, 18, 18)
                        .addComponent(iconoModificarDato))
                    .addGroup(menuModificarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        menuConsultar.setBackground(new java.awt.Color(240, 238, 234));

        iconoConsultarDatos.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoConsultarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/consultar.png"))); // NOI18N
        iconoConsultarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoConsultarDatosMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese un parametro e.g. her, Om, H.");

        iconoVolverConsultar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        iconoVolverConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoVolverConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoVolverConsultarMouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(240, 238, 234));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        valoresEncontrados.setColumns(20);
        valoresEncontrados.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        valoresEncontrados.setRows(5);
        jScrollPane1.setViewportView(valoresEncontrados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(240, 238, 234));

        mensajeEsperaConsulta.setBackground(new java.awt.Color(236, 0, 0));
        mensajeEsperaConsulta.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeEsperaConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensajeEsperaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuConsultarLayout = new javax.swing.GroupLayout(menuConsultar);
        menuConsultar.setLayout(menuConsultarLayout);
        menuConsultarLayout.setHorizontalGroup(
            menuConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuConsultarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(menuConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoConsultarDatos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconoVolverConsultar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        menuConsultarLayout.setVerticalGroup(
            menuConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuConsultarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuConsultarLayout.createSequentialGroup()
                        .addComponent(iconoVolverConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(iconoConsultarDatos))
                    .addGroup(menuConsultarLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(menuConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        copyright.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        copyright.setText("© 2023 Omar, LLC");

        separador.setBackground(new java.awt.Color(82, 81, 81));
        separador.setForeground(new java.awt.Color(82, 81, 81));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(copyright)
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(parteUnoTitulo)
                        .addGap(0, 0, 0)
                        .addComponent(parteDosTitulo)
                        .addGap(172, 172, 172))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(menuBajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(menuModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(menuConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parteDosTitulo)
                    .addComponent(parteUnoTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(copyright)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(menuBajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(menuModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(menuConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconoAltasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoAltasMouseClicked
        mostrarAlta();
    }//GEN-LAST:event_iconoAltasMouseClicked

    private void etiAltasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiAltasMouseClicked
        mostrarAlta();
    }//GEN-LAST:event_etiAltasMouseClicked

    private void etiBajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiBajasMouseClicked
        mostrarBajas();
    }//GEN-LAST:event_etiBajasMouseClicked

    private void iconoBajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBajasMouseClicked
        mostrarBajas();
    }//GEN-LAST:event_iconoBajasMouseClicked

    private void iconoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoModificarMouseClicked
        mostrarModificar();
    }//GEN-LAST:event_iconoModificarMouseClicked

    private void etiModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiModificarMouseClicked
        mostrarModificar();
    }//GEN-LAST:event_etiModificarMouseClicked

    private void iconoConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoConsultarMouseClicked
        mostrarConsultar();
    }//GEN-LAST:event_iconoConsultarMouseClicked

    private void etiConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiConsultarMouseClicked
        mostrarConsultar();
    }//GEN-LAST:event_etiConsultarMouseClicked

    private void iconoSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoSalirMouseClicked
        ejecutarSalir();
    }//GEN-LAST:event_iconoSalirMouseClicked

    private void etiSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiSalirMouseClicked
        ejecutarSalir();
    }//GEN-LAST:event_etiSalirMouseClicked

    private void iconoDarAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoDarAltaMouseClicked
        darAltaEmpleado();
    }//GEN-LAST:event_iconoDarAltaMouseClicked

    private void iconoVolverAltasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoVolverAltasMouseClicked
        volverMenu(menuAltas);
    }//GEN-LAST:event_iconoVolverAltasMouseClicked

    private void iconoDarBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoDarBajaMouseClicked
        darBajaEmpleado();
    }//GEN-LAST:event_iconoDarBajaMouseClicked

    private void iconoVolverBajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoVolverBajasMouseClicked
        volverMenu(menuBajas);
    }//GEN-LAST:event_iconoVolverBajasMouseClicked

    private void iconoModificarDatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoModificarDatoMouseClicked
        modificarDatoSeleccionado();
    }//GEN-LAST:event_iconoModificarDatoMouseClicked

    private void iconoVolverModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoVolverModificarMouseClicked
        volverMenu(menuModificar);
    }//GEN-LAST:event_iconoVolverModificarMouseClicked

    private void iconoConsultarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoConsultarDatosMouseClicked
        consultarDatos();
    }//GEN-LAST:event_iconoConsultarDatosMouseClicked

    private void iconoVolverConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoVolverConsultarMouseClicked
        volverMenu(menuConsultar);
    }//GEN-LAST:event_iconoVolverConsultarMouseClicked

    private void darAltaEmpleado() 
    {
        if (!timerAlta.isRunning()) 
        {
            if (!nuevoDato.getText().equals("")) 
            {
                resultadoAltaMensaje = registro.agregarDato(nuevoDato.getText());
                resultadoAlta.setText(resultadoAltaMensaje);
                nuevoDato.setEditable(false);
                nuevoDato.setFocusable(false);
                registro.actualizarModeloComboBox();
                timerAlta.start();
            }
            else
            {
                if (!timerMensajeEspera.isRunning()) 
                {
                    mensajeEspera.setText("Dato Invalido.");
                    timerMensajeEspera.start();
                }
            }
        }
        else 
        {
            if (!timerMensajeEspera.isRunning()) 
            {
                mensajeEspera.setText("Por favor, espere.");
                timerMensajeEspera.start();
            }
        }
    }

    private String obtenerDatoSeleccionado(DefaultComboBoxModel<String> cBM)
    {
        return (String) cBM.getSelectedItem();
    }
    
    private void darBajaEmpleado() 
    {
        String seleccionado = "";
        seleccionado = obtenerDatoSeleccionado(comboBoxModel);
        
        if (!timerBaja.isRunning()) 
        {
            if (seleccionado == null) 
            {
                if (!timerMensajeEspera.isRunning())
                {
                    mensajeEsperaBaja.setText("Ningún dato seleccionado.");
                }
            }
            
            if (seleccionado != null && !seleccionado.equals("")) 
            {
                resultadoBajaMensaje = registro.eliminarDato(seleccionado);
                resultadoBaja.setText(resultadoBajaMensaje);
                registro.actualizarModeloComboBox();
                timerBaja.start();
            } 
            else 
            {
                if (!timerMensajeEspera.isRunning()) {
                    mensajeEsperaBaja.setText("Dato Invalido o nulo.");
                    timerMensajeEspera.start();
                }
            }
        } 
        else
        {
            if (!timerMensajeEspera.isRunning())
            {
                mensajeEsperaBaja.setText("Por favor, espere.");
                timerMensajeEspera.start();
            }
        }
    }
    
    private void modificarDatoSeleccionado()
    {
        String valorActual = datoModificar.getText();
        String valorActualizado = nuevoValor.getText();
        
        if (!timerBaja.isRunning()) 
        {
            if (!valorActual.equals("") || !valorActualizado.equals("")) 
            {
                resultadoModificacionMensaje = registro.modificarDato(valorActual, valorActualizado);
                resultadoModificacion.setText(resultadoModificacionMensaje);
                datoModificar.setEditable(false);
                datoModificar.setFocusable(false);
                nuevoValor.setEditable(false);
                nuevoValor.setFocusable(false);
                registro.actualizarModeloComboBox();
                timerModificacion.start();
            }
            else 
            {
                if (!timerMensajeEspera.isRunning()) {
                    mensajeEsperaModificacion.setText("Dato Invalido o nulo.");
                    timerMensajeEspera.start();
                }
            }
        }
        else
        {
            if (!timerMensajeEspera.isRunning())
            {
                mensajeEsperaBaja.setText("Por favor, espere.");
                timerMensajeEspera.start();
            }
        }
    }
    
    private void consultarDatos()
    {        
        if (!timerConsulta.isRunning()) 
        {
            String listaCompleta;
            
            listaCompleta = registro.consultarDatos();
            valoresEncontrados.setText(listaCompleta);
            datoModificar.setEditable(false);
            datoModificar.setFocusable(false);
            nuevoValor.setEditable(false);
            nuevoValor.setFocusable(false);
            registro.actualizarModeloComboBox();
            timerConsulta.start();
        }
        else
        {
            if (!timerMensajeEspera.isRunning())
            {
                mensajeEsperaBaja.setText("Por favor, espere.");
                timerMensajeEspera.start();
            }
        }
    }

    private void volverMenu(JPanel origen) 
    {
        origen.setVisible(!origen.isVisible());
        menuOpciones.setVisible(true);
    }

    private void mostrarAlta() 
    {
        menuOpciones.setVisible(false);
        menuAltas.setVisible(true);
    }

    private void mostrarBajas() 
    {
        menuOpciones.setVisible(false);
        menuBajas.setVisible(true);
    }

    private void mostrarModificar()
    {
        menuOpciones.setVisible(false);
        menuModificar.setVisible(true);
    }
    
    private void mostrarConsultar()
    {
        menuOpciones.setVisible(false);
        menuConsultar.setVisible(true);
    }
    
    private void ejecutarSalir() 
    {
        ejecutorDeServicio.shutdown();
        System.exit(0);
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JLabel copyright;
    private javax.swing.JComboBox<String> datoEliminar;
    private javax.swing.JTextField datoModificar;
    private javax.swing.JLabel etiAltas;
    private javax.swing.JLabel etiBajas;
    private javax.swing.JLabel etiConsultar;
    private javax.swing.JLabel etiModificar;
    private javax.swing.JLabel etiSalir;
    private javax.swing.JLabel iconoAltas;
    private javax.swing.JLabel iconoBajas;
    private javax.swing.JLabel iconoConsultar;
    private javax.swing.JLabel iconoConsultarDatos;
    private javax.swing.JLabel iconoDarAlta;
    private javax.swing.JLabel iconoDarBaja;
    private javax.swing.JLabel iconoModificar;
    private javax.swing.JLabel iconoModificarDato;
    private javax.swing.JLabel iconoSalir;
    private javax.swing.JLabel iconoVolverAltas;
    private javax.swing.JLabel iconoVolverBajas;
    private javax.swing.JLabel iconoVolverConsultar;
    private javax.swing.JLabel iconoVolverModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mensajeEspera;
    private javax.swing.JLabel mensajeEsperaBaja;
    private javax.swing.JLabel mensajeEsperaConsulta;
    private javax.swing.JLabel mensajeEsperaModificacion;
    private javax.swing.JPanel menuAltas;
    private javax.swing.JPanel menuBajas;
    private javax.swing.JPanel menuConsultar;
    private javax.swing.JPanel menuModificar;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JTextField nuevoDato;
    private javax.swing.JTextField nuevoValor;
    private javax.swing.JLabel parteDosTitulo;
    private javax.swing.JLabel parteUnoTitulo;
    private javax.swing.JLabel resultadoAlta;
    private javax.swing.JLabel resultadoBaja;
    private javax.swing.JLabel resultadoModificacion;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextArea valoresEncontrados;
    // End of variables declaration//GEN-END:variables
}
