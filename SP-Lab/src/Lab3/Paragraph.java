package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    String text;
    List<Element> content;

    public Paragraph(String s){
        this.text = s;
        this.content = new ArrayList<>();
    }


    public void print(){
        System.out.println("Paragraph: "+ this.text);
        for(Element e : content){
            e.print();
        }
    }
}
