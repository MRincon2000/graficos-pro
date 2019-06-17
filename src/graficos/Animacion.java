/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class Animacion extends AnimationTimer{
       private Carro carro;
       private Obstaculo obs;
       private GraphicsContext lapiz;
       private Image fondo=null;
       private Image ufo=null;
       int s =90;
       int w=0;
        int r=0;

    public Animacion(GraphicsContext lapiz) {
        this.carro =  new Carro(0,100);
        this.obs=new Obstaculo(350,100);
        this.lapiz = lapiz;
        this.fondo=new Image("imagenes/fondo.png");
        this.ufo=new Image("imagenes/ufo_0.png");
    }
       
    @Override
    public void handle(long l) {
        
        w++;
     if (w%5|==0){
         r++;
         if (r>5){
             r=0;
         }
         this.ufo=new Image("imagenes/ufo_"+r+".png");
         
     }   
     
lapiz.clearRect(0, 0, 700, 300);
lapiz.drawImage(fondo, 0, 0);
lapiz.drawImage(this.ufo,this.carro.getX(),this.carro.getY());


lapiz.setFill(Color.RED);
lapiz.fillRect(600, 10, 90, 10);
lapiz.setFill(Color.BLUE);
lapiz.fillRect(600, 10, s, 10);
lapiz.fillRect(350,100,30,30);
Shape carro = new Rectangle(this.carro.getX(),this.carro.getY()-10,30,30);
Shape objeto = new Rectangle(this.obs.getX(),this.obs.getY(),30,30);
Shape inter=SVGPath.intersect(carro,objeto);
if(inter.getLayoutBounds().getWidth()!= -1 && this.obs.isEstado()==true){
    s=s-10;
    this.obs.setEstado(false);
}
this.carro.mover();
    } 
}
