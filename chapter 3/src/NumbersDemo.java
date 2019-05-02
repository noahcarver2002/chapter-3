public class NumbersDemo {
    public static void main(String[] args){
        int a = 5;
        int b =10;

        displayTwiceTheNumber(a, b);


    }
    public static void displayTwiceTheNumber(int a, int b){

        a =a *2;
        b = b * 2;
        displayResults("twice the number is ", a);
        displayResults("twice the number is ",b);

    }


    public static void displayNumberPlusFive(int y, int z){
        y = y + 5;
        z = z + 5;

        displayResults("twice the number is ",y);
        displayResults("twice the number is ",z);


    }
    public static void displayNumberSquared(int c, int d){}







    public static void displayResults(String display, int answer){
        System.out.println(display+answer);
    }
}
