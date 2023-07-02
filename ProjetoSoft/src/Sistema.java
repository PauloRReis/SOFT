package Negocio;

import Classes.*;

import java.util.List;

public class Sistema {

    private List<Veiculo> veiculos;
    private List<CategoriaTransporte> categoriaTransportes;
    private List<Cargo> cargos;
    private List<Passageiro> passageiros;

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<CategoriaTransporte> getCategoriaTransportes() {
        return categoriaTransportes;
    }

    public void setCategoriaTransportes(List<CategoriaTransporte> categoriaTransportes) {
        this.categoriaTransportes = categoriaTransportes;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
}
