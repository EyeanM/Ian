public class Problem4 {
    public static void main (String[]args){
        for (int i = 1; i <= 3; i++){
            System.out.println("How many lines");
            System.out.println("are printed?");
        }

        int total = 25;
        for (int number = 1; number <= (total / 2); number++){
            total = total - number;
            System.out.println(total + " " + number);
        }
        System.out.println();

        System.out.println("T-Minus");
        for (int i = 5; i >= 1; i--){
            System.out.println(i + ", ");
        }
        System.out.println("Blastoff!");
    }
}