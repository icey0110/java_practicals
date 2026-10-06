/*
name : Reuel Bodhak
PRN NO : 32658010086
DIV : C
*/

public class Main {
    public static void main(String args[]){
        System.out.println("Output 1 : ");
        for(int i=0;i<5;i++){
            for(int k=i;k<5;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Output 2 : ");
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=i;k<5;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}