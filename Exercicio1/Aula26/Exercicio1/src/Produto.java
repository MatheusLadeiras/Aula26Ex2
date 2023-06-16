public class Produto implements Comparable {
    public String nome;
    public double preço;
    public int quantidade;

    public Produto (String nome, double preço, int quantidade) {
        getNome(nome);
        getPreço(preço);
        getQuantidade(quantidade);
    }

    @Override
    public void getNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void getPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public void getQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
