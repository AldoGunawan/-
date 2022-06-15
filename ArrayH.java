import java.util.stream.*;
public class ArrayH {
    public static void main(String[] args) {

        int[] ArrayH = {
                82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32
        };
        int h = IntStream.of(ArrayH).sum();
        System.out.println("Jumlah Semua Angka Adalah :" + h);
    }
}
