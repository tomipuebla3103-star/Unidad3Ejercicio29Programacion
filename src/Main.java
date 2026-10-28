//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

void main() {
    List<String> registros = new ArrayList<>();

    registros.add("Balance: $150000");
    registros.add("Ingresos: $200000");
    registros.add("Gastos: $50000");

    ExportadorFinanciero exportador;

    exportador = new ExportadorBancoCentral();
    exportador.exportarDatos(registros);

    System.out.println("--------------------");

    exportador = new ExportadorAgenciaTributaria();
    exportador.exportarDatos(registros);

    System.out.println("--------------------");

    List<String> registrosVacios = new ArrayList<>();

    exportador.exportarDatos(registrosVacios);

}
