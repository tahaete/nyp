public class Test {
    public static void main(String[] args) {
        System.out.println(MyUtils.ucgenCevre(5,5,3));
        System.out.println(MyUtils.ucgenAlan(5,5,3));
        System.out.println(MyUtils.cokgenCevre(4,4,4,4,4,4,4));
        System.out.println(MyUtils.cokgenAlan(4,4,4,4,4,4,4));

        int[] sayilar = {-80,-62,-38,-20,-2,1,3,5,13,20,35,60,90};
        double[] sonuclar = MyUtils.fonksiyon(sayilar);

        for (double sonuc:
                sonuclar) {
            System.out.println(sonuc);
        }
    }
}
