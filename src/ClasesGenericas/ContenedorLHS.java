package ClasesGenericas;

import Interfaces.IFuncionalidades;
import clasesItem.Item;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ContenedorLHS <T extends Item> implements IFuncionalidades<T>, Serializable {
    private static final long serialVersionUID = -6160032998174358819L;

    private LinkedHashSet<T> miLHSet;

    public ContenedorLHS() {
        miLHSet = new LinkedHashSet<>();
    }

    @Override
    public int contar() {
        return miLHSet.size();
    }

    /**
     * AAAAAAAAAAAAAAAA
     */
    public LinkedHashSet<T> getMiLHSet() {
        return miLHSet;
    }


    @Override
    public String listar() {
        StringBuilder msj = new StringBuilder();
        for (T dato : miLHSet) {
            msj.append(dato.toString());
        }
        return msj.toString();
    }

    @Override
    public boolean eliminar(T o) {

        boolean rta = false;
        if (o != null) {
            miLHSet.remove(o);
            rta = true;
        }

        return rta;
    }

    @Override
    public boolean agregar(T o) {

        return miLHSet.add(o);
    }

    @Override
    public String toString() {
        return " "+ miLHSet;
    }
}
