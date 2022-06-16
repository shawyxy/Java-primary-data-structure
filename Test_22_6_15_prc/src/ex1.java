public class ex1 {
    public static void main(String[] args) {
        for(int i = 1000; i < 10000; i++){
            int a = i % 10;//个位
            int b = (i-(i%100)*100)/10;//十位
            int c = (i - (i%1000)*1000)/10;//千位
            int d = i/1000;
            if(a*b == i||a*c==i||a*d==i||b*c==i||b*d==i||c*d==i){
                System.out.println("i="+i);
            }
        }
    }
}
