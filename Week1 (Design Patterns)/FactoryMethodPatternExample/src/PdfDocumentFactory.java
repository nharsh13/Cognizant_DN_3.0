//concrete factory class for PdfDocument that extends DocumentFactory 
//implements the createDocument() method

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
