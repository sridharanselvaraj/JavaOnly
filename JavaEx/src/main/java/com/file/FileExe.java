package com.file;

import java.io.File;

public class FileExe {

    private File fileName;



    public File getFileName() {
        return fileName;
    }

    public File gsoUpload(String fileName) {
        if (fileName.endsWith("*.txt") && fileName.startsWith("apac")) {
            return new  File("src/main/resources/correct.txt").getAbsoluteFile();
        } else{
            return new File("src/main/resources/incorrect.txt").getAbsoluteFile();
    }
    }


}
