package kata3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailReader {

    private final String filePath;

    public MailReader(String filePath) {
        this.filePath = filePath;
    }

    public String[] readDoomains() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            ArrayList<String> domainList = new ArrayList<>();
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("@")) {
                    domainList.add(line.split("@")[1]);
                }
            }
            reader.close();
            return domainList.toArray(new String[domainList.size()]);
        } catch (IOException ex) {
            try {
                reader.close();
            } catch (IOException ex1) {
            }
            return new String[0];
        }
    }
}
