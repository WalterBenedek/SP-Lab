package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Book3 {
    String title;
    List<Author> authorList;
    List<Element> content;

    public Book3(String text){
        this.title = text;
        this.authorList = new ArrayList<>();
        this.content = new ArrayList<>();
    }

    public void addAuthor(Author a){
        authorList.add(a);
    }



    public void addContent(Paragraph e){
        content.add(e);

    }
    public void print(){

    }
}
