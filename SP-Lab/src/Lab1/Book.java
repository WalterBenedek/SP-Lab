package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String title;
    private final List<String> images;
    private final List<String> paragraphs;
    private final List<String> tables;

    public Book(String title) {
        this.title = title;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void createNewImage(String image){
        this.images.add(image);
    }
    public void createNewTable(String table){
        this.tables.add(table);
    }
    public void createNewParagraph(String paragraph){
        this.paragraphs.add(paragraph);
    }

    public void print(){
        System.out.println("Titlul este "+title);

        System.out.println("paragraphs: ");
        for(String i : this.paragraphs)
            System.out.println(i);

        System.out.println("images: ");
        for(String i : this.images)
            System.out.println(i);

        System.out.println("tables: ");
        for(String i : this.tables)
            System.out.println(i);
    }
}