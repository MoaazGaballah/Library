/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author moaaznotadmin
 */
public class Book {

    String name;
    String author;
    String PublishDate;
    int seriNo;

    public Book(String name, String author, String PublishDate, int seriNo) {
        this.name = name;
        this.author = author;
        this.PublishDate = PublishDate;
        this.seriNo = seriNo;
    }
    
    @Override
    public String toString(){
        return this.name + "\t" +this.author + "\t" + this.PublishDate + "\t" + this.seriNo;
    }
}
