package com.company.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Integer contador = 0;
    private HashMap<Integer, List<Roupa>> guardaRoupa = new HashMap<>();

    public GuardaRoupa(Integer contador, HashMap<Integer, List<Roupa>> dicionario) {
        this.contador = contador;
        this.guardaRoupa = dicionario;
    }

    public Integer guardarRoupas(List<Roupa> listaDeRoupas) {
        ++contador;
        guardaRoupa.put(contador, listaDeRoupas);

        return contador;
    }

    public void mostrarRoupas() {
        for (Map.Entry<Integer, List<Roupa>> roupaEntry: guardaRoupa.entrySet()) {//
            for(Roupa roupaEntry1 : roupaEntry.getValue()){
                System.out.println("Gaveta "+roupaEntry.getKey()+"-> "+roupaEntry1.getMarca());
            }
        }
    }

    public List<Roupa> devolverRoupas(Integer codigo){
        guardaRoupa.remove(codigo);
        return null;
    }
}
