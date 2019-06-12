/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Estudiante
 */
public class Animacion extends AnimationTimer{
       private Carro carro;
       private GraphicsContext lapiz;

    public Animacion(GraphicsContext lapiz) {
        this.carro =  new Carro(0,100);
        this.lapiz = lapiz;
    }
       
    @Override
    public void handle(long l) {
        lapiz.setFill(Color.ORANGE);
lapiz.clearRect(0, 0, 700, 300);
lapiz.fillRect(this.carro.getX(),this.carro.getY(), 30, 15);
lapiz.setFill(Color.BLACK);
lapiz.fillOval(this.carro.getX()+3, this.carro.getY()+12, 10, 10);
lapiz.fillOval(this.carro.getX()+17, this.carro.getY()+12, 10, 10);
lapiz.setFill(Color.ORANGE);
lapiz.fillRect(this.carro.getX()+5, this.carro.getY()-10, 20, 10);

this.carro.mover();
    } 
}
