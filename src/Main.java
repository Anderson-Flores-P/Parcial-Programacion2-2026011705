public class Main {
    public static void main(String[] args) {
        // En la rama main, usamos la ComisionEstandar por defecto
        Vendedor vendedor = new Vendedor("Anderson", 1000.0, new ComisionPersonalizada(8));
        vendedor.mostrarDetalle();
    }
}