/**
 * Created by fatima on 11/10/16.
 */
public class Triangle {
     int nbrDeLigne;
    int espace;
String etoile = " ";
public Triangle ( int n){
    nbrDeLigne=n;
}
public void calcule(){
    for (int i = 0; i < nbrDeLigne; i++) {
        espace=nbrDeLigne-i;
        for (int j = 0; j < espace; j++) {
            System.out.print(" ");
        }
    etoile = etoile + "* ";
        System.out.print(etoile +"\n");

    }

}
}

