import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_File_Data {
    public static void main(String[] args) {
        FileInputStream fi = null;
        FileOutputStream fo = null;

        try {
            fi = new FileInputStream("Copy_File_Data.java");
            fo = new FileOutputStream("code.txt");

            int i;
            while ((i = fi.read()) != -1) {
                fo.write(i);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fi != null) {
                    fi.close();
                }
                if (fo != null) {
                    fo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
