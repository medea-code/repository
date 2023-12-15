package repository;

public class RepositoryList <type extends Salvable>{
    public boolean saveData(type in){
        listMem.add(in);
    }
}
