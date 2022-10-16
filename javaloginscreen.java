//imports

import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane

public class Customize {    

//declaring variables    

String Name;    
double Amountpaid;    
int Customernumber;    
String Dateofbirth;     
char Sex;            

//setting main method            

public static void main(String[] args) throws IOException             {                                                       
//creating array of variables

                      Customize[] Customize = new Customize[10];                                

for(int i =0; i<Customize.length; i++){                

// input screen GUI

String setName = JOptionPane.showInputDialog("Name of Customer");                 
Customize[i].Name = setName;                 JOptionPane.showMessageDialog(null,setName);                                

String setNum = JOptionPane.showInputDialog("Enter Number");                

Customize[i].Customernumber = Integer.parseInt(setNum);                

JOptionPane.showMessageDialog(null,setNum);                                
String setDateofbirth =

JOptionPane.showInputDialog("Date of birth:DD MM YYY ");                

Customize[i].Dateofbirth = setDateofbirth;                 JOptionPane.showMessageDialog(null,setDateofbirth);                               

  String setAmountPaid = JOptionPane.showInputDialog("Amoumt paid");                 Customize[i].Amountpaid = Double.parseDouble(setAmountPaid);                 JOptionPane.showMessageDialog(null,setAmountPaid);                               

  String setSex = JOptionPane.showInputDialog("M or F");                 Customize[i].Sex = setSex.charAt(0);                 JOptionPane.showMessageDialog(null,setSex);  }                                              

//outputting inputed data

for(int k=0; k<Customize.length; k++){ System.out.println("customer name" + Customize(k)) System.out.println("Enter number" + Customize(k)) System.out.println("Date of birth:DD MM YYY" + Customize(k)) System.out.println("Amount paid" + Customize(k)) System.out.println("M or F" + Customize(k))                                                                                   }

// saving inputed data as text

File file1 = new File("out.txt");             	 				for (int l=0; l<Customize.length; l++){ 				 				}             	             	file1.close();     }    
}
