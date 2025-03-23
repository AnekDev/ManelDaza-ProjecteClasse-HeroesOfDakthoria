/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package heroes.of.drakthoria.pkg1;

/**
 * Classe que representa les estadístiques bàsiques d'un personatge,
 * incloent el nivell i els punts d'experiència.
 * 
 * @author Manel
 * @version 1.0
 * @since 2025-03-23
 */
public class EstadistiquesFon {
    private int NIV;
    private int PEX;
    
    /**
     * Constructor per defecte. Inicialitza el nivell a 1 i els punts d'experiència a 0.
     */
    public EstadistiquesFon(){
        this.NIV = 1;
        this.PEX = 0;
    }
    
    /**
     * Retorna una representació en format String de les estadístiques.
     * 
     * @return Cadena amb el nivell i els punts d'experiència.
     */
    @Override
    public String toString(){
        return "Nivell: " + this.NIV + "\n" +
               "Punts Exp: " + this.PEX;
    }
    
    /**
     * Obté el nivell actual.
     * 
     * @return Nivell del personatge.
     */
    public int getNIV(){
        return this.NIV;
    }
    
    /**
     * Obté els punts d'experiència actuals.
     * 
     * @return Punts d'experiència del personatge.
     */
    public int getPEX(){
        return this.PEX;
    }
    
    /**
     * Afegeix punts d'experiència i actualitza el nivell si és necessari.
     * 
     * @param PEX Punts d'experiència guanyats.
     */
    public void guanyarPEX(int PEX){
        int NivInicial = this.NIV;
        this.PEX += PEX;
        
        if(this.PEX <= 100){
            this.NIV = 1;
        }else if(this.PEX < 200){
            this.NIV = 2;
        }else if(this.PEX < 500){
            this.NIV = 3;
        }else if(this.PEX < 1000){
            this.NIV = 4;
        }else if(this.PEX < 2000){
            this.NIV = 5;
        }
        
        if(this.NIV != NivInicial){
            System.out.println("Has pujat de nivell");
        }
    }
}