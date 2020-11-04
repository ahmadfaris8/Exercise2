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
public class cgpa {
    double cgpa;
    double gpa[] = new double[6];
    double sum;
    double finalCgpa;
    
    cgpa(){
        this.cgpa = 3.58;
        this.gpa = new double[] {3.68, 3.60, 3.59, 3.55, 3.50};    
    }
    
    cgpa(double BioCGPA, double BioGPA[]){
        this.cgpa = BioCGPA;
        this.gpa = BioGPA;
    }
    public void printcgpaNew(){
        System.out.println("\nCGPA : " + this.cgpa);
    }
    public void printgpaNew(){
        for(int i = 0; i<gpa.length; i++){
            System.out.println("Sem " + (i+1) + ":" + gpa[i]);
        }
    }
    public double calculateCGPA(){
        for(int i=0; i<gpa.length; i++){
            sum+=gpa[i];
        }
        finalCgpa = sum/gpa.length;
        return finalCgpa;
    }
    
}
