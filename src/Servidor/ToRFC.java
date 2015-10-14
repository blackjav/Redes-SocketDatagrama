/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author javier
 */
public class ToRFC {
    
    private String paterno;
    private String materno ;
    private String nombre;
    private String fecha;
    private String nacimiento;
    private String sexo;

    public ToRFC(String paterno, String materno, String nombre, String fecha, String nacimiento, String sexo) {
        this.paterno = paterno.toLowerCase();
        this.materno = materno.toLowerCase();
        this.nombre = nombre.toLowerCase();
        this.fecha = fecha.toLowerCase();
        this.nacimiento = nacimiento.toLowerCase();
        this.sexo = sexo.toLowerCase();
    }
    
    public String cacluate()
    {
        String generalRFC = "";
        
        String[] arreglo = new String [50];
        
        arreglo [0] = paterno.charAt(0)+"";
        
        for(int i = 1 ; i< paterno.length(); i++)
        {
            if(paterno.charAt(i) =='a'|| paterno.charAt(i) =='e'|| paterno.charAt(i) =='i'|| paterno.charAt(i) =='o'|| paterno.charAt(i) =='u')
            {
                arreglo[1] = paterno.charAt(i)+"";
                break;
            }
           
        }
        arreglo[2] = materno.charAt(0)+"";
        arreglo[3] = nombre.charAt(0)+"";
        String [] fechas = fecha.split("/");
        
        
        int n = 4;
        for (int i = 2 ; i >= 0 ; i--)
        {
//            System.out.println("LAs fechas son" + fechas[i]);
            arreglo [n] = fechas[i];
            n++;
        }
        
        for(String l : arreglo)
        {
            if(l != null)
                generalRFC += l;
            else 
                break;
        }
        
        return generalRFC.toUpperCase();
    }
}
