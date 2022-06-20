package pilha;
public class pilha {

    int pedidos[];
    int topo;
pilha(int qtdPedidos){
        topo = -1;
        pedidos =  new int[qtdPedidos];
    }
    public boolean cheia(){
        return (topo ==(pedidos.length - 1));
    }
    public boolean vazia(){
        return (topo == -1);
    }
    public String toString(){
        String s = "[";
        for(int i= 0; i <= topo; i++){
            s += pedidos[i];
            if(i < topo)
            s = s + ",";
        }
        s = s + "]";
        return s;
    }
    public void empilha (int recebePedido){
        if (!cheia()){
            topo++;
            pedidos[topo] = recebePedido;
        }else{
            System.out.println("Pilha cheia!");
        }
    }
    public int desempilha(){
        int valor = -1;
        if (!vazia()){
            valor = pedidos[topo];
            pedidos[topo] = 0;
            topo--;
        }else{
            System.out.println("Pilha vazia!");
        }
        return valor;
    }
}
