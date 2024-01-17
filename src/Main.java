import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("enter temperature : ");
        heat = input.nextInt();

        String recommendation = (heat < 5) ? "Skiing" :
                                (heat <= 15) ? "Cinema" :
                                (heat <= 25) ? "Picnic" :
                                "Swimming";

        System.out.println("Recommendation: " + recommendation);


    }
}
