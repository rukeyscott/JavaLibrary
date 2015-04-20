package book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniferschofield
 */
 
 
// Book class contains all infomation of single book 

// Book default constructor
// Purpose: Initialize variables to default values
// Parameters: none
// Returns: none
public class Book {
    String title;
    String author;
    String description;
    String type;
    boolean in;
    int id;

// Book parameterized constructor
// Purpose: Initialize variables to parameters passed to the function
// Parameters: the name of the object and its coordinates
// Returns: none
    public Book(String title, String athuor, String description, String type, boolean in) {
        this.title = title;
        this.author = athuor;
        this.description = description;
        this.type = type;
        this.in = in;
    }
    
// addid
// Purpose: To add book id
// Parameters: int i
// Returns: none
   public void addid (int i){
        id=i;
}

// Book
// Purpose: takes a single string and converts it into a book object
// Parameters: string, book
// return: none
    public Book(String book) {
       String[] b= book.split(",=");
        title = b[1];
        author =b[2];
        description = b[3];
        type = b[4];
        in = Boolean.getBoolean(b[5]);
        id= Integer.parseInt(b[6]);
        
    }

// cancheckout
// Purpose: To check if patron can checkout book
// Parameters: string patron
// Return: none
    public int cancheckout(String patron){
       //if(patron=="Adult" || patron=="Child"){
           System.out.println("Patron = "+patron);
           return dayscheckout();
           
       //}else return 0;
    }
    
// dayscheckout
// Purpose: To get length of day checkout days each patron
// Parameters: none
// Return: int, length of day

    public int dayscheckout(){
        if ("Adult".equals(type)){
            return 14;
        }else  if ("Child".equals(type)){
            return 7;
        }else  if ("DVD".equals(type)){
            return 2;
        }else {
            return 3;
        }
    }
    
    // checkout
    // Purpose: to check the book is checkout
    // Parameters: none
    // Return: none
    
    public void checkout(){
        in=false;
    }
    
    // checkin
    // Purpose: to check the book is checkin
    // Parameters: none
    // Return: none
    public void checkin(){
        in=true;
    }
    
    public String tolist() {
        return id + "   "  + title + "   " + author + "   " + 
                description + "   " + type + "   " + in ;
    }

    @Override
    public String toString() {
        return "B" + ",=" + title + ",=" + author + ",=" + 
                description + ",=" + type + ",=" + in + ",=" + id;
    }
    
    // isBook
    // Purpose: check the book if it's in database with specific id
    // Parameters: int b
    // Return: boolean
    public boolean isBook(int b){
        return b==id;
    }
   
    
}
