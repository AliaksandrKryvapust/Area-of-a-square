public class Source {
    public static void main(String[] args) {
    double a = 2;
        System.out.println(squareArea(a)==1.62);
    }
    public static double squareArea(double A){
        return  (double) Math.round(Math.pow( 2*A/Math.PI, 2)*100)/100;
    }
}
