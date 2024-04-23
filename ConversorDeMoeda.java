public class ConversorDeMoeda {
    private double valorParaConversao;
    private String moedaBase;
    private String moedaConversao;
    private String moedaBaseExtenso;
    private String moedaCovnersaoExtenso;

    public String conversao(double v, String mb, String mc, String mbe, String mce){
        this.valorParaConversao = v;
        this.moedaBase = mb;
        this.moedaConversao = mc;
        this.moedaBaseExtenso = mbe;
        this.moedaCovnersaoExtenso = mce;

        ConsultaMoeda conversao = new ConsultaMoeda();
        Moeda novaMoeda = conversao.buscaMoeda(moedaBase, moedaConversao,valorParaConversao);
        double valorConvertido = novaMoeda.conversion_rate() * this.valorParaConversao;

        return this.valorParaConversao + " " + mb +" (" + mbe + ") equivalem a " + valorConvertido + " " +  moedaConversao + " (" + moedaCovnersaoExtenso + ")." ;
    }
}
