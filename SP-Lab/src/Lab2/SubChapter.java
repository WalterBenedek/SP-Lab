package Lab2;

public class SubChapter {
    private final String name;
    Image image;
    Paragraph paragraph;
    Table table;


    public SubChapter(String name, Image image, Paragraph paragraph, Table table) {
        this.name = name;
        this.image = image;
        this.paragraph = paragraph;
        this.table = table;
    }

    public void createNewParagraph(String s) {
    }

    public void createNewImage(String s) {
    }

    public void createNewTable(String s) {

    }

    public void print() {
        System.out.println();
    }
}
