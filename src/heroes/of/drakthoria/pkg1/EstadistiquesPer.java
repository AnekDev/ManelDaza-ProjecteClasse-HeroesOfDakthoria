/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package heroes.of.drakthoria.pkg1;

/**
 * Classe que representa les estadístiques d'un personatge en funció de les seves habilitats i arma.
 * 
 * @author Manel
 * @version 1.0
 * @since 2025-03-23
 */
public class EstadistiquesPer {
    private int PS = 0;
    private int PSOriginal = 0;
    private int PD = 0;
    private int PA = 0;
    private int PE = 0;
    
    /**
     * Constructor que inicialitza les estadístiques segons el personatge i la seva arma.
     * 
     * @param per Personatge del qual es calcularan les estadístiques.
     * @param ar Arma del personatge.
     */
    public EstadistiquesPer(Personatge per, Arma ar){
        this.PS = per.getCON() + per.getFOR();
        this.PSOriginal = per.getCON() + per.getFOR();
        this.PD = (per.getFOR() + ar.getDanyArma()) / 4;
        this.PA = (per.getINT() + per.getSOR() + ar.getVelArma()); 
        this.PE = (per.getVEL() + per.getSOR() + per.getINT());
    }
    
    /**
     * Constructor per defecte que inicialitza totes les estadístiques a 0.
     */
    public EstadistiquesPer(){
        this.PS = 0;
        this.PSOriginal = 0;
        this.PD = 0;
        this.PA = 0;
        this.PE = 0;
    }
    
    /**
     * Retorna una representació en format String de les estadístiques del personatge.
     * 
     * @return Cadena amb les estadístiques del personatge.
     */
    @Override
    public String toString(){
        return "PS: " + this.PS + "\n" +
               "PD: " + this.PD + "\n" +
               "PA: " + this.PA + "\n" +
               "PE: " + this.PE;
    }
    
    /**
     * Obté els punts de salut del personatge.
     * 
     * @return Punts de salut.
     */
    public int getPS(){
        return this.PS;
    }
    
    /**
     * Obté els punts de dany del personatge.
     * 
     * @return Punts de dany.
     */
    public int getPD(){
        return this.PD;
    }
    
    /**
     * Obté la probabilitat d'atacar del personatge.
     * 
     * @return Probabilitat d'atacar.
     */
    public int getPA(){
        return this.PA;
    }
    
    /**
     * Obté la probabilitat d'esquivar del personatge.
     * 
     * @return Probabilitat d'esquivar.
     */
    public int getPE(){
        return this.PE;
    }

    /**
     * Redueix els punts de salut del personatge.
     * 
     * @param PS Punts de salut a restar.
     */
    public void restarVida(int PS) {
        this.PS = this.PS - PS;
    }
    
    /**
     * Restaura els punts de salut al seu valor original.
     */
    public void restauraVida() {
        this.PS = this.PSOriginal;
    }

    /**
     * Estableix els punts de dany del personatge.
     * 
     * @param PD Nous punts de dany.
     */
    public void setPD(int PD) {
        this.PD = PD;
    }

    /**
     * Estableix la probabilitat d'atacar del personatge.
     * 
     * @param PA Nova probabilitat d'atacar.
     */
    public void setPA(int PA) {
        this.PA = PA;
    }

    /**
     * Estableix la probabilitat d'esquivar del personatge.
     * 
     * @param PE Nova probabilitat d'esquivar.
     */
    public void setPE(int PE) {
        this.PE = PE;
    }
    
    /**
     * Actualitza les estadístiques en funció del personatge i la seva arma.
     * 
     * @param per Personatge del qual es recalcularan les estadístiques.
     * @param ar Nova arma del personatge.
     */
    public void actualitzarEstadistiquesPer(Personatge per, Arma ar){
        this.PS = per.getCON() + per.getFOR();
        this.PD = (per.getFOR() + ar.getDanyArma()) / 4;
        this.PA = (per.getINT() + per.getSOR() + ar.getVelArma());
        this.PE = (per.getVEL() + per.getSOR() + per.getINT());
    }
}
