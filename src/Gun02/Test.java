package Gun02;

public class Test {
    public static void main(String[] args) {

        Factoriyel(5);


    }
    public static int Factoriyel(int sayi){
        int fact=1;
        for (int i = 1; i <=sayi ; i++) {
            fact*=i;
        }
        System.out.println("fact = " + fact);
        return fact;
    }

}
