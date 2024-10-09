public class Heroi {
        public String nome;
        public int xp;
        public String classificacao;

    public Heroi(String nome, int xp) {
        this.nome = nome;
        this.xp = xp;
    }

    public void calcularPremio(String nome, int xp) {
            if (xp < 1000) {
                classificacao = "Ferro";
            } else if (xp >= 1001 && xp <= 2000) {
                classificacao = "Bronze";
            } else if (xp >= 2001 && xp <= 5000) {
                classificacao = "Prata";
            } else if (xp >= 5001 && xp <= 7000) {
                classificacao = "Ouro";
            } else if (xp >= 7001 && xp <= 8000) {
                classificacao = "Platina";
            } else if (xp >= 8001 && xp <= 9000) {
                classificacao = "Ascendente";
            } else if (xp >= 9001 && xp <= 10000) {
                classificacao = "Imortal";
            } else {
                classificacao = "Radiante";
            }

            System.out.println("O herói de nome " + nome + " está no nível " + classificacao);

        }
}
