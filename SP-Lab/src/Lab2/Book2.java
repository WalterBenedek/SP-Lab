package Lab2;

import java.util.List;

public class Book2 {

    private final String title;
    Chapter chapter;
    private List<Author> authors;
    private List<Chapter> chapterlist;
    private TableOfContent tableOfContent;


    public Book2(String title) {
        this.title = title;


    }

    public void addAuthor(Author rpGheo) {
        this.authors.add(rpGheo);
    }

    public int createChapter(String s) {
        Chapter c = new Chapter(s);


    }

    public Chapter getChapter(int indexChapterOne) {

    }
}
