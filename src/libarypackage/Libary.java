package libarypackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import patronpackage.Patron;
import check.Check;
import book.Book;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jenniferschofield
 */
public class Libary {
    BufferedWriter bw = null;
    ArrayList <Book> books;
    ArrayList <Patron> patrons;
    ArrayList <Check> checkeds;
    int lastbook;
    int lastpatron;
    LocalDate currentdate;
    File lib;
    public Libary() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
        checkeds=new ArrayList<>();
        lastbook=0;
        lastpatron=0;
        currentdate= LocalDate.of (2015,1,1);
        
        
    }
    public void addbook(Book b){
        b.addid(lastbook++);
        allbooks();
        books.add(b);
       /* try {
            save();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Libary.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    public void addPatron(Patron p){
        p.addcard(lastpatron++);
        patrons.add(p);
    }
    public int checkout(int card, int item){//can the patron checkout
        for(Patron p : patrons){
            if (p.ispatron(card)){
                for (Book b: books){
                    if (b.isBook(item)){
                        int days=b.cancheckout(p.cancheckout());
                        if (days>0){
                            b.checkout();
                            p.checkout();
                            checkeds.add(new Check (card, item, days,currentdate));//checks how many days and adds to array
                            System.out.println(card +" :card "+item+ " :Item  now checked out");
                            return 1;
                        }
                        return 0;
                  }
                }
            }     
        }
        return 0;
    }
    public boolean checkin (int item){//can the patron check in the book
        for (Check c: checkeds){
            if (c.ischeckedout(item)){
                int card=c.getpatroncard();
                for (Book b : books){
                    if (b.isBook(item)){
                        for (Patron p: patrons){
                            if (p.ispatron(card)){
                                p.checkIn();
                                b.checkin();
                                checkeds.remove(c);
                                return true;
                            }
                        }
                    }
                    
                }
                
            }
        }
        return false;
    }
    public boolean removebook (int item){
        for (Book b: books){
            if (b.isBook(item)){
                books.remove(b);
                return true;
            }
        }
        return false;
    }
    public boolean removepatron(int card){
        for (Patron p: patrons){
            if (p.ispatron(card)){
                patrons.remove(p);
                return true;
            }
        }
        return false;
        
    }
    
 
    public void open (File f) throws FileNotFoundException, IOException{
        lib=f;
        String line;
        System.out.println("open called");
        try {
            System.out.println("trying...");
                    java.io.BufferedReader ip;
                    ip = new java.io.BufferedReader(new java.io.FileReader(lib));
                   lastbook =ip.read();
                   lastpatron=ip.read();
                    //line =ip.readLine();
                   
                    
                    while ((line=ip.readLine()) != null){
                        System.out.println("Line: "+line);
                        switch (line.charAt(0)){
                            case 'B':
                                books.add(new Book(line));
                                System.out.println("case B added");
                                break;
                            case 'P':
                                patrons.add(new Patron(line));
                                System.out.println("case P added");
                                break;
                            case 'C':
                                checkeds.add(new Check (line));
                                System.out.println("case C added");
                                break;
                        } 
                        
                    }
                    System.out.println("Line now = null");
         } catch (FileNotFoundException ex) {
            Logger.getLogger("global").log(Level.SEVERE, null, ex);
        }
    }
    public void saveas(File f) throws FileNotFoundException{
        lib=f;
        save ();
    }
    //*********************************************************************************************
    public void save() throws FileNotFoundException{
      
              //t = filename and s= string being written- may need to make this the corresponding array that is passed in then printed into the file
      BufferedWriter bw = null;
      try {
	 
         String t="LibrarySaveFile";
         //Specify the file name and path here
	 File file = new File(t+".txt");

	 /* This logic will make sure that the file 
	  * gets created if it is not present at the
	  * specified location
	  if (!file.exists()) {
	     file.createNewFile();
	  }*/

	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
          
	 
          System.out.println("File written Successfully");
             for (Patron p: patrons){
                 bw.write(p.toString());
                 bw.newLine();
                //outputstream.write(p.toString());
                //outputstream.newLine();
                System.out.println("patron saved: "+ p.toString());
            }
             
            for (Book b : books){
                bw.write(b.toString());
                bw.newLine();
                //outputstream.write(b.toString());
                //outputstream.newLine();
                System.out.println("book saved: "+ b.toString());
            }
           
            for (Check c : checkeds){
                bw.write(c.toString());
                bw.newLine();
                //outputstream.write(c.toString());
                //outputstream.newLine();
                System.out.println("checkeds saved: "+ c.toString());
            }
//********************************************************************************************************                
        } catch (FileNotFoundException ex) {
            Logger.getLogger("global").log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Libary.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
    }
    public void updateDate( LocalDate d){
        currentdate=d;
    }
    public String allbooks(){
        String list="";
        for(Book b : books){
            list=list+b.tolist()+'\n';
        }
        return list;
    }
    public String allpatron(){
        String list="";
        for(Patron b : patrons){
            list=list+b.toString()+'\n';
        }
        return list;
    }
    public String allcheckout(){
        String list="";
        for(Check b : checkeds){
            list=list+b.toSList()+'\n';
        }
        return list;
    }
    public String patronbooks(int card){
        String list="";
        for (Check c: checkeds){
            if (c.ispatron(card)){
                int bid=c.getbookid();
                for (Book b: books){
                    if (b.isBook(bid)){            
                       list=list+b.tolist()+'\n';
                    }
                }
            }
        }
        return list;
    }
        public String overduebooks(){
        String list="";
        for (Check c: checkeds){
            if (c.overdue(currentdate)){
                int bid=c.getbookid();
                for (Book b: books){
                    if (b.isBook(bid)){            
                       list=list+b.tolist()+'\n';
                    }
                }
            }
        }
        return list;
    }
    
}
