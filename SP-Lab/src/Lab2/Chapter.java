package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String name;
    private List<SubChapter> subChapterList;

    public Chapter(String name) {
        this.name = name;
        this.subChapterList = new ArrayList<SubChapter>();
    }


    public int createSubChapter(String name) {
        SubChapter s = new SubChapter(name);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
    }
}
