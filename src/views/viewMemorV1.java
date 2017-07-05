package views;  // Paquete donde está guardada la clase del programa

// Importa necesarios para el desarrollo del porgrama
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

/*
Clase que se encargará de mostrar y ejecutar los componentes necesarios para la ejecución de un juego conocido como memorarma.
En este juego se almacenarán los botones y a su vez las imágenes necesarias para poder representar en su totalidad la funcionalidad
de lo que correponde al jugeo
*/
public class viewMemorV1 extends javax.swing.JFrame {

    int auxiliar = 0;   // Variable auxiliar para poder cambiar el estilo de las imágenes

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    JButton arryBotones[] = new JButton[20];    // Arreglo que almacenará los botones del juego
    int images1[] = new int[20]; //Arreglo para almacenar las imágenes que irán dentro de cada botón
    int repets[] = new int[10]; // Arreglo de repeticiones 
    int par_s[] = new int[20]; //Arreglo para almacenar las parejas 
    int caNotClick[] = new int[20]; //arreglo de clics usado para mostrar y boltear imágenes

    int turno;
    // Varriables usadas para usarse en el juego
    int par1 = 0;   // Variable para contar los pares de imágenes acertados por el usuario, que se le contarán al jugador con el turno que correspponda
    int par2 = 0;   // Misma funcionalidad de la variable anterior
    int vist1 = 0;  // variable para contabilizar las vistas que se ejecutarán al dar clics sobre los botones y cambiar las imágenes
    int vist2 = 0;  // misma funcioanliad de variable anerior
    int clic = 0;   // variable para contabilizar los clics que se darán por el usuario a los botones tratando de acertar las imágenes iguales

    int aumento = 0;    // Variable utilizara para contabilizar el número total de pares disponibles, la cual se utilizará para comparar cuando se termine el juego si es que existe un ganador
    int ch1 = 0;    // Variable para contabilizar el número de pares que lleva el Jugador1
    int ch2 = 0;    // Variable para contabilizar el número de pares que lleva el Jugador2

    ////////////////////
    /*Nuevos componentes que ayudarán a la funcionalidad del juego, en caso de que al inicio del mismp se deseé tratar con 
        una categoría diferente a la predeterminara*/
    JButton fnarryBotones[] = new JButton[20]; // Arreglo que almacenará los botones del juego en caso de seleccionar otra categoría
    int fnimages1[] = new int[20];  //Arreglo para almacenar las imágenes que irán dentro de cada botón, para la categoria 2
    int fnrepets[] = new int[10];   // Arreglo de repeticiones, para la categoria dos
    int fnpar_s[] = new int[20];    // Arreglo para contar los pares en la categoría dos
    int fncaNotClick[] = new int[20];   // Arreglo para contabilizar los clics dados por el usuario, si se encuentra en la categoría dos

    int fnturno;    // Variable tipo etero para revisar el turno de la categoría dos

    int fnpar1 = 0; //Variable de tipo entero para contabilizar los pares de imágenes acertados por el jugador 1 en categoría dos
    int fnpar2 = 0; //Variable de tipo entero para contabilizar los pares de imágenes acertados por el jugador 2 en categoría dos
    int fnvist1 = 0; // variable para contabilizar las vistas que se ejecutarán al dar clics sobre los botones y cambiar las imágenes, en la categoróa dos
    int fnvist2 = 0; // variable para contabilizar las vistas que se ejecutarán al dar clics sobre los botones y cambiar las imágenes, en la categoría dos
    int fnclic = 0; // variable para contar los clics dados por el usuario si se encuentra en la categoría dos

    int fnaumento = 0;  // Variable utilizara para contabilizar el número total de pares disponibles, la cual se utilizará para comparar cuando se termine el juego si es que existe un ganador
    int fnch1 = 0;  // Variable para contabilizar el número de pares que lleva el Jugador1 en categoría dos
    int fnch2 = 0;  // Variable para contabilizar el número de pares que lleva el Jugador2 en categoría dos
    ///////////////////

