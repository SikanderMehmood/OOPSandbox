package Models;

import SandBox.B;

public class Book{
    String name;
    int pages;

    public Book(){

    }

    public Book(String name,int pages){
        this.name=name;
        this.pages=pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
