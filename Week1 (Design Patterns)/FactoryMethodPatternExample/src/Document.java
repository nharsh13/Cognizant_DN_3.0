//Creating interfaces or abstract classes for different document types 
//such as: WordDocument, PdfDocument, and ExcelDocument.

//Define Document Classes
public abstract class Document {
    public abstract void open();
    public abstract void close();
    public abstract void save();
}
