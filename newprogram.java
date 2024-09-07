import java.util.Scanner;
import java.util.*;

public class newprogram {
    public static void inrtousd(double a){
        double sol = a*0.012;
        System.out.println(sol);
    }
    public static void usdtoinr(double a){
        double sol = a*80;
        System.out.println(sol);
    }
    public static void yentousd(double a){
        double sol = a*0.009;
        System.out.println(sol);
    }
    public static void usdtoyen(double a){
        double sol = a*110;
        System.out.println(sol);
    }
    public static void inrtoyen(double a){
        double sol = a*0.013;
        System.out.println(sol);
    }
    public static void yentoinr(double a){
        double sol = a*100;
        System.out.println(sol);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Welcome to the currency converter");
        char cont = 'y';
        do{
            System.out.println("which currency would to like to convert");
            System.out.println("enter 1 for inr to usd");
            System.out.println("enter 2 for usd to inr");
            System.out.println("enter 3 for yen to usd");
            System.out.println("enter 4 for usd to yen");
            System.out.println("enter 5 for inr to yen");
            System.out.println("enter 6 for yen to inr");
            int opt = ip.nextInt();
            switch(opt){
                case 1:
                    System.out.println("enter the amount");
                    double a = ip.nextInt();
                    inrtousd(a);
                    break;
                case 2:
                    System.out.println("enter the amount");
                    double b = ip.nextInt();
                    usdtoinr(b);
                    break;
                case 3:
                    System.out.println("enter the amount");
                    double c = ip.nextInt();
                    yentousd(c);
                    break;
                case 4:
                    System.out.println("enter the amount");
                    double d = ip.nextInt();
                    usdtoyen(d);
                    break;
                case 5:
                    System.out.println("enter the amount");
                    double e = ip.nextInt();
                    inrtoyen(e);
                    break;
                case 6:
                    System.out.println("enter the amount");
                    double f = ip.nextInt();
                    yentoinr(f);
                    break;
                default:
                    System.out.println("Please enter a correct value");
            }
            System.out.println("Continue? (y/n)"); 
            cont = ip.next().toLowerCase().charAt(0); 
            ip.nextLine();
        }while(cont == 'y');
            System.out.println("Exiting Program");
        ip.close();
        
    }
    
}
