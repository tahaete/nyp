public class MyUtils {

    public static float ucgenCevre(float a, float b, float c) {
        return a+b+c;
    }

    public static float ucgenAlan(float a, float b, float c) {
        float u = MyUtils.ucgenCevre(a,b,c)/2;
        
        return (float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
    }

    public static float cokgenCevre(float ... kenar) {
        float topla = 0;
        
        for (float i: kenar) {
            topla += i;
        }
        
        return topla;
    }

    public static float cokgenAlan(float ... kenar) {
        return (float) (0.25 * ( kenar.length * (float) Math.pow(kenar[0], 2) *
                (1 / Math.tan(Math.PI/kenar.length)) ));
    }

    public static double[] fonksiyon(int[] dizi) {
        double[] sonuclar = new double[sayilar.length];
        int j = 0;
        
        for (double i: dizi) {
            i = 3 * Math.pow(i, 2) - 2*Math.pow(Math.E, i) + Math.sqrt(i);
            
            sonuclar[j] = 1 / (1 + Math.pow(Math.E, i));
            
            j++;
        }
        
        return sonuclar;
    }
}
