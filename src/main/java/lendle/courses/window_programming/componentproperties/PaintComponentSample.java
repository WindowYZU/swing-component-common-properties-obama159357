/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.componentproperties;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class PaintComponentSample extends JPanel{

    private Color color;
   
    //利用 paintComponent 讓 JPanel 畫出一個橢圓
      @Override
    public void paintComponent(Graphics g) {
        
        int width = getWidth();
        int height =getHeight();
        g.setColor(color.BLACK);
        g.drawOval(0, 0, width, height);
        super.paintComponents(g);
        //To change body of generated methods, choose Tools | Templates.
    } 

    //////////////////////////////////////////
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        PaintComponentSample c=new PaintComponentSample();
        frame.add(c);
        frame.setVisible(true);
    }

    private int getwidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getheight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
