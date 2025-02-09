package app;

public class Application {
    
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
        public static void main(String[] args) {
                Personne p1 = new Personne("Alex", "Terrieur");
                Personne p2 = new Personne("John", "D'Oeuf");
                Personne p3 = new Personne("Mac", "Haroni");
                Personne p4 = new Personne("Alain", "Terrieur");
        
                // Tentons d'ajouter des copains
                p1.tenterAjouterCopain(p2);  // Alex ajoute John
                p1.tenterAjouterCopain(p3);  // Alex ajoute Mac
                p1.tenterAjouterCopain(p4);  // Alex ajoute Alain
        
                // Affichage après ajout des copains
                System.out.println(p1.toString());
        
                // Tentons de supprimer un copain
                p1.tenterSupprimerCopain(p3);  // Alex supprime Mac
        
                // Affichage après suppression
                System.out.println(p1.toString());
            }
        
}
