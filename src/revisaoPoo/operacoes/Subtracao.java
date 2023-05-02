package revisaoPoo.operacoes;

import revisaoPoo.interfaces.Operacao2;

public class Subtracao implements Operacao2 {


    @Override
    public double calcular(double number, double number2) {
        return number - number2;
    }
}
