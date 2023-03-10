package conversorTarefaneto;

public class Conversor {
    private int decimal;
    private String binario, octal, hexadecimal;

    public Conversor(int decimal) {
        this.decimal = decimal;
        binario = converterBinario();
        octal = converterOctal();
        hexadecimal = converterHexadecimal();
    }

    private String converterBinario() {
        if (decimal == 0) {
            return "0";
        }
        int temp = decimal;
        String binario = "";
        while (temp > 0) {
            int resto = temp % 2;
            binario = resto + binario;
            temp /= 2;
        }
        return binario;
    }

    private String converterOctal() {
        if (decimal == 0) {
            return "0";
        }
        int temp = decimal;
        String octal = "";
        while (temp > 0) {
            int resto = temp % 8;
            octal = resto + octal;
            temp /= 8;
        }
        return octal;
    }

    private String converterHexadecimal() {
        if (decimal == 0) {
            return "0";
        }
        int temp = decimal;
        String hexadecimal = "";
        while (temp > 0) {
            int resto = temp % 16;
            if (resto < 10) {
                hexadecimal = resto + hexadecimal;
            } else {
                char letra = (char) ('A' + resto - 10);
                hexadecimal = letra + hexadecimal;
            }
            temp /= 16;
        }
        return hexadecimal;
    }

    public int getDecimal() {
        return decimal;
    }

    public String getBinario() {
        return binario;
    }

    public String getOctal() {
        return octal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }
}
