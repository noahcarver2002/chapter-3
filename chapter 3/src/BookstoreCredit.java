public class BookstoreCredit {
    public static void main(String[] args){

        double a = 3.2;
        double b = 32;
        computeBookstoreCredit(a,b);
    }
    public static void computeBookstoreCredit(double a, double b){
        double percent = (a/b)*100;
        System.out.print(a + " is " + percent + "percent of " + b);

    }

}
