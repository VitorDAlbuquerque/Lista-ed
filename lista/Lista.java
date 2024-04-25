package com.company;

public class Lista{

    private int tamanho;
    private No inicio;
    private No fim;

    public Lista(){
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }


    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void adicionar(Object info){
        No no = new No(info);

        if (estaVazia()){
            this.inicio= no;
        }
        else
        {
            fim.prox = no;
        }
        no.info = info;
        this.fim = no;
        this.tamanho++;

    }

    public Object get(int indice) throws Exception {
        if (indice >= tamanho || indice < 0){
            return null;
        }

        if (indice == 0){
            return inicio.info;
        }
       if (indice == tamanho - 1){
            return fim.info;
        }

            No a = inicio;


            for (int i = 0; i <= indice; i++) {

            if (i == indice){
                return a.info;
            }
                a = a.prox;

            }
        throw new Exception("Não deveria chegar");
    }


    public boolean remover(int indice) {
    if (indice < 0 || indice >= tamanho) return false;

    if (indice == 0){
        inicio = inicio.prox;

    }
        No a = this.inicio;
        for (int i = 0; i <= indice; i++) {

            if (i  == indice-1){

                a.prox = a.prox.prox;
                break;
            }
            a = a.prox;

        }
        if (indice == tamanho -1){
            fim = a;
        }
    tamanho--;
    return true;
    }



public void imprimeLista(){
    No a = this.inicio;
    for (int i = 0; i < tamanho; i++) {
        System.out.println(a.info);
        a = a.prox;


    }
    
}

}
