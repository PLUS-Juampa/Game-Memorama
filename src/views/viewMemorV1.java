package views;  // Paquete donde está guardada la clase del programa

// Importsa necesarios para el desarrollo del porgrama
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PLUS-Juampa (Juan Paulino Cruz Mejía - 02/jul/2017)
 */
// Clase principal donde contiene todos los componentes del programa
public class viewMemorV1 extends javax.swing.JFrame {

    int auxiliar = 0;   // Variable auxiliar para poder cambiar el estilo de las imágenes

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    JButton arryBotones[] = new JButton[20];    // Arreglo que almacenará los botones del juego
    int images1[] = new int[20]; //Arreglo para almacenar las imágenes que irán dentro de cada botón
    int repets[] = new int[10]; // Arreglo de repeticiones 
    int par_s[] = new int[20]; //Arreglo para almacenar las parejas 
    int caNotClick[] = new int[20]; //arreglo de clics usado para mostrar y boltear imágenes

    int turno = 1;
    // Varriables usadas para usarse en el juego
    int par1 = 0;
    int par2 = 0;
    int vist1 = 0;
    int vist2 = 0;
    int clic = 0;

    int aumento = 0;
    int ch1 = 0;
    int ch2 = 0;

    ////////////////////
    JButton FN_arryBotones[] = new JButton[20]; // Arreglo que almacenará los botones del juego en caso de seleccionar otra categoría
    int FN_images1[] = new int[20];
    int FN_repets[] = new int[10];
    int FN_par_s[] = new int[20];
    int FN_caNotClick[] = new int[20];

    int FN_turno = 1;

    int FN_par1 = 0;
    int FN_par2 = 0;
    int FN_vist1 = 0; //vista1
    int FN_vist2 = 0; //vista2
    int FN_clic = 0;

    int FN_aumento = 0;
    int FN_ch1 = 0;
    int FN_ch2 = 0;
    ///////////////////

