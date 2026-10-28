import java.util.List;
public class ExportadorBancoCentral extends ExportadorFinanciero {
    @Override
    public void exportarDatos(List<String> registros) {
        if (validarDatos(registros)) {
            System.out.println("Exportando datos al Banco Central...");

            for (String registro : registros) {
                System.out.println("Enviando: " + registro);
            }

            System.out.println("Transferencia al Banco Central completada.");
        } else {
            System.out.println("Error: no hay registros para exportar.");
        }
    }
}
