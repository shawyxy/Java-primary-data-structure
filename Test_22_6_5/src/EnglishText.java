import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class EnglishText {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(
                new FileInputStream("bigbook.txt"));
        int s,number=0;
        while((s = input.read()) != -1){
            if ((char)s == 'a')
                number++;
            System.out.print((char)s);
        }
        System.out.println("\n\nThe number of a is "+number);
    }
}
