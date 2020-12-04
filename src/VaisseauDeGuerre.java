public class VaisseauDeGuerre extends Vaisseau {

    boolean armesDesactivees;

    VaisseauDeGuerre(String type){
        this.type=type;
        if(type.equals("CHASSEUR") && nbPassagers>12){
            tonnageMax=0;
        }
        else if(type.equals("FREGATE")){
            tonnageMax=50;
        }
        else if(type.equals("CROISEUR")){
            tonnageMax=100;
        }
    }
    void attaque(Vaisseau vaisseauCible, String arme, int duree) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauCible.type + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }
    @Override
    int emporterCargaison(int cargaison){
        if (type=="CHASSEUR"){
            return cargaison;
        }
        else if(nbPassagers<12){
            return cargaison;

        }
        else {
            int tonnagepassager=2*nbPassagers;
            int tonnagerestant=tonnageMax-tonnageActuel;
            int tonnageconsidirer=(tonnagepassager<tonnagerestant ? tonnagepassager : tonnagerestant);
            if(cargaison>tonnageconsidirer){
                tonnageActuel=tonnageMax;

                return cargaison-tonnageconsidirer;
            }
            else {
                tonnageActuel=tonnageActuel+cargaison;
                return 0;
            }
        }

    }

    void desactiverArmes() {
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        armesDesactivees = true;
    }

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type+".");
        desactiverArmes();
    }
}