    /*
    Métodoo para almacenar e igualar los botones con el arreglo que se ejecutó al inicio
    ayudará a un mejor manejos de los mismos para poder guardar dentro de los botones, las imágenes necesarias para 
    poder realizar el juego de manera correcta
    */
    private void iniciarImagenes() {    
        arryBotones[0] = btn1;
        arryBotones[1] = btn2;
        arryBotones[2] = btn3;
        arryBotones[3] = btn4;
        arryBotones[4] = btn5;
        arryBotones[5] = btn6;
        arryBotones[6] = btn7;
        arryBotones[7] = btn8;
        arryBotones[8] = btn9;
        arryBotones[9] = btn10;
        arryBotones[10] = btn11;
        arryBotones[11] = btn12;
        arryBotones[12] = btn13;
        arryBotones[13] = btn14;
        arryBotones[14] = btn15;
        arryBotones[15] = btn16;
        arryBotones[16] = btn17;
        arryBotones[17] = btn18;
        arryBotones[18] = btn19;
        arryBotones[19] = btn20;
        // For para llenar cada uno de los botones con la imágen que tendrá como cara principal antes de hacerle clic
        for (int i = 0; i < arryBotones.length; i++) {
            arryBotones[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg")));
        }

    }
/*
    Métodoo para almacenar e igualar los botones con el arreglo que se ejecutó al inicio
    ayudará a un mejor manejos de los mismos para poder guardar dentro de los botones, las imágenes necesarias para 
    poder realizar el juego de manera correcta, este método se ejecutará en caso de que el usuario elija la categoría dos
    */
    private void fniniciarImagenes() {  
        fnarryBotones[0] = btn1;
        fnarryBotones[1] = btn2;
        fnarryBotones[2] = btn3;
        fnarryBotones[3] = btn4;
        fnarryBotones[4] = btn5;
        fnarryBotones[5] = btn6;
        fnarryBotones[6] = btn7;
        fnarryBotones[7] = btn8;
        fnarryBotones[8] = btn9;
        fnarryBotones[9] = btn10;
        fnarryBotones[10] = btn11;
        fnarryBotones[11] = btn12;
        fnarryBotones[12] = btn13;
        fnarryBotones[13] = btn14;
        fnarryBotones[14] = btn15;
        fnarryBotones[15] = btn16;
        fnarryBotones[16] = btn17;
        fnarryBotones[17] = btn18;
        fnarryBotones[18] = btn19;
        fnarryBotones[19] = btn20;
        // For para llenar cada uno de los botones con la imágen que tendrá como cara principal antes de hacerle clic, para la segunda categoría
        for (int i = 0; i < fnarryBotones.length; i++) {
            fnarryBotones[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_2.jpg")));
        }

    }
    /*
        Método para poder iniciar el areglo para poder mandar las imágenes a los botones de manera aleatoria,
        de tal forma que las imágenes se repartan en todo el tablero de forma dispersa y diferente cada vez que se inicie
        un nuevo juego
    */
    private void iniciarArreglo() { 
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
    /*
        Método para poder iniciar el areglo para poder mandar las imágenes a los botones de manera aleatoria,
        de tal forma que las imágenes se repartan en todo el tablero de forma dispersa y diferente cada vez que se inicie
        un nuevo juego, en caso de ser la categoría dos
    */
    private void fniniciarArreglo() {  
        fniniciarImagenes();    // Llamada al método que iguala los botones con el arreglo creado para poder asignar las imágenes de manera aleatoria y disperza

        fniniciarCero(fnimages1);
        fniniciarCero(fnrepets);
        fniniciarCero(fnpar_s);
        fniniciarCero(fncaNotClick);

        int posicionIma;
        Random Random = new Random();

        for (int i = 0; i < fnimages1.length; i++) {
            posicionIma = Random.nextInt(10);

            if (fnrepets[posicionIma] < 2) {
                fnimages1[i] = posicionIma + 1;
                fnrepets[posicionIma]++;
            } else {
                i--;
            }
        }
    }
    /*
        Método para iniciar en los botones con el índice cero, 
        esto servirá para poder almacenar las imágenes dentro de los botones dependiendo de la imágen que se desee insertar
    */
    private void iniciarCero(int[] arreglo) {   
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
    }
    /*
        Método para iniciar en los botones con el índice cero, 
        esto servirá para poder almacenar las imágenes dentro de los botones dependiendo de la imágen que se desee insertar,
        este se usará en caso de ser la categoría dos
    */
    private void fniniciarCero(int[] fnarreglo) { 
        for (int i = 0; i < fnarreglo.length; i++) {
            fnarreglo[i] = 0;
        }
    }
    /*
        Método para hacer la comparación de las impagenes volteadas, 
        en caso de ser iguales quedarán estáticas y al jugador con el turno se le aumentará un par para poder hacer la comparación
        del ganador final, al término del juego
    */
    private void parejas(int vis1, int vis2) {  
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

    /*
        Método para hacer la comparación de las impagenes volteadas, 
        en caso de ser iguales quedarán estáticas y al jugador con el turno se le aumentará un par para poder hacer la comparación
        del ganador final, al término del juego
        Este se ejecutará en caso de ser la categoría dos
    */
    private void fnparejas(int fnvis1, int fnvis2) { 
        if (fnimages1[fnvis1] == fnimages1[fnvis2]) {

            if (!(fnturno == 1)) {
                fnch1++;
                fnpar1++;
                lblPares_J1.setText(fnpar1 + "");
                fnaumento++;

                fnchecaGanador();

            }
            if (fnturno == 1) {
                fnch2++;
                fnpar2++;
                lblPares_J2.setText(fnpar2 + "");
                fnaumento++;

                fnchecaGanador();

            }

            fnpar_s[fnvis1] = 1;
            fnpar_s[fnvis2] = 1;

        } else {
            fnarryBotones[fnvis1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_2.jpg")));
            fnarryBotones[fnvis2].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_2.jpg")));
            fncaNotClick[fnvis1] = 0;
            fncaNotClick[fnvis2] = 0;
            if (fnturno == 1) {
                lblJugador1.setBackground(Color.BLUE);
                lblJugador2.setBackground(Color.GRAY);
                fnturno = 0;
            } else {
                lblJugador2.setBackground(Color.RED);
                lblJugador1.setBackground(Color.GRAY);
                fnturno = 1;
            }
        }
    }
    /*
        Método que hará la comparación al finalizar el juego...
        En caso de que los pares del jugador 1 sean mayores, se mostrará el nombre ingresado, y además un mensaje designando al ganador
        En caso contrario se ejecutará la misma acción pero con el nombre del jugador 2
        En caso de haber empatado mostrará el mensaje de Empate y despliegará un menú de opciones para el usuario
    */
    public void checaGanador() {    

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
    /*
        Método que hará la comparación al finalizar el juego...
        En caso de que los pares del jugador 1 sean mayores, se mostrará el nombre ingresado, y además un mensaje designando al ganador
        En caso contrario se ejecutará la misma acción pero con el nombre del jugador 2
        En caso de haber empatado mostrará el mensaje de Empate y despliegará un menú de opciones para el usuario
        Este método pertenece a la categoría dos
    */
    private void fnchecaGanador() { 

        if (fnaumento == 10) {
            if (fnch1 == fnch2) {
                fnMenuEmp();
            }
            if (fnch1 > fnch2) {
                fnMenuJ1();
            }
            if (fnch2 > fnch1) {
                fnMenuJ2();
            }

        }
    }
    /*  
        Método para mostrar las imágenes cada vez que se de un clic en un botón
        Primero mostrará en el botón seleccionado la imágen que se encuentre dentro del mismo botón,
        posteriormente se mostrará la imagen cuando se de clic en el segundo botón tratando de adivinar
        si es que son iguales las imágenes
    */
    private void accion3(java.awt.event.ActionEvent evt) { 
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
    /*  
        Método para mostrar las imágenes cada vez que se de un clic en un botón
        Primero mostrará en el botón seleccionado la imágen que se encuentre dentro del mismo botón,
        posteriormente se mostrará la imagen cuando se de clic en el segundo botón tratando de adivinar
        si es que son iguales las imágenes
        Este se ejectutará en caso de ser la categoría dos
    */
    private void fnaccion3(java.awt.event.ActionEvent evt) {   // Método para mostrar las imágenes cada vez que se de un clic en un botón, en caso de elegir la segunda categoría
        for (int i = 0; i < fnarryBotones.length; i++) {
            if (evt.getSource() == fnarryBotones[i] && parejasEncontradas(i)) {
                fncaNotClick[i]++;
                if (fncaNotClick[i] < 2) {
                    fnclic++;
                    fnarryBotones[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesDbz/db_" + fnimages1[i] + ".jpg")));
                    if (fnclic == 1) {
                        fnvist1 = i;
                    } else {
                        fnvist2 = i;
                    }
                }

            }

        }
    }
    /*
        Método para poder regresar las imágenes a las caras posteriores 
        en caso de que no hayan sido acertadas las imágenes o hayan sido iguales.
        Por lo tanto el turno se pasa al siguiente jugador quien seguirá con la mism dinámica
        tratando de juntar más pares de imágenes iguales encontradas
    */
    private void accion4(java.awt.event.MouseEvent evt) {   
        for (int i = 0; i < arryBotones.length; i++) {
            if (evt.getSource() == arryBotones[i]) {
                if (clic >= 2) {
                    parejas(vist1, vist2);
                    clic = 0;
                }

            }

        }

    }
    /*
        Método para poder regresar las imágenes a las caras posteriores 
        en caso de que no hayan sido acertadas las imágenes o hayan sido iguales.
        Por lo tanto el turno se pasa al siguiente jugador quien seguirá con la mism dinámica
        tratando de juntar más pares de imágenes iguales encontradas
        En caso de ser la categoría dos
    */
    private void fnaccion4(java.awt.event.MouseEvent evt) {    
        for (int i = 0; i < fnarryBotones.length; i++) {
            if (evt.getSource() == fnarryBotones[i]) {
                if (fnclic >= 2) {
                    fnparejas(fnvist1, fnvist2);
                    fnclic = 0;
                }

            }

        }

    }
    /*
        Método para cotabilizar las parejas de imágenes que sean encontradas, 
        ya que de esta forma se puede llevar un mejor control de las parejas acertadas por cada usuario
    */
    private boolean parejasEncontradas(int i) { 
        if (par_s[i] != 1) {
            return true;
        } else {
            return false;
        }
    }
    /*
        Método para cotabilizar las parejas de imágenes que sean encontradas, 
        ya que de esta forma se puede llevar un mejor control de las parejas acertadas por cada usuario
        Este es en caso de ser la categoría dos
    */
    private boolean fnparejasEncontradas(int fni) {   // Método para cotabilizar las parejas de imágenes que sean encontradas, en caso de elegir la segunda categoría
        if (fnpar_s[fni] != 1) {
            return true;
        } else {
            return false;
        }
    }
    /*
        Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador1, 
        el cual contiene opciones de reiniciar completamente el juego o finalizar el mismo
    */
    
    private void MenuJ1() {   
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
    /*
        Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador1, 
        el cual contiene opciones de reiniciar completamente el juego o finalizar el mismo
        Este es en caso de ser la categría dos
    */ 
    private void fnMenuJ1() {   
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
   /*
        Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador2, 
        el cual contiene opciones de reiniciar completamente el juego o finalizar el mismo
    */
    private void MenuJ2() {   
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
    /*
        Método que contiene el menú de opciones para mostrar cuando haya ganado el jugador2, 
        el cual contiene opciones de reiniciar completamente el juego o finalizar el mismo
        Este es en caso de ser la categría dos
    */ 
    private void fnMenuJ2() {   
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
    /*
        Método que contiene el menú de opciones para mostrar cuando se haya empatado al término del juego, 
        mostrará un menú de opciones para terminar el juego o reiniciar el mismo
    */
    private void MenuEmp() {   
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
    /*
        Método que contiene el menú de opciones para mostrar cuando se haya empatado al término del juego, 
        mostrará un menú de opciones para terminar el juego o reiniciar el mismo
        Este es en caso de ser la categoría dos
    */
    private void fnMenuEmp() {   // Método que contiene el menú de opciones para mostrar cuando se haya empatado al término del juego
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
            fniniciarArreglo();
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
    /* Método para iniciar todos los componentes necesarios para poder ejectutar el juego
        Además aquí se ejecutará una acción de llamar un método que permite centrar la interfaz a la pantalla
    */
    public viewMemorV1() {
        initComponents();
        centrarForma(); // Llamar a método para poder centrar la interfaz del juego
        bloqBtn();  // Bloqueará elementos dentro de la interfaz

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
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();

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

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn10MouseExited(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel2.add(btn10);

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn11MouseExited(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel2.add(btn11);

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn12MouseExited(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel2.add(btn12);

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn13MouseExited(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        jPanel2.add(btn13);

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn14MouseExited(evt);
            }
        });
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel2.add(btn14);

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn15MouseExited(evt);
            }
        });
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        jPanel2.add(btn15);

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn16MouseExited(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        jPanel2.add(btn16);

        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn17MouseExited(evt);
            }
        });
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        jPanel2.add(btn17);

        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn18MouseExited(evt);
            }
        });
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        jPanel2.add(btn18);

        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn19MouseExited(evt);
            }
        });
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        jPanel2.add(btn19);

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retro_1.jpg"))); // NOI18N
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn20MouseExited(evt);
            }
        });
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel2.add(btn20);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Al hacer clic en el botón iniciar podrá desbloquear los componentes, e iniciar el programa
        además mostrará un menú que preguntará al usuario si es que desea cambiar la categoria de las imágenes
        En caso de que el usuario cambie la categoría, los componentes a usar serán los ya designados para dicha categoría
    */
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
    /*
        Coparación de categoría, dependiendo de la misma se mostrarán las imágenes y se harán las comparaciones en cada botón e iteración
    */
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:

        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }


    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt){
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }
    
    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        // TODO add your handling code here:
        // Dependiendo de la categoría, se mandará a llamar al método para mostrar las imágenes de cara posterior en caso de no ser encontrada la pareja
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }


    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn3MouseExited

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn4MouseExited

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn5MouseExited

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn6MouseExited

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn7MouseExited

    private void btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn8MouseExited

    private void btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn9MouseExited

    private void btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn10MouseExited

    private void btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn11MouseExited

    private void btn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn12MouseExited

    private void btn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn13MouseExited

    private void btn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn14MouseExited

    private void btn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn15MouseExited

    private void btn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn16MouseExited

    private void btn17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn17MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn17MouseExited

    private void btn18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn18MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn18MouseExited

    private void btn19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn19MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn19MouseExited

    private void btn20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn20MouseExited
        // TODO add your handling code here:
        if (auxiliar == 1) {
            fnaccion4(evt);
        } else {
            accion4(evt);
        }
    }//GEN-LAST:event_btn20MouseExited

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {
        if (auxiliar == 1) {
            fnaccion3(evt);
        } else {
            accion3(evt);
        }
    }

    private void txtJugador2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (auxiliar == 1) {
            fnaccion3(evt);
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
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        btn16.setEnabled(false);
        btn17.setEnabled(false);
        btn18.setEnabled(false);
        btn19.setEnabled(false);
        btn20.setEnabled(false);
        btnLogo.setEnabled(false);

    }

    private void debloqBtn() {  // Método para desbloquear los componentes al mmomento de iniciar el juego
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        btn17.setEnabled(true);
        btn18.setEnabled(true);
        btn19.setEnabled(true);
        btn20.setEnabled(true);
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
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnLogo;
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
