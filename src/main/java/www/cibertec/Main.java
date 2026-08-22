package www.cibertec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int cantidad = 10;
        int marca = 0;
        double precio = obtenerPrecio(marca);
        double importeCompra = obtenerImporteCompra_v2(precio, cantidad);
        double importeDescuento = obtenerImporteDescuento(importeCompra, cantidad);
        double importePagar = obtenerImportePagar(importeCompra, importeDescuento);
        int lapicero = calculoLapiceros(importePagar, cantidad);
        imprimir(importeCompra, importePagar, lapicero, importeDescuento);
    }

    static double obtenerPrecio(int mar) {
        double precio;
        if (mar == 0) {
            precio = 5.2;
        } else if (mar == 1) {
            precio = 8.2;
        } else if (mar == 2) {
            precio = 6.5;
        } else {
            precio = 7.4;
        }
        return precio;
    }

    static double obtenerImporteCompra_v1(double preci, int canti) {
        double importeCompra;
        importeCompra = preci * canti;
        return importeCompra;
    }

    static double obtenerImporteCompra_v2(double preci, int canti) {
        return preci * canti;
    }

    static double obtenerImporteDescuento(double importeCompra, int cantidad) {
        double importeDescuento;
        if (cantidad < 18) {
            importeDescuento = importeCompra * 0.125;
        } else if (cantidad >= 12 && cantidad < 18) {
            importeDescuento = importeCompra * 0.10;
        } else if (cantidad >= 6 && cantidad < 12) {
            importeDescuento = importeCompra * 0.075;
        } else {
            importeDescuento = importeCompra * 0.0;
        }
        return importeDescuento;
    }

    static double obtenerImportePagar(double importeCompra, double importeDescuento) {
        return importeCompra - importeDescuento;
    }

    static int calculoLapiceros(double importePagar, int cantidad) {
        int lapicero;
        if (importePagar < 12) {
            lapicero = cantidad * 2;
        } else if (importePagar >= 12 && importePagar < 24) {
            lapicero = cantidad * 4;
        } else if (importePagar >= 24 && importePagar < 36) {
            lapicero = 1 * cantidad;
        } else {
            lapicero = 2 * cantidad;
        }
        return lapicero;
    }

    static void imprimir(double importeCompra, double importePagar, int lapicero, double importeDescuento) {
        System.out.println("SALIDA DE RESULTADO\n");
        System.out.println("importe de compra : " + importeCompra);
        System.out.println("importe de descuento: " + importeDescuento);
        System.out.println("importe a pagar : " + importePagar);
        System.out.println("lapiceros : " + lapicero);
    }
}
