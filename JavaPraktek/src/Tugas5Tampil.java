import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Tugas5Tampil {
    public static void main(String[] args) {
        System.out.println("Belajar java memang mudah Jika dilakukan dengan tekun");
        // double x = 0.0000000000012345;
        // double y = 0.0000000012345;
        // System.out.println(Math.max(Math.log(x), Math.log(y)));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuu_MM_d_HHmmss")));
        System.out.println(System.currentTimeMillis());
    }
}
