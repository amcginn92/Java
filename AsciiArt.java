/*
Alex McGinn
CIS1068-006
1/24/2022

This program will create some ASCII art using for loops/nested for loops.
ANY numeric constants in the program will be replaced with CLASS CONSTANTS*
The program will use AT LEAST 3 nested loops
AT LEAST one of the nested loops must be doubly-nested
One of the class constant will be named SIZE, and when it is changed
the entire picture will increase proportionally
(you may include a domain for the size constant)
all comments regarding size refer to the original size of 4
This was the hardest 10 points i've ever earned in my life! 
*/
public class AsciiArt {
    public static final int SIZE =  12;
    public static void main(String[] args){
        topLot();
        midLot();
        theLincTop();
        theLincBot();
    }
    //==============================================Top of lot method
    public static void topLot(){
        for(int i = 1; i <= SIZE * 2 + 2; i++){     //spaces before top line of lot
            System.out.print(" ");
        }
        for(int i = 1; i <= 4 * SIZE + 1; i++){     //top line of lot
            System.out.print("_");
        }
        System.out.println();
        
    }
    //============================================Middle of Lot Method
    public static void midLot(){
        for(int line = 1; line <= SIZE * 3 + SIZE; line++){
            for(int i = 1; i <= SIZE * 2 + 1; i++){         //spaces before lot
            System.out.print(" ");
            }
            System.out.print("|");
            for(int i = 1; i <= SIZE * 2; i++){
                System.out.print("_");                  //underscores that make lot
            }
            System.out.print("|");
            for(int i = 1; i <= SIZE * 2; i++){         //reiterate first half of lot... probably some redundancy but I've spent way too much time 
                System.out.print("_");                  //just making it work lol sorry!
            }
            System.out.print("|");
            System.out.println();
            

        }
            System.out.println();
    }
    //===========================================The Linc Method
    public static void theLincTop(){
        System.out.print(" ");
        for(int i = 1; i <= SIZE * 8 + 2; i++){
                System.out.print("_");       // Top line 
        }
        System.out.print("\n|");
        for(int i = 1; i <= SIZE * 4; i++){  //no pattern to the top/second line
            System.out.print(" ");
        }
        System.out.print("__");             //part of second line

        for(int i = 1; i <= SIZE * 4; i++){  //part of second line
            System.out.print(" ");
        }
        System.out.println("|");

        for(int line = 1; line <= SIZE * 2; line++){         //Start of pattern loop lines 3-10 (1-8)
            System.out.print("|");
            for(int i = 1; i <= -2 * line + SIZE * 4; i++){           //Spaces before 
                System.out.print(" ");
            }
            System.out.print("_/");
            for(int i = 1; i <= 4 * line -2 && line <= SIZE; i++){      //*Top dots
                System.out.print(".");
            }
            for(int i = 1; i <= 2 * line - (SIZE + 1) && line > SIZE && line < SIZE * 3 + 1; i++){        //dots before stars
                System.out.print(".");
            }
            for(int j =  1; j <= SIZE * 2 && line > SIZE && line < SIZE * 3 + 1; j++){          //stars
                System.out.print("*");
            }
            for(int i = 1; i <= 2 * line - (SIZE+1) && line > SIZE && line < SIZE * 3 + 1; i++){     //dots afters stars
                System.out.print(".");
            }
            System.out.print("\\_");
            for(int i = 1; i <= -2 * line + SIZE * 4; i++){            //spaces after
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }


    }

    //===========================================The Linc Bottom method
    public static void theLincBot(){
       
        for(int line = 1; line < SIZE * 2; line++){             //line for loop
            System.out.print("|");
            for(int i = 1; i <= 2 * line - 1; i++){
                System.out.print(" ");                      //spaces before
            }
            System.out.print("\\_");    //i <= 2 * line -5 && line > SIZE && line < SIZE * 3 + 1
            for(int i = 1; i <= -2 * line + SIZE * 3  && line < SIZE; i++){         //dots before stars (line + SIZE * 3 (+ 2)) does not scale
                System.out.print(".");
                for(int j = 1; line <= SIZE && j <= SIZE * 2 && i >= -2 * line + SIZE * 3 ; j++){           //stars DOUBLY NESTED LOOP****
                    System.out.print("*");                                                                  //DOUBLY NESTED LOOP
                }
            }
            for(int i = 1; i <= -2 * line + SIZE * 3  && line < SIZE; i++){         //dots after stars 
                System.out.print(".");
            }
            for(int i = 1; i <= -4 * line + SIZE * 8 && line >= SIZE; i++){         //dots without stars
                System.out.print(".");
            }
            System.out.print("_/");
            for(int i = 1; i <= 2 * line - 1; i++){
                System.out.print(" ");                      //spaces before
            }
            System.out.print("|"); 
            System.out.println();
            


        }  
        System.out.print("|");
        for(int i = 1; i <= SIZE * 4 - 1; i++){  //no pattern to the top/second line
            System.out.print(" ");
        }
        System.out.print("\\__/");
        for(int i = 1; i <= SIZE * 4 - 1; i++){  //no pattern to the top/second line
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.print("|");
        for(int i = 1; i <= SIZE * 8 + 2; i++){
                System.out.print("_");       // Top line 
        }
        System.out.print("|");
    }
    
}
