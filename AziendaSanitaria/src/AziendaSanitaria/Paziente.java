/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AziendaSanitaria;

/**
 *
 * @author 4bigr13
 */
public class Paziente {
    private String nome;
    private String riferimento;
    private int tessera_sanitaria;
    
    public Paziente(String n,String rif,int ts)
    {
    nome=n;
    riferimento=rif;
    tessera_sanitaria=ts;
    }
    
    public void setNome(String n)
    {nome=n;
    }
    
    public void setRiferimento(String rif)
    {
        riferimento=rif;
    }
    
    public void setTessera(int ts)
    {
        tessera_sanitaria=ts;
    }
    
    public String getNome()
    {return nome;}
    
    public String getRiferimento()
    {
        return riferimento;
    }
    public int getTs()
    {return tessera_sanitaria;}
    
    
    
}
