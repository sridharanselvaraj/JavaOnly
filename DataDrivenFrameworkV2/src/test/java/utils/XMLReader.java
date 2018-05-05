package utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;

public class XMLReader {

    private Document document;
    private String fileName;

    public XMLReader(String fileName)
    {
        this.fileName=fileName;
    }

    public String getLocator(String locator){
        SAXReader reader=new SAXReader();
        try {
           document=reader.read(fileName);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
       String data=  document.selectSingleNode("//"+locator.replace(".","/")).getText().trim();
        return data;
    }


}
