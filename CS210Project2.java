/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs210project2;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
 import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class CS210Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
           
           
        
        Scheduler  schedule=new Scheduler();
     Job j;
        String fileName = "Job.txt";
        File file = new File(fileName);
 
      Scanner scanner;
        try{
             scanner = new Scanner(file);
             System.out.println("File is read");
        }
        
                catch(FileNotFoundException e){
            System.out.println("File Not Found!");
            //System.exit(status);\
            return;
        }

        
        
        
              while (scanner.hasNextLine()){
            String line = scanner.next();
            String [] splittedString = line.split("/");
            int id=Integer.parseInt(splittedString[0]);
            int p=Integer.parseInt(splittedString[1]);
            int l=Integer.parseInt(splittedString[2]);
          
          j=new Job(id,p,l);
              schedule.insert(j);
     }  
                scanner.close();
     String outputFile="CS210-Output.txt";
            PrintWriter writeToFile=null;
            try
            {
                writeToFile=new PrintWriter(outputFile);
                System.out.println("File is written to");
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found");
            }
             //System time
          //for(int i=0; i<)
            //Assigning Jobs to CPU
             int sTime = 0;
            for(int i=schedule.size(); i>0; i--)
            {
                Job job=schedule.removeMin();
               
                int pid1=job.getPid();
                int p1=job.getPriority();
                int len=job.getLength();
                int KILLST=sTime+len; 

                job.execute();
                   System.out.println("----------------------------------------------------------------------------------------------");
              System.out.println("|PID         |Priority        | Event               |System time               |              |");
              System.out.println("|------------|----------------|---------------------|--------------------------|--------------|");
              System.out.println("|"+pid1+"         |   "+p1+"             |Assign Job tp CPU  |   "+sTime+"                    |Length:"+len+    "|");
              System.out.println("|            |                |                     |                          |              |");
              System.out.println("|            |                |---------------------------------------------------------------|");
              System.out.println("|            |                |Kill Job             |                          |Total System  |");
              System.out.println("|            |                |                     |                          |in time:      |");
              System.out.println("|            |                |                     |   "+KILLST+"                       | "+(len)+"          |");
              System.out.println("-----------------------------------------------------------------------------------------------");

                    writeToFile.println("----------------------------------------------------------------------------------------------");
            writeToFile.println("|PID         |Priority        | Event               |System time               |              |");
            writeToFile.println("|------------|----------------|---------------------|--------------------------|--------------|");
             writeToFile.println("|"+pid1+"         |   "+p1+"             |Assign Job tp CPU  |   "+sTime+"                    |Length:"+len+"   |");
              writeToFile.println("|            |                |                     |                          |              |");
             writeToFile.println("|            |                |---------------------------------------------------------------|");
              writeToFile.println("|            |                |Kill Job             |                          |Total System  |");
              writeToFile.println("|            |                |                     |                          |in time:      |");
              writeToFile.println("|            |                |                     |  "+KILLST+"               | "+(len)+"         |");
             writeToFile.println("-----------------------------------------------------------------------------------------------");

              sTime=sTime+len;
            }
            writeToFile.close();
        
    
        schedule.toString1();
              System.out.println("finished reading from heap");
     
    
    
    }    
        
  
                
                
                
                
                
                
         
        
              
    
      
              
   
        
        
     /**    String fileName = "/Users/user/NetBeansProjects/CS210Project2/src/cs210project2/Job.txt";
        File file = new File(fileName);
  
      Scanner scanner=null;
        try{
             scanner = new Scanner(file);
        }
	catch(FileNotFoundException e){
            System.out.println("File Not Found!");
            //System.exit(status);\
            return;
        }
        
        ArrayList<String> integers = new ArrayList<String>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] splittedString = line.split("/");
            
             int id=Integer.parseInt(splittedString[0]);
            System.out.print("id:"+id+"  ");  
             int priority=Integer.parseInt(splittedString[1]);
              System.out.print("priority:"+priority+"  ");  
             int length=Integer.parseInt(splittedString[2]);
              System.out.print("length:"+length+"  ");  


                        System.out.println("\n");

        
        // TODO code application logic here
    } 
            System.out.println("\n");
            
          */  
}    

