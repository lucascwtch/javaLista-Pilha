package pilha;
import java.util.*;
public class principalPilha {
    public static void main(String[]args){
        pilha pilha = new pilha(3);
        Scanner l = new Scanner(System.in);
        int op = 0;
       do{
           System.out.println("Escolha uma opção:\n 1 - Empilhar\n 2 - Desempilhar\n 3 - Ver Pilha\n 4  - Sair");
           op = l.nextInt();
           switch(op){
               case 1:
                   System.out.print("Digite o pedido");
                   int pedido = l.nextInt();
                   pilha.empilha(pedido);
                   System.out.println(pilha);
                   break;
               case 2:
                   System.out.println("Pedido desempilhado: " + pilha.desempilha());
                   System.out.println(pilha);
                   break;
                case 3:
                    System.out.println("Pilha atual: " + pilha);
                    break;
               case 4:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção inválida");
           }
    }while(op != 4);{
        System.out.println("Pilha fechada!");
        System.exit(0);
    }
    }
}

