package fila;

public class fila {
    int inicio;
    int fim;
    int tamanho;
    int qtdElementos;
    int dados[];

    public fila(){
        inicio = fim = -1;
        tamanho = 100;
        dados = new int[tamanho];
        qtdElementos = 0;
    }
    public boolean estaVazia(){
        if(qtdElementos == 0){
            return true;
        }
        return false;
    }
    public boolean estaCheia(){
        if(qtdElementos == tamanho - 1){
            return true;
        }
        return false;
    }
    public void adicionar(int elemento){
            if(!estaCheia()){
                if(inicio == -1){
                    inicio = 0;
                }
                fim++;
                dados[fim] = elemento;
                qtdElementos++;
     }
}
    public void remover(){
        if(!estaVazia()){
            inicio++;
            qtdElementos--;
        }
    }
    public void mostrar(){
        String elementos = "";
        for(int i = inicio; i<=fim; i++){
            elementos += dados[i] + "-";
        }
        System.out.println(elementos);
    }
}
