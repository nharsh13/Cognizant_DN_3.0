//concrete factory class for WordDocument that extends DocumentFactory 
//implements the createDocument() method

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
