//concrete factory class for ExcelDocument that extends DocumentFactory 
//implements the createDocument() method

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
