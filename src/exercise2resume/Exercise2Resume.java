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
public class Exercise2Resume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resume by Ahmad Faris Azam\n ");
        cgpa c = new cgpa();
        workExperience e = new  workExperience();
        workSkills s = new workSkills();
        
        biodata obja = new biodata();
        System.out.println("Name : " + obja.name);
        System.out.println("Birthday : " + obja.birth);
        System.out.println("Age : " + obja.age);
        biodata objb = new biodata("Single", "Perak Malaysia", "017");
        System.out.println("Maritial Status : " + objb.maritialStat);
        System.out.println("Address : " + objb.address);
        System.out.println("Telephone : " + objb.tel);
        
        c.printcgpaNew();
        c.printgpaNew();
        System.out.println("Final CGPA : " + c.calculateCGPA());
        
        result objc = new result ('B');
        System.out.println("Exam Result STIA1113 : Grade " + objc.STIA1113);
        
        e.printworkexperience();
        
        s.printskills();
        
    }
    
}
