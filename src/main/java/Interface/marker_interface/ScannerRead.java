package Interface.marker_interface;

import java.io.File;
import java.util.Scanner;

public class ScannerRead {
    public static void main(String[] args) {
        try {
            File f = new File("D://javatrain//src//main//java//Interface//marker_interface//data.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