    private void iniciarImagenes() {    // Métodoo para almacenar e igualar los botones con el arreglo que se ejecutó al inicio
        arryBotones[0] = btn_1;
        arryBotones[1] = btn_2;
        arryBotones[2] = btn_3;
        arryBotones[3] = btn_4;
        arryBotones[4] = btn_5;
        arryBotones[5] = btn_6;
        arryBotones[6] = btn_7;
        arryBotones[7] = btn_8;
        arryBotones[8] = btn_9;
        arryBotones[9] = btn_10;
        arryBotones[10] = btn_11;
        arryBotones[11] = btn_12;
        arryBotones[12] = btn_13;
        arryBotones[13] = btn_14;
        arryBotones[14] = btn_15;
        arryBotones[15] = btn_16;
        arryBotones[16] = btn_17;
        arryBotones[17] = btn_18;
        arryBotones[18] = btn_19;
        arryBotones[19] = btn_20;
        // For para llenar cada uno de los botones con la imágen que tendrá como cara principal antes de hacerle clic
        for (int i = 0; i < arryBotones.length; i++) {
            arryBotones[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg")));
        }

    }

    private void FN_iniciarImagenes() {  // Métodoo para almacenar e igualar los botones con el arreglo que se ejecutó al inicio, en caso de ser la sefunda categoría
        FN_arryBotones[0] = btn_1;
        FN_arryBotones[1] = btn_2;
        FN_arryBotones[2] = btn_3;
        FN_arryBotones[3] = btn_4;
        FN_arryBotones[4] = btn_5;
        FN_arryBotones[5] = btn_6;
        FN_arryBotones[6] = btn_7;
        FN_arryBotones[7] = btn_8;
        FN_arryBotones[8] = btn_9;
        FN_arryBotones[9] = btn_10;
        FN_arryBotones[10] = btn_11;
        FN_arryBotones[11] = btn_12;
        FN_arryBotones[12] = btn_13;
        FN_arryBotones[13] = btn_14;
        FN_arryBotones[14] = btn_15;
        FN_arryBotones[15] = btn_16;
        FN_arryBotones[16] = btn_17;
        FN_arryBotones[17] = btn_18;
        FN_arryBotones[18] = btn_19;
        FN_arryBotones[19] = btn_20;
        // For para llenar cada uno de los botones con la imágen que tendrá como cara principal antes de hacerle clic, para la segunda categoría
        for (int i = 0; i < FN_arryBotones.length; i++) {
            FN_arryBotones[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_2.jpg")));
        }

    }

    private void iniciarArreglo() { // Método para poder iniciar el areglo para poder mandar las imágenes a los botones de manera aleatoria
        iniciarImagenes();

        iniciarCero(images1);
        iniciarCero(repets);
        iniciarCero(par_s);
        iniciarCero(caNotClick);

        int posicionIma;
        Random Random = new Random();

        for (int i = 0; i < images1.length; i++) {
            posicionIma = Random.nextInt(10);

            if (repets[posicionIma] < 2) {
                images1[i] = posicionIma + 1;
                repets[posicionIma]++;
            } else {
                i--;
            }
        }
    }

    private void FN_iniciarArreglo() {  // Método para poder iniciar el areglo para poder mandar las imágenes a los botones de manera aleatoria, en caso de elegir la segunda categoría
        FN_iniciarImagenes();

        FN_iniciarCero(FN_images1);
        FN_iniciarCero(FN_repets);
        FN_iniciarCero(FN_par_s);
        FN_iniciarCero(FN_caNotClick);

        int posicionIma;
        Random Random = new Random();

        for (int i = 0; i < FN_images1.length; i++) {
            posicionIma = Random.nextInt(10);

            if (FN_repets[posicionIma] < 2) {
                FN_images1[i] = posicionIma + 1;
                FN_repets[posicionIma]++;
            } else {
                i--;
            }
        }
    }

    private void iniciarCero(int[] arreglo) {   // Método para iniciar en los botones con el índice cero
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
    }

    private void FN_iniciarCero(int[] FN_arreglo) { // Método para iniciar en los botones con el índice cero, en caso de ser la segunda categoría
        for (int i = 0; i < FN_arreglo.length; i++) {
            FN_arreglo[i] = 0;
        }
    }

    private void parejas(int vis1, int vis2) {  // Método para hacer la comparación de las impagenes volteadas, en caso de ser iguales quedarán estáticas
        if (images1[vis1] == images1[vis2]) {

            if (!(turno == 1)) {
                ch1++;
                par1++; // Variable para contar los pares acertados por cada usuario
                lblPares_J1.setText(par1 + "");
                aumento++;

                checaGanador(); // Manda a llamar al arreglo para verificar que al final del juego exista un ganador

            }
            if (turno == 1) {
                ch2++;
                par2++; // Variable para contar los pares acertados por cada usuario
                lblPares_J2.setText(par2 + "");
                aumento++;

                checaGanador(); // Manda a llamar al arreglo para verificar que al final del juego exista un ganador

            }

            par_s[vis1] = 1;
            par_s[vis2] = 1;

        } else {    // En caso de no ser acertada la pareja de imágenes, se regresará al estado normal de la imagen con la cara posterior
            arryBotones[vis1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg")));
            arryBotones[vis2].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg")));
            caNotClick[vis1] = 0;
            caNotClick[vis2] = 0;
            if (turno == 1) {
                lblJugador1.setBackground(Color.BLUE);
                lblJugador2.setBackground(Color.GRAY);
                turno = 0;
            } else {
                lblJugador2.setBackground(Color.RED);
                lblJugador1.setBackground(Color.GRAY);
                turno = 1;
            }
        }
    }

    private void FN_parejas(int FN_vis1, int FN_vis2) { // Mismo método para hacer la comparación de las parejas, en caso de que se elija la segunda categoría
        if (FN_images1[FN_vis1] == FN_images1[FN_vis2]) {

            if (!(FN_turno == 1)) {
                FN_ch1++;
                FN_par1++;
                lblPares_J1.setText(FN_par1 + "");
                FN_aumento++;

                FN_checaGanador();

            }
            if (FN_turno == 1) {
                FN_ch2++;
                FN_par2++;
                lblPares_J2.setText(FN_par2 + "");
                FN_aumento++;

                FN_checaGanador();

            }

            FN_par_s[FN_vis1] = 1;
            FN_par_s[FN_vis2] = 1;

        } else {
            FN_arryBotones[FN_vis1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_2.jpg")));
            FN_arryBotones[FN_vis2].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_2.jpg")));
            FN_caNotClick[FN_vis1] = 0;
            FN_caNotClick[FN_vis2] = 0;
            if (FN_turno == 1) {
                lblJugador1.setBackground(Color.BLUE);
                lblJugador2.setBackground(Color.GRAY);
                FN_turno = 0;
            } else {
                lblJugador2.setBackground(Color.RED);
                lblJugador1.setBackground(Color.GRAY);
                FN_turno = 1;
            }
        }
    }

    public void checaGanador() {    // Método para revisar si existe un ganador al término del juego

        if (aumento == 10) {
            if (ch1 == ch2) {
                MenuEmp();
            }
            if (ch1 > ch2) {
                MenuJ1();
            }
            if (ch2 > ch1) {
                MenuJ2();
            }

        }
    }

    public void FN_checaGanador() { // Método para revisar si existe un ganador al término del juego, en caso de elegir la segunda categoría

        if (FN_aumento == 10) {
            if (FN_ch1 == FN_ch2) {
                FN_MenuEmp();
            }
            if (FN_ch1 > FN_ch2) {
                FN_MenuJ1();
            }
            if (FN_ch2 > FN_ch1) {
                FN_MenuJ2();
            }

        }
    }

    private void accion3(java.awt.event.ActionEvent evt) {  // Método para mostrar las imágenes cada vez que se de un clic en un botón
        for (int i = 0; i < arryBotones.length; i++) {
            if (evt.getSource() == arryBotones[i] && parejasEncontradas(i)) {
                caNotClick[i]++;
                if (caNotClick[i] < 2) {
                    clic++;
                    arryBotones[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesAve/ave_" + images1[i] + ".jpg")));
                    if (clic == 1) {
                        vist1 = i;
                    } else {
                        vist2 = i;
                    }
                }

            }

        }
    }

    private void FN_accion3(java.awt.event.ActionEvent evt) {   // Método para mostrar las imágenes cada vez que se de un clic en un botón, en caso de elegir la segunda categoría
        for (int i = 0; i < FN_arryBotones.length; i++) {
            if (evt.getSource() == FN_arryBotones[i] && parejasEncontradas(i)) {
                FN_caNotClick[i]++;
                if (FN_caNotClick[i] < 2) {
                    FN_clic++;
                    FN_arryBotones[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesDbz/db_" + FN_images1[i] + ".jpg")));
                    if (FN_clic == 1) {
                        FN_vist1 = i;
                    } else {
                        FN_vist2 = i;
                    }
                }

            }

        }
    }

    private void accion4(java.awt.event.MouseEvent evt) {   //Método para poder regresar las imágenes a las caras posteriores
        for (int i = 0; i < arryBotones.length; i++) {
            if (evt.getSource() == arryBotones[i]) {
                if (clic >= 2) {
                    parejas(vist1, vist2);
                    clic = 0;
                }

            }

        }

    }

    private void FN_accion4(java.awt.event.MouseEvent evt) {    //Método para poder regresar las imágenes a las caras posteriores, en caso de ser la segunda categoría
        for (int i = 0; i < FN_arryBotones.length; i++) {
            if (evt.getSource() == FN_arryBotones[i]) {
                if (FN_clic >= 2) {
                    FN_parejas(FN_vist1, FN_vist2);
                    FN_clic = 0;
                }

            }

        }

    }

    private boolean parejasEncontradas(int i) { // Método para cotabilizar las parejas de imágenes que sean encontradas
        if (par_s[i] != 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean FN_parejasEncontradas(int FN_i) {   // Método para cotabilizar las parejas de imágenes que sean encontradas, en caso de elegir la segunda categoría
        if (FN_par_s[FN_i] != 1) {
            return true;
        } else {
            return false;
        }
    }

    private void MenuJ1() {   // Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador1
        Object resp = JOptionPane.showInputDialog(null, "¿QUÉ DESEA HACER?", ""
                + "** Jugador " + txtJugador1.getText() + " ha ganado** ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Reiniciar", "Salir"}, "Seleccione");

        if (resp.equals("Reiniciar")) {   // Terminará e iniciará un juego nuevo
            this.setVisible(false); // Borrará los datos y quitará la ventana del juego
            viewMemorV1.main(null);
        }
        if (resp.equals("Salir")) {
            System.exit(0); // Fin de ejecución del programa
        }
    }

    private void FN_MenuJ1() {   // Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador1, en caso de elegir la segunda categoría
        Object resp = JOptionPane.showInputDialog(null, "¿QUÉ DESEA HACER?", ""
                + "** Jugador " + txtJugador1.getText() + " ha ganado** ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Reiniciar", "Salir"}, "Seleccione");

        if (resp.equals("Reiniciar")) {   // Terminará e iniciará un juego nuevo
            this.setVisible(false); // Borrará los datos y quitará la ventana del juego
            viewMemorV1.main(null);
        }
        if (resp.equals("Salir")) {
            System.exit(0); // Fin de ejecución del programa
        }
    }

    private void MenuJ2() {   /// Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador2
        Object resp = JOptionPane.showInputDialog(null, "¿QUÉ DESEA HACER?", ""
                + "** Jugador " + txtJugador2.getText() + " ha ganado** ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Reiniciar", "Salir"}, "Seleccione");

        if (resp.equals("Reiniciar")) {   // Terminará e iniciará un juego nuevo
            this.setVisible(false); // Borrará los datos y quitará la ventana del juego
            viewMemorV1.main(null);
        }
        if (resp.equals("Salir")) {
            System.exit(0); // Fin de ejecución del programa
        }
    }

    private void FN_MenuJ2() {   // Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador2, en caso de elegir la segunda categoría
        Object resp = JOptionPane.showInputDialog(null, "¿QUÉ DESEA HACER?", ""
                + "** Jugador " + txtJugador2.getText() + " ha ganado** ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Reiniciar", "Salir"}, "Seleccione");

        if (resp.equals("Reiniciar")) {   // Terminará e iniciará un juego nuevo
            this.setVisible(false); // Borrará los datos y quitará la ventana del juego
            viewMemorV1.main(null);
        }
        if (resp.equals("Salir")) {
            System.exit(0); // Fin de ejecución del programa
        }
    }

    private void MenuEmp() {   // Método que contiene el menú de opciones para mostrar cuando se haya empatado al término del juego
        Object resp = JOptionPane.showInputDialog(null, "¿QUÉ DESEA HACER?", "     "
                + "** Hubo un Empate** ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Reiniciar", "Salir"}, "Seleccione");

        if (resp.equals("Reiniciar")) {   // Terminará e iniciará un juego nuevo
            this.setVisible(false); // Borrará los datos y quitará la ventana del juego
            viewMemorV1.main(null);
        }
        if (resp.equals("Salir")) {
            System.exit(0); // Fin de ejecución del programa
        }
    }

    private void FN_MenuEmp() {   // Método que contiene el menú de opciones para mostrar cuando se haya empatado al término del juego
        Object resp = JOptionPane.showInputDialog(null, "¿QUÉ DESEA HACER?", "     "
                + "** Hubo un Empate** ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Reiniciar", "Salir"}, "Seleccione");

        if (resp.equals("Reiniciar")) {   // Terminará e iniciará un juego nuevo
            this.setVisible(false); // Borrará los datos y quitará la ventana del juego
            viewMemorV1.main(null);
        }
        if (resp.equals("Salir")) {
            System.exit(0); // Fin de ejecución del programa
        }
    }

    private void cambioFormato() {   // Método para cambiar el formato de las imágenes
        Object resp = JOptionPane.showInputDialog(null, "¿Desea Cambiarlo?", " "
                + "** Puede modificar formato de imágenes** ", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"SI", "NO", "Salir"}, "Seleccione");

        if (resp.equals("SI")) {   // Terminará e iniciará un juego nuevo
            FN_iniciarArreglo();
            auxiliar = 1;
            btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portrait_2.jpg")));
        }
        if (resp.equals("NO")) {
            iniciarArreglo();
            auxiliar = 0;
        }
        if (resp.equals("Salir")) {
            System.exit(0); // Fin de ejecución del programa
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //---------------------------------------------------------------------------------------------------
    /**
     * Creates new form MemorV1
     */
    // Método para iniciar todos los componentes 
    public viewMemorV1() {
        initComponents();
        centrarForma(); // Llamar a método para poder centrar la interfaz del juego
        bloqBtn();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblJugador1 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        lblJugador2 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        btnLogo = new javax.swing.JButton();
        lblParesJ1 = new javax.swing.JLabel();
        lblParesJ2 = new javax.swing.JLabel();
        lblPares_J1 = new javax.swing.JLabel();
        lblPares_J2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_11 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_14 = new javax.swing.JButton();
        btn_15 = new javax.swing.JButton();
        btn_16 = new javax.swing.JButton();
        btn_17 = new javax.swing.JButton();
        btn_18 = new javax.swing.JButton();
        btn_19 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        lblJugador1.setBackground(new java.awt.Color(150, 150, 150));
        lblJugador1.setFont(new java.awt.Font("Noto Mono", 1, 14)); // NOI18N
        lblJugador1.setForeground(new java.awt.Color(254, 254, 254));
        lblJugador1.setText("Jugador 1:");
        lblJugador1.setOpaque(true);

        txtJugador1.setForeground(new java.awt.Color(0, 32, 255));
        txtJugador1.setToolTipText("");

        lblJugador2.setBackground(new java.awt.Color(150, 150, 150));
        lblJugador2.setFont(new java.awt.Font("Noto Mono", 1, 14)); // NOI18N
        lblJugador2.setForeground(new java.awt.Color(254, 254, 254));
        lblJugador2.setText("Jugador 2:");
        lblJugador2.setOpaque(true);

        txtJugador2.setForeground(new java.awt.Color(255, 0, 6));
        txtJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugador2ActionPerformed(evt);
            }
        });

        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portrait.jpg"))); // NOI18N

        lblParesJ1.setBackground(new java.awt.Color(150, 150, 150));
        lblParesJ1.setFont(new java.awt.Font("Noto Mono", 1, 14)); // NOI18N
        lblParesJ1.setForeground(new java.awt.Color(254, 254, 254));
        lblParesJ1.setText("Pares:");
        lblParesJ1.setOpaque(true);

        lblParesJ2.setBackground(new java.awt.Color(150, 150, 150));
        lblParesJ2.setFont(new java.awt.Font("Noto Mono", 1, 14)); // NOI18N
        lblParesJ2.setForeground(new java.awt.Color(254, 254, 254));
        lblParesJ2.setText("Pares");
        lblParesJ2.setOpaque(true);

        lblPares_J1.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        lblPares_J1.setForeground(new java.awt.Color(0, 8, 255));
        lblPares_J1.setText(" ");
        lblPares_J1.setOpaque(true);

        lblPares_J2.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        lblPares_J2.setForeground(new java.awt.Color(255, 0, 24));
        lblPares_J2.setText(" ");
        lblPares_J2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblParesJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJugador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJugador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblParesJ1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtJugador2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJugador1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPares_J1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblPares_J2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addComponent(btnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParesJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPares_J1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJugador2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParesJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPares_J2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        lblTitulo.setBackground(new java.awt.Color(1, 132, 180));
        lblTitulo.setFont(new java.awt.Font("Phetsarath OT", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 254, 254));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Memorama");
        lblTitulo.setOpaque(true);
        jPanel3.add(lblTitulo);

        btnIniciar.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel3.add(btnIniciar);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(4, 5));

        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1MouseExited(evt);
            }
        });
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1);

        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_2MouseExited(evt);
            }
        });
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2);

        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_3MouseExited(evt);
            }
        });
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3);

        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_4MouseExited(evt);
            }
        });
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4);

        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_5MouseExited(evt);
            }
        });
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5);

        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_6MouseExited(evt);
            }
        });
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6);

        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_7MouseExited(evt);
            }
        });
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7);

        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_8MouseExited(evt);
            }
        });
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8);

        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_9MouseExited(evt);
            }
        });
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9);

        btn_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_10MouseExited(evt);
            }
        });
        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_10);

        btn_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_11MouseExited(evt);
            }
        });
        btn_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_11ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_11);

        btn_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_12MouseExited(evt);
            }
        });
        btn_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_12ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_12);

        btn_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_13MouseExited(evt);
            }
        });
        btn_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_13ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_13);

        btn_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_14MouseExited(evt);
            }
        });
        btn_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_14ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_14);

        btn_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_15MouseExited(evt);
            }
        });
        btn_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_15ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_15);

        btn_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_16MouseExited(evt);
            }
        });
        btn_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_16ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_16);

        btn_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_17MouseExited(evt);
            }
        });
        btn_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_17ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_17);

        btn_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_18MouseExited(evt);
            }
        });
        btn_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_18ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_18);

        btn_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_19MouseExited(evt);
            }
        });
        btn_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_19ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_19);

        btn_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_20MouseExited(evt);
            }
        });
        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_20);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//  Al hacer clic en el menú iniciar podrá desbloquear los componentes, e iniciar el programa
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        String jug_1 = JOptionPane.showInputDialog(null, "Nombre de jugador 1");
        txtJugador1.setText(jug_1.toUpperCase());
        lblJugador1.setBackground(Color.BLUE);
        while (txtJugador1.getText().isEmpty()) {
            String jug_11 = JOptionPane.showInputDialog(null, "Nombre de jugador 1");
            txtJugador1.setText(jug_11.toUpperCase());
        }
        // En caso de seleccionar la otra categoría se iniciarán los componentes para dicha categoría y además las imágenes que pertenecen a la misma
        String jug_2 = JOptionPane.showInputDialog(null, "Nombre de jugador 2");
        txtJugador2.setText(jug_2.toUpperCase());
        lblJugador2.setBackground(Color.GRAY);
        while (txtJugador2.getText().isEmpty()) {
            String jug_22 = JOptionPane.showInputDialog(null, "Nombre de jugador 2");
            txtJugador2.setText(jug_22.toUpperCase());
        }

        debloqBtn();    // Método para desbloquear los componentes

        // menuCambioEstilo();
        btnIniciar.setEnabled(false);

        cambioFormato();    // método para cambiar el formato de las imágenes si el usuario lo desea


    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // Coparación de categoría, dependiendo de la misma se mostrarán las imágenes y se harán las comparaciones en cada botón e iteración
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:

        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }


    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_10ActionPerformed

    private void btn_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_11ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_11ActionPerformed

    private void btn_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_12ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_12ActionPerformed

    private void btn_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_13ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_13ActionPerformed

    private void btn_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_14ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_14ActionPerformed

    private void btn_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_15ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_15ActionPerformed

    private void btn_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_16ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_16ActionPerformed

    private void btn_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_17ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_17ActionPerformed

    private void btn_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_18ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_18ActionPerformed

    private void btn_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_19ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_19ActionPerformed

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn_20ActionPerformed

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited
        // TODO add your handling code here:
        // Dependiendo de la categoría, se mandará a llamar al método para mostrar las imágenes de cara posterior en caso de no ser encontrada la pareja
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }


    }//GEN-LAST:event_btn_1MouseExited

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_2MouseExited

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_4MouseExited

    private void btn_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_5MouseExited

    private void btn_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_6MouseExited

    private void btn_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_7MouseExited

    private void btn_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_8MouseExited

    private void btn_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_9MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_9MouseExited

    private void btn_10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_10MouseExited

    private void btn_11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_11MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_11MouseExited

    private void btn_12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_12MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_12MouseExited

    private void btn_13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_13MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_13MouseExited

    private void btn_14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_14MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_14MouseExited

    private void btn_15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_15MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_15MouseExited

    private void btn_16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_16MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_16MouseExited

    private void btn_17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_17MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_17MouseExited

    private void btn_18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_18MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_18MouseExited

    private void btn_19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_19MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_19MouseExited

    private void btn_20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_20MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            FN_accion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn_20MouseExited

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }

    private void txtJugador2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (auxiliar == 1) {
            FN_accion3(evt);
        } else {
            accion3(evt);
        }
    }

    private void centrarForma() {   // Método para mostra la aplicación en el centro de la pantalla
        // Toma las dimensiones de la pantalla completa y se divide a la mitad para poder centrar la aplicación

        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();
        double posX = (pantalla.getWidth() - ventana.getWidth()) / 2.0;
        double posY = (pantalla.getHeight() - ventana.getHeight()) / 2.0;
        this.setLocation((int) posX, (int) posY);

    }

    private void bloqBtn() {    // método para bloquear los componentes de la interfaz
        txtJugador1.setEditable(false);
        txtJugador2.setEditable(false);
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        btn_9.setEnabled(false);
        btn_10.setEnabled(false);
        btn_11.setEnabled(false);
        btn_12.setEnabled(false);
        btn_13.setEnabled(false);
        btn_14.setEnabled(false);
        btn_15.setEnabled(false);
        btn_16.setEnabled(false);
        btn_17.setEnabled(false);
        btn_18.setEnabled(false);
        btn_19.setEnabled(false);
        btn_20.setEnabled(false);
        btnLogo.setEnabled(false);

    }

    private void debloqBtn() {  // Método para desbloquear los componentes al mmomento de iniciar el juego
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
        btn_5.setEnabled(true);
        btn_6.setEnabled(true);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
        btn_9.setEnabled(true);
        btn_10.setEnabled(true);
        btn_11.setEnabled(true);
        btn_12.setEnabled(true);
        btn_13.setEnabled(true);
        btn_14.setEnabled(true);
        btn_15.setEnabled(true);
        btn_16.setEnabled(true);
        btn_17.setEnabled(true);
        btn_18.setEnabled(true);
        btn_19.setEnabled(true);
        btn_20.setEnabled(true);
        btnLogo.setEnabled(true);

    }

    /**
     * @param args the command line arguments
     */
    // método main para iniciar el programa
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewMemorV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMemorV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMemorV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMemorV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMemorV1().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnLogo;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_11;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_13;
    private javax.swing.JButton btn_14;
    private javax.swing.JButton btn_15;
    private javax.swing.JButton btn_16;
    private javax.swing.JButton btn_17;
    private javax.swing.JButton btn_18;
    private javax.swing.JButton btn_19;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblParesJ1;
    private javax.swing.JLabel lblParesJ2;
    private javax.swing.JLabel lblPares_J1;
    private javax.swing.JLabel lblPares_J2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables

}
