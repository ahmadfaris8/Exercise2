/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2resume;

/**
 *
 * @author user
 */
public class biodata {
    String name, birth, maritialStat, address, tel;
    int age;
    
    biodata(){
        this.name = "Ahmad Faris Azam Bin Azahar";
        this.birth = "13 December 1998";
        this.age = 22;
    }
    
    biodata(String m, String a, String t){
        this.maritialStat = m;
        this.address = a;
        this.tel = t;
    }
    
}
