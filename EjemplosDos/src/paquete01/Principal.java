/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete02.DatoTrabajo;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;
        String notasParciales = "";
        double[] misNotas;
        double promedio;
        
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        nombreEmpresa = DatoTrabajo.obtenerNombreEmpresa();
        direccionEmpresa = DatoTrabajo.obtenerDireccionEmpresa();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        for(int i = 0; i < misNotas.length; i++){
            notasParciales = notasParciales + misNotas[i] + " / ";
        }
        
        System.out.printf("----DATOS DE LA PERSONA----\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "----DATOS DE LA EMPRESA----\n"
                + "Nombre de la Empresa: %s\n"
                + "Direccion de la empresa: %s\n"
                + "----REPORTE DE NOTAS----\n"
                + "Notas Parciales: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                nombreEmpresa,
                direccionEmpresa,
                notasParciales,
                promedio);
    }
    
}
