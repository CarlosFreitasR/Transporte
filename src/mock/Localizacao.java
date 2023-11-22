package mock;

import modelo.Cidade;

public enum Localizacao {
    SAO_PAULO_SP("São Paulo", "SP", "GRU", -23.5505, -46.6333),
    RIO_DE_JANEIRO_RJ("Rio de Janeiro", "RJ", "GIG", -22.9068, -43.1729),
    BELO_HORIZONTE_MG("Belo Horizonte", "MG", "CNF", -19.9167, -43.9345),
    SALVADOR_BA("Salvador", "BA", "SSA", -12.9714, -38.5014),
    BRASILIA_DF("Brasília", "DF", "BSB", -15.7801, -47.9292),
    RECIFE_PE("Recife", "PE", "REC", -8.0476, -34.8770),
    FORTALEZA_CE("Fortaleza", "CE", "FOR", -3.7172, -38.5433),
    MANAUS_AM("Manaus", "AM", "MAO", -3.1190, -60.0217),
    CURITIBA_PR("Curitiba", "PR", "CWB", -25.4284, -49.2733),
    PORTO_ALEGRE_RS("Porto Alegre", "RS", "POA", -30.0330, -51.2300),
    FLORIANOPOLIS_SC("Florianópolis", "SC", "FLN", -27.5954, -48.5480),
    CUIABA_MT("Cuiabá", "MT", "CGB", -15.6010, -56.0974),
    GOIANIA_GO("Goiânia", "GO", "GYN", -16.6860, -49.2643),
    NATAL_RN("Natal", "RN", "NAT", -5.7945, -35.2120),
    TERESINA_PI("Teresina", "PI", "THE", -5.0919, -42.8034),
    CAMPO_GRANDE_MS("Campo Grande", "MS", "CGR", -20.4646, -54.6090),
    JOAO_PESSOA_PB("João Pessoa", "PB", "JPA", -7.1151, -34.8630),
    VITORIA_ES("Vitória", "ES", "VIX", -20.3155, -40.3128),
    PALMAS_TO("Palmas", "TO", "PMW", -10.2128, -48.3600),
    ARACAJU_SE("Aracaju", "SE", "AJU", -10.9472, -37.0731);

    // Construtor do Enum
    private Localizacao(String cidade, String estado, String sigla, double latitude, double longitude) {
        this.cidade = cidade;
        this.estado = estado;
        this.sigla = sigla;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Atributos do Enum
    private final String cidade;
    private final String estado;
    private final String sigla;
    private final double latitude;
    private final double longitude;


}
