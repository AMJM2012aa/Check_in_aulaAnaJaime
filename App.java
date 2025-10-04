
import console.MainConsole;
import logic.SesionService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class App {
    public static void main(String[] args) {
        boolean usarGui = false;
        for (String a : args) if ("--gui".equalsIgnoreCase(a)) usarGui = true;

        SesionService service = new SesionService();
        service.cargarDatosDemo(); // datos de prueba

        if (usarGui) {
            // TODO (AHORA): crear edu.cerp.checkin.ui.CheckInGUI con método estático show(service)
            // y descomentar la línea siguiente para lanzar tu GUI.
            // edu.cerp.checkin.ui.CheckInGUI.show(service);
            System.out.println("⚠ GUI no implementada. Corre sin --gui para usar consola.");
        } else {
            MainConsole.run(service);
        }
    }
}
