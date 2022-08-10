import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UrlCmd {

    public static void main(String[] args) throws IOException {
        String urlString = URLDecoder.decode(args[0], "UTF-8");
        String cmd = buildCmd(urlString);
        log(urlString, cmd);
        Runtime.getRuntime().exec("cmd /c start /b " + cmd);
    }

    public static void log(String urlString, String cmd) throws IOException {
        OutputStream os = new FileOutputStream("C:\\home\\workspace\\java\\urlCmd\\log\\urlCmd.log", true);
        String log = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " url: " + urlString + ", cmd: " + cmd + "\n";
        os.write(log.getBytes(StandardCharsets.UTF_8));
        os.flush();
        os.close();
    }

    public static String buildCmd(String cmd) {
        String r = cmd.substring("fileclient://".length());
        if (r.endsWith("/")) {
            return r.substring(0, r.length() - 1);
        }
        return r;
    }
}
