public class OpMath {
    public static void main(String[] args) {
        double queijo = 7.00;
        double acucar = 100.00;
        double desconto = 5.00;
        int totalDiasMes = 30;

        double valorTotal = queijo + acucar;
        double valorTotalcomDesconto = valorTotal - desconto;
        double valorTotalDivido = valorTotalcomDesconto / 2;
        double valorMensal = valorTotalcomDesconto * totalDiasMes;
        System.out.println("O total do Mês é R$ " + valorMensal);

    }
}
