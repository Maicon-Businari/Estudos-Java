package dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class BancoMemoria<T> {

    List<T> lista = new ArrayList<T>();

    //Adicionar um item a lista
    protected boolean adicionar(T obj, Predicate<T> criterioDeBusca){

        //Verificando se ja tem cadastro da chave primaria
        Optional<T> itenEncontrado = lista.stream().filter(criterioDeBusca).findFirst();
        if(itenEncontrado.isEmpty()){
            lista.add(obj);
            return true;
        }
        else{
            lista.set(lista.indexOf(itenEncontrado.get()), obj);
            return false;
        }
    }

    //Lista todos os itens
    protected void lista(){
        lista.stream().forEach(item -> {
            System.out.println(item);
        });
    }

    //Busca um iten especifico
    protected T buscar(Predicate<T> criterioDeBusca){
        T itemEncontrado = lista.stream().filter(criterioDeBusca).findFirst().orElse(null);
        if(lista.stream().filter(criterioDeBusca).findFirst().orElse(null) != null){
            return itemEncontrado;
        }
        else{
            return null;
        }
    }

    //Exclui um item
    protected void excluir(Predicate<T> criteirioDeExclusao){
        lista.removeIf(criteirioDeExclusao);
    }

}


