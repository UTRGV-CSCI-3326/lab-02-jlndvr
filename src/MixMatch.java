/*
Remember the rules for variable identifiers:

Don't start with numbers.
Don't include spaces.
Don't include special characters, except _.
Don't use reserved keywords like class, return, or void.
Don't start with a capital letter, those are reserved for class identifiers.
*/
public class MixMatch {


    public static void main (String args[]) {

    String a="Hello!";
    System.out.println ( a + " <- You can use the data type String to store the characters of your name! -> " );
    char b='A';
    System.out.println ( b + " <- You must use single quotes when using char. -> " );
    short c=1;
    System.out.println ( c + " <- Data type short can store values from -32,768 to 32,767. -> " );
    int d=2;
    System.out.println ( d + " <- Data type int can store values from -2,147,483,648 to 2,147,483,647. -> " );
    long e=64;
    System.out.println ( e + " <- Data type long can store values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. -> " );
    float f=4.0f;
    System.out.println ( f + " <- When using data type float you must append an f or F to the end of the number. -> " );
    double g=6.4;
    System.out.println ( g + " <- The data type double can be used for more precision. -> " );
    boolean h=true;
    System.out.println ( h + " <- The data type boolean is great for T/F questions. -> " );

// Outputting multiple variables with a single print method

    System.out.println ( c + d );
    //Idk why this does not work with c which is data type short
    System.out.println ( "Values: " + d + " " + e + " " + f + " " + g );

    }


}