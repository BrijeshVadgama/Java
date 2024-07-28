import java.io.IOException;

public class LogOff {

    public static void main(String[] args) {
        Runtime runTime = Runtime.getRuntime();
        try {
            // Correct command to log off on Windows
            runTime.exec("logoff -l");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
