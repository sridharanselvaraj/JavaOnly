package com.file;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class FileExe {

    private File fileName;



    public File getFileName() {
        return fileName;
    }

    public static URI gsoUpload(String fileName) throws URISyntaxException {
        if (fileName.endsWith("txt") && fileName.startsWith("apac")) {
            return new URI("JavaEx/src/main/resources/correct.txt");
        } else{
            return new URI("JavaEx/src/main/resources/incorrect.txt");
    }
    }


}
