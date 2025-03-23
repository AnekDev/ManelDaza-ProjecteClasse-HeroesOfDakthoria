/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package heroes.of.drakthoria.pkg1;

/**
 * Classe que representa un personatge dins del joc, incloent-hi les seves característiques,
 * la seva arma i les seves estadístiques.
 * 
 * @author Manel
 * @version 1.0
 * @since 2025-03-23
 */
public class Personatge {
    private String NOM;
    private int FOR;
    private int CON;
    private int VEL;
    private int INT;
    private int SOR;
    private String classe;
    private Arma arma;
    private EstadistiquesPer statsDerivades;
    private EstadistiquesFon statsFonamentals;
    
    /**
     * Constructor per defecte que inicialitza un personatge buit amb valors per defecte.
     */
    public Personatge(){
        this("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
    }
    
    /**
     * Constructor que inicialitza un personatge amb els atributs especificats.
     * 
     * @param nom Nom del personatge.
     * @param For Força del personatge.
     * @param con Constitució del personatge.
     * @param vel Velocitat del personatge.
     * @param Int Intel·ligència del personatge.
     * @param sor Sort del personatge.
     * @param cls Classe del personatge.
     * @param ar Arma del personatge.
     */
    public Personatge(String nom, int For, int con, int vel, int Int, int sor, String cls, Arma ar){
        this.NOM = nom;
        this.FOR = For;
        this.CON = con;
        this.VEL = vel;
        this.INT = Int;
        this.SOR = sor;
        this.classe = cls;
        this.arma = ar;
        this.statsDerivades = new EstadistiquesPer(this, this.getArma());
        this.statsFonamentals = new EstadistiquesFon();
    }
    
    /**
     * Retorna una representació en format String del personatge.
     * 
     * @return Informació del personatge en format de text.
     */
    @Override
    public String toString(){
        return 
                "Nom: " + this.NOM + "\n" +
                "Força: " + this.FOR + "\n" +
                "Constitució: " + this.CON + "\n" +
                "Velocitat: " + this.VEL + "\n" +
                "Intel·ligència: " + this.INT + "\n" +
                "Sort: " + this.SOR + "\n" +
                "Classe: " + this.classe + "\n" +
                "Arma: " + this.arma.toString() + "\n" +
                "Stats Derivades: " + this.statsDerivades.toString() + "\n" +
                "Stats Fonamentals: " + this.statsFonamentals.toString();
    }
    
    /**
     * Estableix una nova arma per al personatge.
     * 
     * @param ar Nova arma a assignar.
     */
    public void setArma(Arma ar){
        this.arma = ar;
    }
    
    /**
     * Obté el nom del personatge.
     * 
     * @return Nom del personatge.
     */
    public String getNOM() {
        return this.NOM;
    }
    
    /**
     * Obté la força del personatge.
     * 
     * @return Força del personatge.
     */
    public int getFOR() {
        return this.FOR;
    }

    /**
     * Obté la constitució del personatge.
     * 
     * @return Constitució del personatge.
     */
    public int getCON() {
        return this.CON;
    }

    /**
     * Obté la velocitat del personatge.
     * 
     * @return Velocitat del personatge.
     */
    public int getVEL() {
        return this.VEL;
    }

    /**
     * Obté la intel·ligència del personatge.
     * 
     * @return Intel·ligència del personatge.
     */
    public int getINT() {
        return this.INT;
    }

    /**
     * Obté la sort del personatge.
     * 
     * @return Sort del personatge.
     */
    public int getSOR() {
        return this.SOR;
    }

    /**
     * Obté la classe del personatge.
     * 
     * @return Classe del personatge.
     */
    public String getClasse() {
        return this.classe;
    }

    /**
     * Obté l'arma del personatge.
     * 
     * @return Arma del personatge.
     */
    public Arma getArma() {
        return this.arma;
    }

    /**
     * Obté les estadístiques derivades del personatge.
     * 
     * @return Estadístiques derivades.
     */
    public EstadistiquesPer getStatsDerivades() {
        return this.statsDerivades;
    }

    /**
     * Obté les estadístiques fonamentals del personatge.
     * 
     * @return Estadístiques fonamentals.
     */
    public EstadistiquesFon getStatsFonamentals() {
        return this.statsFonamentals;
    }    
}
