package fila;
import java.util.*;
public class principal {
    public static void main(String[]args){
        fila fila = new fila();
        Scanner l = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("Escolha uma opção!");
            System.out.println("1-Adicionar");
            System.out.println("2-Remover");
            System.out.println("3-Mostrar");
            System.out.println("4-Sair");
            op = l.nextInt();
            switch(op){
                case 1:
                    System.out.print("Digite o elemento: ");
                    fila.adicionar(l.nextInt());
                    break;
                case 2:
                    fila.remover();
                    fila.mostrar();
                    break;
                case 3:
                    fila.mostrar();
                    break;
            }
        }while(op != 4);{
                System.out.println("Lista fechada!");
                System.exit(0);
            }
    }
 }
