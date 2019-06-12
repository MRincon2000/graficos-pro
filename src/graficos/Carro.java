/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author Estudiante
 */
public class Carro extends Objeto{

    public Carro(int x, int y) {
        super(x, y);
    }
    private int b=0;
    public void mover(){
    
    if (this.x>670){
       b=1;
    }
    if (this.x<0){
        b=0;
    }
    if (b==0){
    this.x++;
    }
    if(b==1){
        this.x--;
    }
}
}
