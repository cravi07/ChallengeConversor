// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class App {
   public App() {
   }

   public static void main(String[] args) {
      Object[] options = new Object[]{"Convertir Monedas", "Conversor de Temperatura", "Salir"};
      int choice = JOptionPane.showOptionDialog((Component)null, "Que Quieres hacer?", "Convertir", -1, -1, (Icon)null, options, options[0]);
      if (choice == 2) {
         JOptionPane.showMessageDialog((Component)null, "Programa Cerrado");
         System.exit(0);
      }

      String cambio;
      if (choice == 0) {
         DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
         boolean continuarPrograma = true;

         label82:
         while(true) {
            int confirm;
            do {
               if (!continuarPrograma) {
                  break label82;
               }

               String[] opciones = new String[]{"pesos a Euros", "pesos a D\u00f3lares", "pesos a Libras Esterlinas", "pesos a Yen", "pesos a Won"};
               cambio = (String)JOptionPane.showInputDialog((Component)null, "Elija una opci\u00f3n:", "Conversor de Moneda", 3, (Icon)null, opciones, opciones[0]);
               String input = JOptionPane.showInputDialog("Ingrese la cantidad en pesos mexicanos: ");

               double pesos;
               try {
                  pesos = Double.parseDouble(input);
               } catch (NumberFormatException var13) {
                  JOptionPane.showMessageDialog((Component)null, "Valor no v\u00e1lido.");
                  return;
               }

               double won;
               if (cambio.equals("pesos a D\u00f3lares")) {
                  won = pesos / 20.58;
                  JOptionPane.showMessageDialog((Component)null, pesos + " pesos mexicanos son " + FormatearDecimal.format(won) + " d\u00f3lares.");
               } else if (cambio.equals("pesos a Euros")) {
                  won = pesos / 24.21;
                  JOptionPane.showMessageDialog((Component)null, pesos + " pesos mexicanos son " + won + " euros.");
               } else if (cambio.equals("pesos a Libras Esterlinas")) {
                  won = pesos / 25.92;
                  JOptionPane.showMessageDialog((Component)null, pesos + " pesos mexicanos son " + won + " libras esterlinas.");
               } else if (cambio.equals("pesos a Yen")) {
                  won = pesos / 0.03;
                  JOptionPane.showMessageDialog((Component)null, pesos + " pesos mexicanos son " + won + " yenes japoneses.");
               } else if (cambio.equals("pesos a Won")) {
                  won = pesos / 0.0027;
                  JOptionPane.showMessageDialog((Component)null, pesos + " pesos mexicanos son " + won + " wones surcoreanos.");
               }

               confirm = JOptionPane.showConfirmDialog((Component)null, "\u00bfDesea continuar usando el programa?", "Confirmar", 1);
            } while(confirm != 1 && confirm != 2);

            continuarPrograma = false;
            JOptionPane.showMessageDialog((Component)null, "Programa Finalizado");
         }
      }

      if (choice == 1) {
         Boolean SeguirPrograma = true;

         while(true) {
            int continuar;
            do {
               if (!SeguirPrograma) {
                  return;
               }

               String[] opciones = new String[]{"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
               int opcion = JOptionPane.showOptionDialog((Component)null, "Elige una opci\u00f3n de conversi\u00f3n:", "Convertidor de Temperatura", -1, -1, (Icon)null, opciones, opciones[0]);
               cambio = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");
               double valor = 0.0;

               try {
                  valor = Double.parseDouble(cambio);
               } catch (NumberFormatException var12) {
                  JOptionPane.showMessageDialog((Component)null, "Valor no v\u00e1lido");
                  System.exit(0);
               }

               double resultado = 0.0;
               if (opcion == 0) {
                  resultado = valor * 9.0 / 5.0 + 32.0;
                  JOptionPane.showMessageDialog((Component)null, valor + " grados Celsius son " + resultado + " grados Fahrenheit");
               } else if (opcion == 1) {
                  resultado = (valor - 32.0) * 5.0 / 9.0;
                  JOptionPane.showMessageDialog((Component)null, valor + " grados Fahrenheit son " + resultado + " grados Celsius");
               }

               continuar = JOptionPane.showConfirmDialog((Component)null, "\u00bfDeseas continuar usando el programa?", "", 1);
            } while(continuar != 1 && continuar != 2);

            SeguirPrograma = false;
            JOptionPane.showMessageDialog((Component)null, "Programa Finalizado");
         }
      }
   }
}
