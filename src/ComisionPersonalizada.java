public class ComisionPersonalizada implements EstrategiaComision {
    private int cantidadLetras;

    public ComisionPersonalizada(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    @Override
    public double calcularComision(double montoVenta) {
        // (5 + N)% de la venta
        double porcentaje = (8 + cantidadLetras) / 100.0;
        return montoVenta * porcentaje;
    }
}