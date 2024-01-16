package org.example;

import org.example.Telefone;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;
    private Set<Telefone> telefones;

    public Pessoa(String nome) {
        this.nome = nome;
        this.telefones = new HashSet<>();
    }
    
    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void removerTelefone(Telefone telefone) {
        telefones.remove(telefone);
    }

    @Override
    public String toString() {
        StringBuilder telefoneStr = new StringBuilder();
        for (Telefone telefone : telefones) {
            telefoneStr.append(telefone.getNumero()).append(", ");
        }
        if (telefoneStr.length() > 0) {
            telefoneStr.delete(telefoneStr.length() - 2, telefoneStr.length());
        }
        return nome + ": " + telefoneStr.toString();
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }
}
