import java.util.List;
public class ExportadorAgenciaTributaria extends ExportadorFinanciero{
    @Override
    public void exportarDatos(List<String> registros) {
        if (validarDatos(registros)) {
            System.out.println("Exportando datos a la Agencia Tributaria...");

            for (String registro : registros) {
                System.out.println("Enviando: " + registro);
            }

            System.out.println("Transferencia a la Agencia Tributaria completada.");
        } else {
            System.out.println("Error: no hay registros para exportar.");
        }
    }
}
