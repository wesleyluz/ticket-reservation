/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketreservation;

/**
 *
 * @author thiag
 */
public class GenericClass {

    Row[] rows;
    int p;
    
    GenericClass(int n, int p){
        this.p = p;
        rows = new Row[n];
        for(int i = 0; i < n; i++){
            rows[i] = new Row(6, p+i+1);
        }
    }
    
    public double precoDaPassagem(){
        double preco = 0;
        return preco; 
    }
    
    void print(){
        for (int i = 0; i < rows.length; i++) {
                System.out.printf("%-2d: ", rows[i].numberRow);
            rows[i].print();
        }
    }

}
