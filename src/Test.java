import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] mas = new int[8];

        for (int i = 0; i < 8; i++) {
            mas[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < 8; i++)
            if (i % 2 != 0) {
                mas[i] = 0;
            }
        System.out.println(Arrays.toString(mas));
    }
}