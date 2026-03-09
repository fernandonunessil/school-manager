public class FaixaEtaria {
    public EtapaDescricaoEnum descricao;

    public FaixaEtaria(int idade) throws Exception {
        if (idade < 6) {
            this.descricao = EtapaDescricaoEnum.INFANTIL;
            return;
        }

        if (idade >= 6 || idade < 11) {
            this.descricao = EtapaDescricaoEnum.FUNDAMENTAL_ANOS_INICIAIS;
            return;
        }

        if (idade >= 11 || idade < 15) {
            this.descricao = EtapaDescricaoEnum.FUNDAMENTAL_ANOS_FINAIS;
            return;
        }

        if (idade >= 15 || idade < 18) {
            this.descricao = EtapaDescricaoEnum.MEDIO;
            return;
        }

        throw new Exception("A idade do aluno é inválida");
    }
}
