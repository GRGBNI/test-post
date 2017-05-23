/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AziendaSanitaria;

/**
 *
 * @author 4bigr13
 */
public class Medico {
    private String nome;
    private String specialità;
    private String codice;
    
    public Medico(String n,String s,String c)
    {
    nome=n;
    specialità=s;
    codice=c;
    }
    
    public void setNome(String n)
    {
        nome=n;
    }
    
    public void setSpecialità(String s)
    {
        specialità=s;
    }
    
    public void setCodice(String c)
    {
        codice=c;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getSpecialità()
    {
        return specialità;
    }
    public String getCodice()
    {
        return codice;
    }
    
    
    
    
    
    
    
}
