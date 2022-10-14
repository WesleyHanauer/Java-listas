package EstruturaBasica;

public class EstruturaBasica<T>{
    private T[] vetor;
    private int tamanho;

    public EstruturaBasica(int capacidade){
        vetor = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public void adiciona(T elemento){
        aumentaCapacidade();
        vetor[tamanho] = elemento;
        tamanho++;
    }

    public void adiciona(int posicao, T elemento){
        if(!(posicao>=0&&posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        aumentaCapacidade();
        for(int i=tamanho-1;i>=posicao;i--){
            vetor[i+1]=vetor[i];
        }
        vetor[posicao]=elemento;
        tamanho++;
    }

    private void aumentaCapacidade(){
        if (tamanho==vetor.length){
            T[] vetorAux = (T[]) new Object[tamanho*2];
            for (int i=0;i<tamanho;i++){
                vetorAux[i]=vetor[i];
            }
            vetor=vetorAux;
        }
    }

    public T obterElemento(int posicao){
        if(!(posicao>=0&&posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        return vetor[posicao];
    }

    public int posicaoDe(T elemento){
        for(int i=0;i<tamanho;i++){
            if (vetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public T remove(int posicao){
        if(!(posicao>=0&&posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        T copia = vetor[posicao];
        for (int i=posicao;i<tamanho-1;i++){
            vetor[i]=vetor[i+1];
        }
        tamanho--;
        return copia;
    }

    public int ultimoDe(T elemento){
        for (int i=tamanho-1;i>0;i--){
            if(vetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean possui(T elemento){
        for (int i=0;i<tamanho;i++){
            if(vetor[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }
    
    public int tamanhoLista(){
        int cont = 0;
        for(int i=0;i<tamanho;i++){
            cont++;
        }
        return cont;
    }
    
    public void apagarLista(){
        for (int i=tamanho-1;i>0;i--){
            vetor[i]=vetor[i-1];
            tamanho--;
        }
        vetor[0]=null;
        if(vetor[0]==null){
            tamanho--;
        }
    }
    
    @Override
    public String toString(){
        String retorno = "[";
        if(tamanho>0){
            for(int i=0;i<tamanho-1;i++){
                retorno+=vetor[i]+", ";
            }
            retorno+=vetor[tamanho-1];
        }
        retorno+="]";
        return retorno;
    }
}
