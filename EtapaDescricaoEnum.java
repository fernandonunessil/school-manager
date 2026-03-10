public enum EtapaDescricaoEnum {
    INFANTIL("Infantil"),
    FUNDAMENTAL_ANOS_INICIAIS("Fundamental anos iniciais"),
    FUNDAMENTAL_ANOS_FINAIS("fundamental anos finais"),
    MEDIO("Médio");

    private String descricao;

    EtapaDescricaoEnum(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
