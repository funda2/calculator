
import java.util.*;

public class calculator {
    public static void main(String[] args) {

        //Interfaz
        System.out.println("\n-Calculadora 1.3-");
        System.out.println("(Formato [Num] [Oper] [Num] || Ej: 2 + 2)");
        System.out.print("Intorduce la operacion: ");
        
        //Entrada de usuario
        Scanner scanner_input = new Scanner(System.in);
        int user_inputno1 = scanner_input.nextInt();
        String user_inputst = scanner_input.next();
        int user_inputno2 = scanner_input.nextInt();
        
        //Transforma la palabra(String) user_inputst, en el caracter(char) user_inputch
        char user_inputch = user_inputst.charAt(0);
        
        //Calculadora
        int result = 0;
        if(user_inputch == '+') {
            result = user_inputno1 + user_inputno2;
        } else if(user_inputch == '-') {
            result = user_inputno1 - user_inputno2;
        } else if(user_inputch == '*') {
            result = user_inputno1 * user_inputno2;
        } else if(user_inputch == '/') {
            result = user_inputno1 / user_inputno2;
        } else {
            System.out.println("ERROR");
        }
        
        
        //Interfaz final
        System.out.println("Resultado: " + user_inputno1 + " " + user_inputch + " " + user_inputno2 + " = " + result);
    }
}