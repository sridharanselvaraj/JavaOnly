import com.file.FileExe;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Spliterator;

public class Main  extends FileExe {

    public static void main(String[] args) throws IOException, URISyntaxException {

        String fileName="src/main/resources/correct.txt";

        List<String> list;
        list = Files.readAllLines(Paths.get(gsoUpload("epac.txt").getPath()));
        System.out.println("Display "+list);

    }

}
