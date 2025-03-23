/**
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package heroes.of.drakthoria.pkg1;

import java.util.*;

/**
 *
 * @author Manel
*/
/**
 * Provides some service
 * @author Manel Daza <maneldaza170806@gmail.com>
 * @version 1.8
 */

public class HeroesOfDrakthoria1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Personatge> llistaPersonatges = new ArrayList<>();
        ArrayList<Arma> llistaArmes = new ArrayList<>();
        ArrayList<Combate> llistaCombat = new ArrayList<>();
        Dau d0 = new Dau(25);
        Dau d1 = new Dau(25);
        Dau d2 = new Dau(25);
        
        // Personatges default
        Arma EspadaVieja = new Arma("Espasa", 5, 5);
        llistaArmes.add(EspadaVieja);
        Personatge Quijote = new Personatge("Quijote", 5, 3, 5, 2, 8, "Guerrer", llistaArmes.get(Arma.getNumArmes()));
        llistaPersonatges.add(Quijote);

        Arma Tizona = new Arma("Espasa", 8, 3);
        llistaArmes.add(Tizona);
        Personatge Cid = new Personatge("Cid", 6, 5, 2, 4, 4, "Caballer", llistaArmes.get(Arma.getNumArmes()));
        llistaPersonatges.add(Cid);

        Arma DagaAtium = new Arma("Daga", 4, 8);
        llistaArmes.add(DagaAtium);
        Personatge Vin = new Personatge("Vin", 3, 3, 7, 8, 7, "Assasi", llistaArmes.get(Arma.getNumArmes()));
        llistaPersonatges.add(Vin);

        boolean app = true;
        while (app == true) {
            System.out.println("Digues que vols fer");
            System.out.println("1. Afegir personatges");
            System.out.println("2. Iniciar un combat");
            System.out.println("3. Mostrar estadistiques");
            System.out.println("4. Sortir");
            int resposta = scan.nextInt();
            scan.nextLine();
            switch (resposta) {
                case 1:
                    pers(llistaPersonatges, llistaArmes);
                    break;
                case 2:
                    combatir(llistaPersonatges, llistaCombat, d0, d1, d2);
                    break;
                case 3:
                    stats(llistaPersonatges ,llistaCombat);
                    break;
                case 4:
                    app = false;
                    break;
                default:
                    System.out.println("Opcio no valida");
            }
        }
    }
    
    public static void stats(ArrayList<Personatge> llistaPersonatges ,ArrayList<Combate> llistaCombat) {
        Scanner scan = new Scanner(System.in);
        boolean app = true;
        while (app == true) {
            System.out.println("Digues que vols fer");
            System.out.println("1. Mostrar combats realitzats");
            System.out.println("2. Mostrar dades personatges");
            System.out.println("3. Tornar");
            int resposta = scan.nextInt();
            scan.nextLine();
            switch (resposta) {
                case 1:
                    int combates = 0;
                    for(Combate co : llistaCombat){
                        System.out.println("Combate " + combates);
                        System.out.println(co.toString());
                    }
                    break;
                case 2:
                    int personatges = 0;
                    for(Personatge per : llistaPersonatges){
                        System.out.println("Personatge " + personatges);
                        System.out.println(per.toString());
                    }
                    break;
                case 3:
                    app = false;
                    break;
                default:
                    System.out.println("Opcio no valida");
            }
        }
    }
    
    public static void pers(ArrayList<Personatge> llistaPersonatges, ArrayList<Arma> llistaArmes) {
        Scanner scan = new Scanner(System.in);
        // Creacio de personatges
        System.out.println("Digues cuants personantges vols crears (minim 1)");
        int personatges = scan.nextInt();
        for (int i = 0; i < personatges; i++) {
            System.out.println("Escull una arma per el teu personage: 1. Espasa, 2. Daga, 3. Martell");
            boolean valid = true;
            do {
                valid = true;
                int resposta = scan.nextInt();
                scan.nextLine();
                switch (resposta) {
                    case 1:
                        llistaArmes.add(new Arma("Espasa", 4, 4));
                        break;
                    case 2:
                        llistaArmes.add(new Arma("Daga", 2, 6));
                        break;
                    case 3:
                        llistaArmes.add(new Arma("Martell", 6, 2));
                        break;
                    default:
                        System.out.println("Opcio invalida");
                        valid = false;
                }
            } while (valid = false);
            System.out.println("Introdueix en ordre separat per intros: nom, força, constitucio, velocitat, inteligencia, sort, classe");
            llistaPersonatges.add(new Personatge(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextLine() + scan.nextLine(), llistaArmes.get(Arma.getNumArmes())));
        }
    }

    public static void combatir(ArrayList<Personatge> llistaPersonatges, ArrayList<Combate> Combates, Dau d, Dau d2, Dau d3) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HORA DE COMBATIR");
        System.out.println("Digues dos dels seguents personatges: ");
        int buclePer = 0;
        for (Personatge per : llistaPersonatges) {
            System.out.println(buclePer + ". " + per.getNOM());
            buclePer++;
        }
        int per1 = scan.nextInt();
        int per2 = scan.nextInt();
        int perAtaca = 0;
        int perDefensa = 0;
        scan.nextLine();

        int contadorTorns = 0;
        boolean combat = true;
        while (combat == true) {
            if (contadorTorns % 2 == 0) {
                perAtaca = per1;
                perDefensa = per2;
            } else {
                perAtaca = per2;
                perDefensa = per1;
            }
            contadorTorns++;
            System.out.println("Torn " + contadorTorns);
            System.out.println("Lluitador " + llistaPersonatges.get(perAtaca).getNOM() + " ataca");
            
            int tirada = d.llencar();
            int per1PA = llistaPersonatges.get(perAtaca).getStatsDerivades().getPA();
            if (tirada <= per1PA) {
                int tiradaA = d.llencar();
                int tiradaB = d2.llencar();
                int tiradaC = d3.llencar();
                if (tiradaA + tiradaB + tiradaC <= llistaPersonatges.get(perDefensa).getStatsDerivades().getPE()) {
                    System.out.println(d.getCaras());
                    System.out.println(llistaPersonatges.get(perDefensa).getStatsDerivades().getPE());
                    System.out.println("Pero el jugador " + llistaPersonatges.get(perDefensa).getNOM() + " ha esquivat");
                }else{
                    llistaPersonatges.get(perDefensa).getStatsDerivades().restarVida(llistaPersonatges.get(perAtaca).getStatsDerivades().getPD());
                }
            } else {
                System.out.println("Pero ha fallat!");
            }
            
            if(llistaPersonatges.get(perDefensa).getStatsDerivades().getPS() <= 0){
                System.out.println("El combat a acabat!");
                System.out.println("Guanyador: " + llistaPersonatges.get(perAtaca).getNOM());
                llistaPersonatges.get(perAtaca).getStatsDerivades().restauraVida();
                llistaPersonatges.get(perDefensa).getStatsDerivades().restauraVida();
                llistaPersonatges.get(perAtaca).getStatsFonamentals().guanyarPEX(llistaPersonatges.get(perDefensa).getStatsDerivades().getPS());
                
                Combates.add(new Combate(llistaPersonatges.get(per1), llistaPersonatges.get(per2), llistaPersonatges.get(perAtaca)));
                combat = false;
            }else{
                System.out.println(llistaPersonatges.get(per1).getNOM() + " PS: " + llistaPersonatges.get(per1).getStatsDerivades().getPS());
                System.out.println(llistaPersonatges.get(per2).getNOM() + " PS: " + llistaPersonatges.get(per2).getStatsDerivades().getPS());
            }
            
            System.out.println("Presiona intro per continuar");
            scan.nextLine();
        }
    }
}