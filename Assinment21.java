
package assinment2.pkg1;
import java.util.*;
class BusinessLogic
{
    int[] ar=new int[10];
    int[] prime=new int[100];
    int[] MonthIndex={31,28,31,30,31,30,31,31,30,31,30,31};
    String[] MonthName={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    Scanner sc = new Scanner(System.in);
    
    public void PrintMonthDay()
    {
     System.out.print("Please Enter Month Name: "); 
     String  mnth= sc.nextLine();
     for(int i=0;i<MonthName.length;i++)
     {
       if(MonthName[i].equals(mnth))
       {
           System.out.println("No of Days in Enterd Month is "+MonthIndex[i]);
       }
     }
    }
    public void PrintNoOfDays()
    {
     System.out.print("Please Enter valid Date((MM-DD-YY): "); 
     String  mnth= sc.nextLine();
     int sum=0;
     //12-04-17 then result will be 31+28+31+30
     if(mnth.contains("-")==false)
     {
     PrintNoOfDays();
     }
     else
     {
     String[] dateArray=mnth.split("-");
     int day=Integer.parseInt(dateArray[0]);
     int mm=Integer.parseInt(dateArray[1]);
     System.out.println("=====================================");
     if(mm>12)
     {
      PrintNoOfDays();
     }
     else
     {
         sum=day;
     for(int i=0;i<mm-1;i++)
     {           
           sum=sum+MonthIndex[i];
           //System.out.println("month value is "+MonthIndex[i]);
     }
           System.out.println("No of Days From January 1 to "+mnth+" is "+sum);
    }
     }
    }
    
    
    public void InitializeMe()
    {
     for(int i=0;i<ar.length;i++)   
     {
       ar[i]=i;
     }
    }
    public void PrintMe()
    {
     System.out.print("Even Number are:0");    
     for(int i=1;i<ar.length;i++)   
     {
       if(ar[i]%2==0)  
       System.out.print(","+ar[i]);
     }
    }
    
    public void PrintPrime()
    {
     int counter=0;
     for(int i=1;i<100;i++)   
     {
       int result=chkprime(i);
       if(result==1 && counter<11)
       {   counter++;
           prime[counter]=i;
       }
     }
     for(int i=10;i>0;i--)   
     {
      System.out.print("\t"+prime[i]);
     }
    }
    
  public int chkprime(int n)
  {  
  int i,m=0,flag=1;  
  m=n/2;    
  for(i=2;i<=m;i++)
  {    
   if(n%i==0)
   {    
   flag=0;    
   break;     
   }    
  }    
   return flag;
  }  
}

public class Assinment21 
{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter 1 for to check Even Number  2 for Prime 3 for Month days and 4 for Month Day Year Combination: "); 
        int i = sc.nextInt();
        BusinessLogic bl=new BusinessLogic();
        if(i==1)
        {
        bl.InitializeMe();
        bl.PrintMe();
        System.out.println();
        }
        if(i==2)
        {
        bl.PrintPrime();
        System.out.println();
        }
        if(i==3)
        {
        bl.PrintMonthDay();
        System.out.println();
        }
        if(i==4)
        {
        bl.PrintNoOfDays();
        System.out.println();
        }
              
    }
       
    
}
