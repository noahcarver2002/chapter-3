public class MetricConversion {
    public static void main(String[] arg){
        double a = 2.54;
        double b = 3.7854;
        computeMetricConversion(a,b);
    }
    public static void computeMetricConversion(double a, double b){
        double percent = (a/b)*100;
        System.out.print(a + " is " + percent + "percent of " + b);

    }
    }


