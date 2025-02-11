package Clases;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Font;
public class Plano {
    private JPanel p;
    private int escala;
    private int TamFuente = 10;
    public Plano(JPanel p,int escala){
        this.p = p;
        this.escala = escala;
    }
    public void dibujar (){
        Graphics2D g =  (Graphics2D) p.getGraphics();
        g.clearRect(0, 0, p.getWidth(), p.getHeight()); // Limpiar panel
        // Graficar X
        int x2 = (p.getWidth()/2)-escala;
        for(int x = (p.getWidth()/2)+escala;x<p.getWidth();x+=escala){ 
            g.setColor(Color.GRAY);
            g.drawLine(x, 0, x, p.getHeight());
            g.drawLine(x2, 0, x2, p.getHeight());
            x2 -= escala;
        }
        //Graficar Y
        int y2 = (p.getHeight()/2)-escala;
        for(int y = (p.getHeight()/2)+escala;y<p.getHeight();y+=escala){
            g.setColor(Color.GRAY);
            g.drawLine(0, y, p.getWidth(), y);
            g.drawLine(0, y2, p.getWidth(), y2);
            y2 -=escala;
        }
        //Graficar lineas Rojas
        BasicStroke b = new BasicStroke(3);
        g.setStroke(b);
        g.setColor(Color.red);
        g.drawLine(p.getWidth()/2, 0, p.getWidth()/2, p.getHeight());
        g.drawLine(0, p.getHeight()/2, p.getWidth(), p.getHeight()/2);
        //Dibujar Puntos eje Y
        for (int i = -25; i<=25;i++){
            if (i<0){
                int yDigital = (int) ((int)p.getHeight()/2 - i*escala);
                int xDigital = (int) ((int)p.getWidth()/2 + 0.25*escala); 
                g.setColor(Color.black);
                g.setFont(new Font("Rockwell",1,TamFuente));
                g.drawString(Integer.toString(i), xDigital, yDigital+4); 
            }
            else if(i>0){
                int yDigital = (int) ((int)p.getHeight()/2 - i*escala);
                int xDigital = (int) ((int)p.getWidth()/2 + 0.25*escala);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Rockwell",1,TamFuente));
                g.drawString(Integer.toString(i), xDigital, yDigital+4);
            }
        }
        //Dibujar puntos eje X
        for (int i = -11; i<=11;i++){
            if (i>-10 && i<0){
                int yDigital = (int) ((int)p.getHeight()/2 - 0.25*escala);
                int xDigital = (int) (((int)p.getWidth()/2 + i*escala));
                g.setColor(Color.black);
                g.setFont(new Font("Rockwell",1,TamFuente));
                g.drawString(Integer.toString(i), xDigital-7, yDigital); 
            }else if(i == 0){
                int yDigital = (int) ((int)p.getHeight()/2);
                int xDigital = (int) ((int)p.getWidth()/2);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Rockwell",1,TamFuente));
                g.drawString(Integer.toString(i), xDigital-2, yDigital);
            }else if(i<10 && i>0){
                int yDigital = (int) ((int)p.getHeight()/2 - 0.25*escala);
                int xDigital = (int) (((int)p.getWidth()/2 + i*escala));
                g.setColor(Color.BLACK);
                g.setFont(new Font("Rockwell",1,TamFuente));
                g.drawString(Integer.toString(i), xDigital-2, yDigital);
            }
            else if(i>=10){
                int yDigital = (int) ((int)p.getHeight()/2 - 0.25*escala);
                int xDigital = (int) (((int)p.getWidth()/2 + i*escala));
                g.setColor(Color.BLACK);
                g.setFont(new Font("Rockwell",1,TamFuente));
                g.drawString(Integer.toString(i), xDigital-6, yDigital);
            }
                else if(i<=-10){
                int yDigital = (int) ((int)p.getHeight()/2 - 0.25*escala);
                int xDigital = (int) (((int)p.getWidth()/2 + i*escala));
                g.setColor(Color.BLACK);
                g.setFont(new Font("Rockwell",1,TamFuente));
                g.drawString(Integer.toString(i), xDigital-11, yDigital);
                }
        }
    }
    // Valores en la Funcion Cuadratica
    public void Resolverecuacion(Plano p, double x2mult, double x1mult,double cons){
        for (double i = -13; i<13;i+=.005){
            double y = ((double)Math.pow(i, 2)*x2mult+i*x1mult+cons);
            p.dibujarPunto(i, y);
        }
    }
    //Dibujar los puntos 
    public void dibujarPunto(double i, double y){
        Graphics2D g =  (Graphics2D) p.getGraphics();
        int xDigital = (int) ((int)p.getWidth()/2 + i*escala);
        int yDigital = (int) ((int)p.getHeight()/2 - y*escala);
        g.setColor(Color.BLUE);
        g.fillOval(xDigital-2, yDigital-2, 4, 4);
    }
}
