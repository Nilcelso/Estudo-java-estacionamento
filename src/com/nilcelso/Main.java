package com.nilcelso;

import com.nilcelso.classes.veiculos.Teste;
import com.nilcelso.classes.veiculos.TesteImpl;
import com.nilcelso.classes.veiculos.TipoCarro;
import com.nilcelso.classes.veiculos.Veiculo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teste teste = null;
        TesteImpl teste1 = new TesteImpl();


        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo veiculo = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo veiculo3 = new Veiculo();
        veiculo.setTipoCarro(TipoCarro.MOTO);
        veiculo.setPlaca("12345");
        veiculo2.setTipoCarro(TipoCarro.CARRO);
        veiculo2.setPlaca("aaaaaa");
        veiculo3.setTipoCarro(TipoCarro.UTILITARIO);
        veiculo3.setPlaca("alskdjfdk");

        veiculos.add(veiculo);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.forEach(v->System.out.println(v.getPlaca()+" "+v.getTipoCarro()));

        System.out.println("Qual tamanho da lista? " + veiculos.size());




        System.out.println(veiculo.getPlaca()+" "+veiculo.getTipoCarro());

        teste1.teste();
        teste1.teste2("Dio");

    }
}
