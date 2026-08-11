import java.util.Scanner;

public class Thas {
    public static void main(String[] args) {
        
        //define o primeiro numero da conta
        
        Scanner sinum = new Scanner(System.in);
        System.out.print ("defina seu primeiro número");
        int inum = sinum.nextInt();

        //define o operador da conta
        Scanner sope = new Scanner(System.in);
        System.out.print("defina seu operador da conta");
        System.out.print("Use os sinais + - * /");
        String ope = sope.nextLine();

        //define o segundo numero da conta
        Scanner sdnum = new Scanner(System.in);
        System.out.print ("defina seu segundo número");
        int dnum = sdnum.nextInt();

        //define operações disponiveis
        int plus = inum + dnum;
        int minus = inum - dnum;
        int times = inum * dnum;
        int div = inum / dnum;

        switch (ope) {
            case "+":
                System.out.print("seu resultado é " + plus);
                break;

            case "-":
                System.out.print("seu resultado é " + minus);
                break;
            
            case "*":
                System.out.print("seu resultado é " + times);
                break;

            case "/":
                System.out.print("seu resultado é " + div);
                break;
            }
        }
    }
