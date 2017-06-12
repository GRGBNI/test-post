/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AziendaSanitaria;
import java.util.Scanner;
/**
 *
 * @author 4bigr13
 */
public class Main_AziendaSanitaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //commento di prova
         AziendaSanitaria a=new AziendaSanitaria();
         Scanner sc=new Scanner(System.in);
        int scelta=-1;
        
        do{
            System.out.println("0-Esci");
            System.out.println("1-Aggiungi Paziente");
            System.out.println("2-Aggiungi Medico");
            System.out.println("3-Lista medico");
            System.out.println("4-Visualizzare il codice del medico con più pazienti");
            System.out.println("5-Visualizzare il medico con numero di pazienti minore del prefissato");
            System.out.println("Scrivere scelta:");
            scelta=sc.nextInt();
        
        switch(scelta)
        {
        case 0:
            break;
        case 1:
            a.AggiungiPaziente();
            break;
        case 2:
            a.AggiungiMedici();
            break;
        case 3:
            System.out.println("Inserire il codice del medico: ");
            String m=sc.nextLine();
            a.listaMedico(m);
            break;
        case 4:
            a.statMedico();
            break;
        case 5:
            System.out.println("Inserire il numero prefissato: ");
            int n=sc.nextInt();
            a.Visualizzainf(n);
        default: System.out.println("SCELTA ERRATA!! ");
        }
        
        }while(scelta!=0);
                
        }        
    }
