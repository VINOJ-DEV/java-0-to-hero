public class twenty{
    String lap = "";
    String processor = "";
    int price = 0;

    public static void main(String args[]){
        twenty Lap1 = new twenty();
        twenty Lap2 = new twenty();
        twenty Lap3 = new twenty();

        Lap1.lap="Acer"; Lap2.lap="Lenovo"; Lap3.lap="Hp";
        Lap1.processor="i9";Lap2.processor="i5";Lap3.processor="i7";

        System.out.println(Lap1.lap);
        System.out.println(Lap1.processor);

        System.out.println(Lap2.lap);
        System.out.println(Lap2.processor);

    }
}