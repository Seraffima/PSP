package SyncHilos2;

class Contador {
    private int c = 0; //atributo contador
    Contador(int c) {this.c = c;}
    synchronized void incrementa () {
        c ++;
    }
    synchronized void decrementa () {
        c --;
    }
    synchronized int getValor (){
        return c;
    }
}
