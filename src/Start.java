public class Start {
    public static void main(String[] args) {
        int f1= 0;
        int f2= 1;
        while(f1 <= 34){
            System.out.println(f1);
            System.out.println(f2);
            f1 = f1+f2;
            f2 = f1+f2;
        }
    }
}
