package check;


import java.time.LocalDate;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import  java.util.concurrent.TimeUnit;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniferschofield
 */
public class Check {
    int cardholder;
    int bookid;
    LocalDate duedate;

    public Check(int cardholder, int bookid,int days, LocalDate duedate) {
        this.cardholder = cardholder;
        this.bookid = bookid;
        this.duedate = duedate.plusDays(days);
    }
    public Check (String s){
        String [] ch= s.split(",=");
        cardholder =Integer.parseInt(ch[1]);
        bookid = Integer.parseInt(ch[2]);
        duedate= LocalDate.of(Integer.parseInt(ch[3]),Integer.parseInt(ch[4]),Integer.parseInt(ch[5]));
        
    }
 public String toSList() {
        return  cardholder + "   " + bookid + 
                "   " + duedate.getYear()+"   "+duedate.getMonth()+"   " +duedate.getDayOfMonth();
    }
    @Override
    public String toString() {
        return "C" + ",=" + cardholder + ",=" + bookid + 
                ",=" + duedate.getYear()+",="+duedate.getMonthValue()+",=" +duedate.getDayOfMonth();
    }
    public boolean ischeckedout(int item){
        return item==bookid;
    }
    public int getpatroncard (){
        return cardholder;
    }
    public boolean ispatron(int c){
        return c==cardholder;
    }
    public int getbookid (){
        return bookid;
    }
       public boolean overdue(LocalDate now){
        return now.isAfter(duedate);
        
    }
    
}
