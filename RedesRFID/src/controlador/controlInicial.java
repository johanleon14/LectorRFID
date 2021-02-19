package controlador;

import javax.swing.UIManager;
import modelo.*;
import vista.*;

public class controlInicial {

    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");//Negro
            //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");//Amarillo
            
            //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");//Bonito opcional 1
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");//Bonito opcional 1
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        logica l1 = new logica();
        CU l2 = new CU();
        pLogin p1 = new pLogin();
        pPrincipal p2 = new pPrincipal();
        pActualizar p3 = new pActualizar();
        pInsertar p4 = new pInsertar();
        pAsistencia p5 = new pAsistencia();

        controlClases cl1 = new controlClases(l1, l2, p1, p2, p3, p4, p5);
        cl1.inicializar();
        p1.setVisible(true);
    }

}
