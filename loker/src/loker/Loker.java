/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loker;
import java.util.Scanner;  // Import the Scanner class
import static jdk.nashorn.tools.ShellFunctions.input;
import static loker.Loker.helper;
/**
 *
 * @author Ulvia Yulianti
 */
public class Loker {
  
    public static void cariLoker(int nomorLoker){

        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan Nomor Loker Anda: ");
        nomorLoker = input.nextInt();
        
        int cariLantai = nomorLoker/18;
        int angkaLantai = nomorLoker%18;
        int findFloor = (cariLantai*3)+helper(angkaLantai); 
        
        System.out.print("Loker Anda berada pada lantai: " + findFloor);
        System.out.println("");
             
    }
    
    public static int helper(int nomorLoker){
        if(nomorLoker >=1 && nomorLoker <=5){
            return 1;
        }else if(nomorLoker >=6 && nomorLoker <=11){
            return 2;
        }else if(nomorLoker >=12 && nomorLoker <=18){
            return 3;
        }
        return nomorLoker;
    }
  public static void main(String[] args) {
        // TODO code application logic here
    Loker.cariLoker(0);
      }
    }
   
    
   
