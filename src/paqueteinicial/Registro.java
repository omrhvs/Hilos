package paqueteinicial;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class Registro 
{
    private List<String> datos = new ArrayList<>();
    private DefaultComboBoxModel<String> comboBoxModel;
    private JComboBox<String> comboBox;
    
    public Registro(JComboBox<String> comboBox) 
    {
        this.comboBox = comboBox;
        this.comboBoxModel = new DefaultComboBoxModel<>();
        this.comboBox.setModel(comboBoxModel);
    }
    
    public synchronized String agregarDato(String dato) 
    {
        datos.add(dato);        
        comboBoxModel.addElement(dato);
        comboBoxModel.setSelectedItem(dato);
        //actualizarModeloComboBox();
        
        return "Empleado agregado: " + dato;
    }

    public synchronized String eliminarDato(String dato) 
    {
        if (dato != null && datos.remove(dato))
        {
            if (comboBoxModel != null) 
            {
                comboBoxModel.removeElement(dato);
                datos.remove(dato);
                //actualizarModeloComboBox();
            }
            return "Empleado eliminado: " + dato;
        } 
        else 
        {
            return "No se encontró el empleado: " + dato;
        }
    }

    public synchronized String modificarDato(String datoViejo, String datoNuevo) 
    {
        if (datos.contains(datoViejo)) 
        {
            datos.remove(datoViejo);
            datos.add(datoNuevo);
            return "Dato modificado de " + datoViejo + " a " + datoNuevo;
        } 
        else 
        {
            return "No se encontró el dato a modificar: " + datoViejo;
        }
    }

    public synchronized String consultarDatos() 
    {
        StringBuilder listaCompleta = new StringBuilder();
        for (String dato : datos) 
        {
            listaCompleta.append("- ").append(dato).append("\n");
        }
        return listaCompleta.toString();        
    }
    
    public List<String> obtenerDatos() 
    {
        return datos;
    }
    
    public void actualizarModeloComboBox()
    {
        if(comboBoxModel != null)
        {
            comboBoxModel.removeAllElements();
        }
        for (String dato : datos) 
        {
            comboBoxModel.addElement(dato);
        }
    }
    
    public DefaultComboBoxModel<String> getComboBoxModel() 
    {
        System.out.println("Modelo obtenido");
        return comboBoxModel;
    }
    
    public DefaultComboBoxModel<String> getComboBoxModelModi() 
    {
        System.out.println("Modelo obtenido");
        return comboBoxModel;
    }
}
