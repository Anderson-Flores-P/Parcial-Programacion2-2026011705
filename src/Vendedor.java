public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comision = this.estrategia.calcularComision(this.ventasMes);
        System.out.println("--- Detalle del Vendedor ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Venta Total: $" + this.ventasMes);
        System.out.println("Comisión obtenida: $" + comision);
        System.out.println("----------------------------");
    }
}