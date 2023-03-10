package conversorTarefaneto;

public class Calculo extends Conversor{
    public Calculo(int decimal) {
        super(decimal);
  
    }

    public static void main(String[] args) {
        System.out.println("| Decimal | Binário | Octal   | Hexadecimal |");// deixar espaço 
        System.out.println("|---------|---------|---------|-------------|");
        for (int decimal = 0; decimal <= 255; decimal++) {
            Calculo conversor = new Calculo(decimal);
            String linha = String.format("| %7d | %7s | %7s | %11s |", 
                conversor.getDecimal(), conversor.getBinario(), 
                conversor.getOctal(), conversor.getHexadecimal());
            System.out.println(linha);
        }
    }
}


