package patronpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniferschofield
 */
 
 //We have a patron class with all of the atrobutes that are avaiable
public class Patron {
    String name;
    String type;
    int card;
    int numberCheckedOut;
    String phone; 
    String addressl1;
    String addressl2;
    String city;
    String state;
    String zip;

//patron includes a name,number odfbooks chaecked,adress,zip,state, and phone
    public Patron(String name, String type, int numberCheckedOut, String phone, String addressl1, 
            String addressl2, String city, String state, String zip) {
        this.name = name;
        this.type = type;
        this.numberCheckedOut = numberCheckedOut;
        this.phone = phone;
        this.addressl1 = addressl1;
        this.addressl2 = addressl2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public Patron(String person) {
        String [] p=person.split(",=");
        name = p[1];
        type = p[2];
        card=Integer.parseInt(p[3]);
        numberCheckedOut = Integer.parseInt(p[4]);
        phone = p[5];
        addressl1 = p[6];
        addressl2 = p[7];
        city = p[8];
        state = p[9];
        zip = p[10];
    }
    
    public void addcard(int c){//adding a card id
        card=c;
    }
    @Override
    public String toString() {//putting the patron into a string
        return "P" + ",=" + name + ",=" + type + ",=" + card +
                ",=" + numberCheckedOut + ",=" + phone + 
                ",=" + addressl1 + ",=" + addressl2 + ",=" + 
                city + ",=" + state + ",=" + zip;
    }
    public String cancheckout(){//check to see how many books can be checked out
        if (numberCheckedOut<items()){
            return type;
        }else {
            return "";
        }
    }
    public void checkout(){//increments how many book are checked out
        numberCheckedOut++;
    }
    public void checkIn(){//decrements how many book are checked out
        numberCheckedOut--;
    }

    
    public int items (){//total items that can be checked out
        if (type=="Child"){
            return 3;
        }else return 6;
    }
    public boolean ispatron (int c){//is the person with card #c this patron
        return c==card;
    }
}
