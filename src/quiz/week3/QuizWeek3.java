/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.week3;

/**
 *
 * @author Daniel
 */
public class QuizWeek3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    double x = 2.5;
    double y = -1.5;
    int m = 18;
    int n = 2;
    System.out.println( x + n * y - ( x % n ) * n - 1 );
    
    double x2 = 2.5;
    double y2 = -1.5;
    int m2 = 18;
    int n2 = 2;
    System.out.println( m2 % n2 + m2 / n2 );
    
    double x3 = 2.5;
    double y3 = -1.5;
    int m3 = 18;
    int n3 = 2;
    System.out.println( m3 / n3 - m3 % n3 );
    
    double x4 = 2.5;
double y4 = -1.5;
int m4 = 18;
int n4 = 2;
System.out.println( 4 * x4 - n4 / 5);

double x5 = 2.5;
double y5 = -1.5;
int m5 = 18;
int n5 = 2;
System.out.println( 1 - ( 1 - ( 1 - ( 1 - ( 1 - ( 1 - n5))))) );

int m6 = 18;
int n6 = 17;
System.out.println( n / 10 + n % 10);

int m7 = 18;
int n7 = 17;
System.out.println( m7 % 2 + n7 % 2);

int m8 = 18;
int n8 = 17;
System.out.println( ( n8 + m8) / 2 );

int m9 = 18;
int n9 = 17;
System.out.println( (int) ( 0.5 * ( m9 + n9) ));

String s = "Hello";
String t = "World";
System.out.println( s.length() + t.length());
// (lengths of 0)

System.out.println( s.substring(1,2));
// (includes only start and in between 1 and 2.) 

//System.out.println( s.substring(s.length(),s.length()/2));
// outputs build failed

System.out.println( s + t);

System.out.println("2");
        
    }
}
