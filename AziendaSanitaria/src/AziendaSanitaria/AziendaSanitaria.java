/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AziendaSanitaria;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author 4bigr13
 */
public class AziendaSanitaria {

    private Vector<Paziente> pazienti;
    private Vector<Medico> medici;
    public AziendaSanitaria(int np,int nm)
    {
        pazienti=new Vector(np,1);
        medici=new Vector (nm,1);
    }
    
    public AziendaSanitaria()
    {
        pazienti=new Vector();
        medici=new Vector();
    }
    
    public void AggiungiPaziente()
            
    { Scanner sc=new Scanner(System.in);
        int i=0;
    String n,rif;
    int ts;
    do
    {
         System.out.println("Inserire nome del paziente: ");
         n=sc.nextLine();
         System.out.println("Inserire riferimento: ");
         rif=sc.nextLine();
         System.out.println("Inserire la tessera");
         ts=sc.nextInt();
         i++;
    }
    while(pazienti.elementAt(i).getNome().equalsIgnoreCase(n)&&i<pazienti.size());
    }
    
    public void AggiungiMedici()
    { Scanner sc=new Scanner(System.in);
       int i=0;
       String n,specialità;
       int cod;
       do{
       System.out.println("Inserire nome del medico: ");
       n=sc.nextLine();
       System.out.println("Inserire specialità ");
       specialità=sc.nextLine();
       System.out.println("Inserire il codice: ");
       cod=sc.nextInt();
       i++;
       } while(medici.elementAt(i).getNome().equalsIgnoreCase(n)&&i<medici.size());
    }
    
    public void listaMedico(String s)
    {int cont,i;
    String c="";
    Vector v=new Vector(1,1);
    cont=0;
    i=0;
    do{
        if(medici.elementAt(i).getNome().equalsIgnoreCase(s))
        {   
            c=medici.elementAt(i).getCodice();
            cont++;
        }
        i++;
    }while(cont!=0&&i<medici.size());
    for(int j=0;j<pazienti.size();i++)
    {
        if(pazienti.elementAt(j).getRiferimento().equalsIgnoreCase(c))
        {
            v.addElement(pazienti.elementAt(j));
        }
    }
    for(int k =0;k<v.size();k++)
    {
        System.out.println(" "+((Paziente)v.elementAt(k)).getNome());
    }
   
    }
    public String statMedico()
    {
    int cont=0;
    int p=0;
    int max=0;
    for(int i=0;i<medici.size();i++)
    {
        for(int j=0;j<pazienti.size();j++)
        {
            if(pazienti.elementAt(j).getRiferimento().equalsIgnoreCase(medici.elementAt(i).getCodice()))
            {
                cont=cont++;
            }
            if(cont>p)
                p=cont;
                max=i;
           
        }
    }
    
    return medici.elementAt(max).getCodice();
    }
    public void Visualizzainf(int n)
    {
    int cont=0;
    for(int i=0;i<medici.size();i++)
    {
        for(int j=0;j<pazienti.size();j++)
        {
        if(pazienti.elementAt(j).getRiferimento().equalsIgnoreCase(medici.elementAt(i).getCodice()))
            {
                cont=cont++;
            }
        if(cont<n)
        {
            System.out.println("Nome: "+medici.elementAt(i).getNome()+"Specialità: "+medici.elementAt(i).getSpecialità());
        }
        }
    }
    }
    
    
    
    
   }
