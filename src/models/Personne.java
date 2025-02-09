package models;

import java.util.ArrayList;
import java.util.List;

public class Personne {
    
        //
        //              )        (                 ) (           (         (
        //           ( /(   *   ))\ )        (  ( /( )\ )        )\ )  (   )\ )
        //     (   ( )\())` )  /(()/((       )\ )\()|()/(  (    (()/(  )\ (()/(
        //     )\  )((_)\  ( )(_))(_))\    (((_|(_)\ /(_)) )\    /(_)|((_) /(_))
        //    ((_)((_)((_)(_(_()|_))((_)   )\___ ((_|_))_ ((_)  (_)) )\___(_))
        //    __   _____ _____ ___ ___    ___ ___  ___  ___   ___ ___ ___   _
        //    \ \ / / _ \_   _| _ \ __|  / __/ _ \|   \| __| |_ _/ __|_ _| | |
        //     \ V / (_) || | |   / _|  | (_| (_) | |) | _|   | | (__ | |  |_|
        //      \_/ \___/ |_| |_|_\___|  \___\___/|___/|___| |___\___|___| (_)
        //
        private String nom;
        private String prenom;
        private List<Personne> copains;
        public static final int MAX_COPAINS = 10;

        public Personne(String prenom, String nom) {
                this.prenom = prenom;
                this.nom = nom;
                this.copains = new ArrayList<>();
        }
        @Override
        public String toString() {
                
                if (copains.isEmpty()) {
                return prenom + " " + nom.toUpperCase() + " et ses copains ()";
                }

                StringBuilder sb = new StringBuilder();
                sb.append(prenom).append(" ").append(nom.toUpperCase()).append(" et ses copains (");

                for (int i = 0; i < copains.size(); i++) {
                sb.append(copains.get(i).prenom).append(" ").append(copains.get(i).nom.toUpperCase());
                if (i < copains.size() - 1) {
                        sb.append(", ");
                }
                }
                sb.append(")");
                return sb.toString();
        }
        public boolean tenterAjouterCopain(Personne copain) {
                if (copains.size() < MAX_COPAINS && !copains.contains(copain)) {
                copains.add(copain);
                return true;
                }
                return false; 
        }

        
        public boolean tenterSupprimerCopain(Personne copain) {
                return copains.remove(copain);
        }

        
        public static void main(String[] args) {
                Personne p1 = new Personne("Alex", "Terrieur");
                Personne p2 = new Personne("John", "D'Oeuf");
                Personne p3 = new Personne("Mac", "Haroni");
                Personne p4 = new Personne("Alain", "Terrieur");

                
                p1.tenterAjouterCopain(p2);
                p1.tenterAjouterCopain(p3);  
                p1.tenterAjouterCopain(p4);  

                
                System.out.println(p1.toString());

                
                p1.tenterSupprimerCopain(p3); 
                System.out.println(p1.toString());
        }
}

