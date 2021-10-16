package batalha_yu_gi_oh;

//ATRIBUTOS ENCAPSULADOS
public class cartas {

    private String nome;
    private String elemento;
    private int level;
    private int ataque;
    private int defesa;
    private int vida;
   

//CONSTRUTOR    
        public cartas() {
    }
        
    public cartas(String nome, String elemento, int level, int ataque, int defesa) {
        this.nome = nome;
        this.elemento = elemento;
        this.level = level;
        this.ataque = ataque;
        this.defesa = defesa;
        calculaVida();

    }


//MÉTODOS
    public String getNome() {
        return nome;
    }

    public String getElemento() {
        return elemento;
    }

    public int getLevel() {
        return level;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVida() {
        return vida;

    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    public void imprimeCarta() {
        System.out.println("Nome: " + nome + " | "
                + "Tipo: " + elemento + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque: " + ataque + " | "
                + "Defesa: " + defesa + " | ");
    }

    public void calculaVida() {
        vida = (ataque - defesa) * level;
    }

}