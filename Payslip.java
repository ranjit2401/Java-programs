salary.java
 import java.util.*;
 public class Employee
 {
     int empid;
     long mobile;
     String name,address, mailid;
     Scanner get = new Scanner(System.in);
     void getdata()
     {
         System.out.println("Enter name of the employee");
         name = get.nextLine();
         System.out.println("Enter mail id");
         mailid = get.nextLine();
         System.out.println("Enter address of the emmployee");
         address = get.nextLine();
         System.out.println("Enter employee id");
         empid = get.nextInt();
         System.out.print("Enter mobile number");
         mobile = get.nextLong();
         
     }
     void display()
     {
         System.out.println("Employee Name : "+ name);
         System.out.println("Employee id : "+ empid);
         System.out.println("Mail id :"+ mailid);
         System.out.println("Address : "+ address);
         System.out.println("Mobile Number : "+ mobile);
         
     }
 }
 class Progammer extends Employee
 {
     double salary,bp,da,hra,pf,club,net,gross;
     void getprogrammer()
     {
         System.out.println("Enter basic pay");
         bp = get.nextDoublt();
     }
     void calculateprog()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("***********************");
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("***********************");
        System.out.println("Basic pay : Rs."+bp);
        System.out.println("DA : Rs."+ da);
        System.out.println("HRA : Rs."+ hra);
        System.out.println("PF : Rs."+ pf);
        System.out.println("CLUB: Rs."+ club);
        System.out.println("GROSS PAY: Rs."+ gross);
        System.out.println("NET PAY: Rs."+ net);
    }
 }
 class Asstprofessor extends Employee
 {
     double salary,bpm,da,hra,pf,club,net,gross;
     void getasst()
     {
         System.out.println("Enter Basic pay");
         bp=get.nextDouble();
     }
     void calculateasst()
     {
         da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("********************************");
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("********************************");
        System.out.println("Basic pay : Rs."+bp);
        System.out.println("DA : Rs."+ da);
        System.out.println("HRA : Rs."+ hra);
        System.out.println("PF : Rs."+ pf);
        System.out.println("CLUB: Rs."+ club);
        System.out.println("GROSS PAY: Rs."+ gross);
        System.out.println("NET PAY: Rs."+ net);
         
     }
 }
class Associateprofessor extends Employee
 {
     double salary,bp,da,hra,pf,club,net,gross;
     void getassociate()
     {
         System.out.println("Enter Basic Pay");
         bp = get.nextDouble();
     }
     void calculateassociate()
     {
         da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("********************************");
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("********************************");
        System.out.println("Basic pay : Rs."+bp);
        System.out.println("DA : Rs."+ da);
        System.out.println("HRA : Rs."+ hra);
        System.out.println("PF : Rs."+ pf);
        System.out.println("CLUB: Rs."+ club);
        System.out.println("GROSS PAY: Rs."+ gross);
        System.out.println("NET PAY: Rs."+ net);
     }
 }
 class Professor extends Employee
 {
     double saalary,bp,da,hra,pf,club,net,gross;
     {
         System.out.println("Enter basic pay");
         bp = get.nextDouble();
     }
     void calculateprofessor()
     {
         da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("**********************");
        System.out.println("PAY SLIP FOR PROFRSSOR");
        System.out.println("**********************");
        System.out.println("Basic pay : Rs."+bp);
        System.out.println("DA : Rs."+ da);
        System.out.println("HRA : Rs."+ hra);
        System.out.println("PF : Rs."+ pf);
        System.out.println("CLUB: Rs."+ club);
        System.out.println("GROSS PAY: Rs."+ gross);
        System.out.println("NET PAY: Rs."+ net);
     }
 }
 class Salary
 {
     public static void main(String args[])
     {
         int choice, cont;
         do
         {
             System.out.println("PAYROLL");
             System.out.println("1.PROGRAMMER\t 2.ASSISTANT PROFESSOR\t. 3.ASSOCIATE PROFESSOR\t4.PROFESSOR");
             Scanner c = new Scanner(System.in);
             choice = c.nextInt();
             switch(choice)
             {
                 case 1:
                 {
                     Programmer p = new Programmer();
                     p.getdata();
                     p.getprogrammer();
                     p.display();
                     p.calculateprog();
                     break;
                 }
                 case 2:
                 {
                     Asstprofessor asst = new Asstprofessor();
                     asst.getdata();
                     asst.gerasst();
                     asst.display();
                     asst.calculateasst();
                     break;
                 }
                 case 3:
                 {
                     Assosciateprofessor asso = new Associateprofessor();
                     asso.getdata();
                     asso.gerasst();
                     asso.display();
                     asso.calculateassociate();
                     break;
                 }     
                 case 4:
                 {
                     Professor prof = new Professor();
                     prof.getdata();
                     prof.gerasst();
                     prof.display();
                     prof.calculateasst();
                     break;
                 }
                 
                     
            }
         }       System.out.print("Please enter 0 to quit and 1 to continue : ");
                 cont=c.nextInt();
                 
        }while(cont==1);
 
    }     
 }  
