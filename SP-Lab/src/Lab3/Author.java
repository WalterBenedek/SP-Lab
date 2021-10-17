package Lab3;

public class Author {
    private String name,surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Author(String radu_pavel_gheo) {

    }

    public void print(){
        System.out.println("Name of the author: " + this.name + " " + this.surname);
    }
}
