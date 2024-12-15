package Ej7;

public class TriCalc implements Runnable{
    private int base;
    private int altura;

    public TriCalc (int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void run() {
        System.out.println("Calculando área del triángulo...");
        int area = (base * altura) / 2;
        System.out.println("Base: " + base + ", Altura: " + altura + ", Area: " + area);
    }
}
