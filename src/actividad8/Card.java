/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8;

/**
 *
 * @author Paul
 */
public class Card {
      public Card (String Palo, String Color, String Valor){
        this.Palo = Palo;     
        this.Color = Color;
        this.Valor = Valor;
        
    }
    
    public String toString(){ 
        return Palo + " " + Color + " " + Valor;  
    }  
    
    public String getPalo(){
        return Palo;
    }
    
    public void setPalo(String Palo){
        this.Palo = Palo;
    }
    
    public String getColor(){
        return Color;
    }
    
    public void setColor(String Color){
        this.Color = Color;
    }
    
    public String getValor(){
        return Valor;
    }
    
    public void setValor(String Valor){
        this.Valor = Valor;
    }
    
    
    public String Palo;
    public String Color;
    public String Valor;
}
