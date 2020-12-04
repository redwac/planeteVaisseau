


public class HelloUniverse {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur=new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        Vaisseau vaisseauMonde=new VaisseauCivil("VAISSEAU_MONDE");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "laser photonique", 3);
        vaisseauMonde.desactiverBouclier();

        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son bouclier.");
        System.out.println("Le Vaisseau-Monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

        ((VaisseauDeGuerre) chasseur).emporterCargaison(20);
        VaisseauDeGuerre chasseursurterre=new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseursurterre);
       System.out.println("la cargaison rejet est :"+chasseursurterre.emporterCargaison(20)+" tonnes ");

        VaisseauDeGuerre fregatsurterre=new VaisseauDeGuerre("FREGATE");
        fregatsurterre.nbPassagers=100;
        terre.accueillirVaisseau(fregatsurterre);
        System.out.println("la cargaison rejet est :"+fregatsurterre.emporterCargaison(45)+" tonnes ");
        System.out.println("la cargaison rejet est :"+fregatsurterre.emporterCargaison(12)+" tonnes ");

        VaisseauDeGuerre fregatsurterre2 = new VaisseauDeGuerre("FREGATE");
        fregatsurterre2.nbPassagers=14;
        terre.accueillirVaisseau(fregatsurterre2);
        System.out.println("la cargaison rejet est :"+fregatsurterre2.emporterCargaison(30)+" tonnes ");

        VaisseauCivil VAISSEAUMONDE1=new VaisseauCivil("VAISSEAU_MONDE");
        //terre.accueillirVaisseau(VAISSEAUMONDE1);
        System.out.println("la cargaison rejet est :"+VAISSEAUMONDE1.emporterCargaison(1560)+" tonnes ");
        System.out.println("la cargaison rejet est :"+VAISSEAUMONDE1.emporterCargaison(600)+" tonnes ");


    }

}
