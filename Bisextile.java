import java.util.Scanner;

public class Bisextile {
    public static void main(String[] args){

        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer une année du calendrier : ");
        year = scan.nextInt();

        //Ici, on cherche à savoir si l'année est divisible par 400. Grâce au modulo, si le reste d'une division par
        //400 est 0, alors on sait avec certitude que l'année est bisextile. (cf. règles des années bisextiles.)

        if (year%400 == 0){
            System.out.println(year + " est une année bisextile.");
        }
        //Il faut ensuite tester si l'année est divisible par 4, mais pas par 100. Encore une fois, le modulo nous aide.
        //Ainsi, si l'année est divisible par 4, mias pas par 100, alors l'année est bisextile.
        else
            if ((year%4 == 0)&&(year%100 != 0)){
                System.out.println(year + " est une année bisextile.");
            }
        //Enfin, toutes les potentielles années choisies qui ne sont pas rentrées dans les critères précédents, sont
        //donc des années non-bisextiles.
            else {
                System.out.println(year + " n'est pas une année bisextile.");
            }
    }
}
