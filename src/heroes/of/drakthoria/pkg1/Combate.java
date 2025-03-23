/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package heroes.of.drakthoria.pkg1;

/**
 * Classe que representa un combat entre dos personatges en el joc Heroes of Drakthoria.
 * 
 * @author Manel
 * @version 1.0
 * @since 2025-03-23
 */
public class Combate {
    private Personatge per1;
    private Personatge per2;
    private Personatge guanyador;

    /**
     * Constructor de la classe Combate.
     * 
     * @param a Primer personatge del combat.
     * @param b Segon personatge del combat.
     * @param guanyador Personatge guanyador del combat.
     */
    public Combate(Personatge a, Personatge b, Personatge guanyador){
        this.per1 = a;
        this.per2 = b;
        this.guanyador = guanyador;
    }
    
    /**
     * Retorna una representació en format String del combat.
     * 
     * @return Cadena amb la informació del combat.
     */
    @Override
    public String toString(){
        return "Personatge 1: " + this.per1.getNOM() + "\n" +
               "Personatge 2: " + this.per2.getNOM() + "\n" +
               "Guanyador: " + this.guanyador.getNOM();
    }
    
    /**
     * Estableix el primer personatge del combat.
     * 
     * @param per1 Nou primer personatge.
     */
    public void setPer1(Personatge per1) {
        this.per1 = per1;
    }

    /**
     * Estableix el segon personatge del combat.
     * 
     * @param per2 Nou segon personatge.
     */
    public void setPer2(Personatge per2) {
        this.per2 = per2;
    }

    /**
     * Estableix el guanyador del combat.
     * 
     * @param guanyador Nou guanyador del combat.
     */
    public void setGuanyador(Personatge guanyador) {
        this.guanyador = guanyador;
    }
    
    /**
     * Obté el primer personatge del combat.
     * 
     * @return Primer personatge.
     */
    public Personatge getPer1() {
        return per1;
    }

    /**
     * Obté el segon personatge del combat.
     * 
     * @return Segon personatge.
     */
    public Personatge getPer2() {
        return per2;
    }

    /**
     * Obté el guanyador del combat.
     * 
     * @return Personatge guanyador.
     */
    public Personatge getGuanyador() {
        return guanyador;
    }
}
