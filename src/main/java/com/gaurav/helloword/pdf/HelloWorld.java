package com.gaurav.helloword.pdf;



import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import sun.swing.FilePane;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloWorld {

    public static String FILEPATH = "/mnt/10805C1A805C089C/Git Projects/JAVA PDF Creator/HelloWorld.pdf";

    public static void main(String[] args) throws IOException, DocumentException {
        //Rectangle pagesize = new Rectangle(216f, 720f); // the measurements are in user units ; 1 inch = 72 user units
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // writing pdf bytes to memory first
        Document document = new Document(PageSize.A4.rotate());
        PdfWriter pdfWriter = PdfWriter.getInstance(document,baos);
        pdfWriter.setPdfVersion(PdfWriter.VERSION_1_7); // very important to set pdf version before you open the document to write dat to it;
        // if you want things to reflect on page one, do those things before opening the document;
        document.open();
        //
        document.add(new Paragraph("HelloWorld"));
        //
        document.close();
        FileOutputStream outputStream = new FileOutputStream(FILEPATH);
        outputStream.write(baos.toByteArray());
        outputStream.close();
    }


}
