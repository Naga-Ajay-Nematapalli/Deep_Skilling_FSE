public class FactoryTest {
    public static void main(String[] args){
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();

        DocumentFactory PDFFactory = new PdfDocumentFactory();
        Document PDFDocument = PDFFactory.createDocument();
        PDFDocument.open();


        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();

        System.out.println("All documents are created using Factory Method Pattern");
    }
}
