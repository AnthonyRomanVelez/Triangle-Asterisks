
public class Triangle {
    public static void main(String args[]){
        //Shape (a)
        for(int i = 0; i < 11; i++){//rows
            for(int j = 0; j < i; j++){//columns
                System.out.print('*');//Print the * in straight line
            }
            System.out.println();//This helps to go to next line and shape the triangle
        }
        System.out.println();//Space between the different triangles printed out
        //Shape (b)
         for(int i = 11; i > 0; i--){//rows
            for(int j = 0; j < i; j++){//columns
                System.out.print('*');//Print the * in straight line
            }
            System.out.println();//This helps to go to next line and shape the triangle
        }
        System.out.println();//Space between the different triangles printed out
         //Shape (c)
         for(int i = 11; i > 0; i--){//rows of ' ' 
            for(int j = 11; j > i; j--){//colums of ' '
                System.out.print(' ');//print the ' '  in straight line
            }
            
            for(int k = 0; k < i; k++ ){//row of '*'
                System.out.print('*');//print the '*' symbol 
            }
            System.out.println();//go to next line to shape the triangle 
        }
         System.out.println();//Space between the different triangles printed out
         //Shape (d)
         for(int i = 0; i < 11; i++){//rows of ' ' 
            for(int j = 0; j < 11 - i; j++){//colums of ' '
                System.out.print(' ');//print the ' '  in straight line
            }
            
            for(int k = 0; k < i; k++ ){//row of '*'
                System.out.print('*');//print the '*' symbol 
            }
            System.out.println();//go to next line to shape the triangle
    }
}
}
