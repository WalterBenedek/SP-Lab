package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Section {
    String title;
    List<Element> content;

    public Section(String txt){
        this.title = txt;
        content = new ArrayList<>();
    }

    public void add(Paragraph e){
        Element temp = e;
        content.add(temp);
    }

    public void remove(Element e){
        content.remove(get(e));
    }

    public int get(Element e){
        return content.indexOf(e);
    }

    public void print(){
        System.out.println(this.title);
        for(Element e : content){
            e.print();
        }
    }
}
