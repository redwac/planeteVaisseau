
public class VaisseauCivil extends Vaisseau{
    VaisseauCivil(String type){
        this.type=type;
        if(type.equals("CARGO") ){
            tonnageMax=500;
        }
        else if(type.equals("VAISSEAU_MONDE")){
            tonnageMax=2000;
        }

    }
    int emporterCargaison(int cargaison){
        int tonnagerestant = tonnageMax-tonnageActuel;
        if(cargaison>tonnagerestant){
            tonnageActuel=tonnageMax;
            return cargaison-tonnagerestant;
        }
        else {
            tonnageActuel=tonnageActuel+cargaison;
            return 0;
        }

    }

}
