package segunda.temporada.episodioQuatro;

public class main {
    public static void main(String[] args) {
//        ConversorMoeda conversor = new ConversorMoeda();
//        System.out.println(conversor.converterDolarParaReal(1));

//        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
//        System.out.println(calculadoraSalaRetangular.calcularArea(5,2));
//        System.out.println(calculadoraSalaRetangular.calcularPerimetro(5,2));

//        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
//        tabuada.setNumero(2);
//        tabuada.mostrarTabuada();

//        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
//        conversorTemperaturaPadrao.setCelcius(20);
//        conversorTemperaturaPadrao.setFahrenheit(68);
//        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit());
//        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius());

//        Livro livro = new Livro();
//        livro.setPreco(10);
//        System.out.println(livro.calcularPrecoFinal());
//        ProdutoFisico produto = new ProdutoFisico();
//        produto.setPreco(10);
//        System.out.println(produto.calcularPrecoFinal());

        Produto produto = new Produto();
        produto.setPreco(10);
        produto.setQuantidade(10);
        System.out.println(produto.valorTotal(produto.getPreco(),produto.getQuantidade()));
        System.out.println(produto.aplicaDescontos());
        System.out.println(produto.aplicaDescontos());


    }
}
