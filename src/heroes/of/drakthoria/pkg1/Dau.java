/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package heroes.of.drakthoria.pkg1;

/**
 * Classe que representa un dau amb un nombre determinat de cares.
 * 
 * @author Manel
 * @version 1.0
 * @since 2025-03-23
 */
public class Dau {
    private int caras;
    
    /**
     * Constructor de la classe Dau.
     * 
     * @param caras Nombre de cares del dau.
     */
    public Dau(int caras){
        this.caras = caras;
    }

    /**
     * Obté el nombre de cares del dau.
     * 
     * @return Nombre de cares del dau.
     */
    public int getCaras() {
        return caras;
    }
    
    /**
     * Simula el llançament del dau i retorna un valor aleatori.
     * 
     * @return Valor aleatori entre 1 i el nombre de cares del dau.
     */
    public int llencar(){
        return (int) Math.floor(Math.random() * this.caras) + 1;
    }
}
