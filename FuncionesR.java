package ejerciciod;
public class FuncionesR {
    public double calcExponencial(int n, int x, int i, double result) {
        if (i == n) return result;
        result = result + (Math.pow(x, i) / factorial(i));
        return calcExponencial(n, x, i+1, result);
    }
    public double factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num-1);
    }
}    
    
       

