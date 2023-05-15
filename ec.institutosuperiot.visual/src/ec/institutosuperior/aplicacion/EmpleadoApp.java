/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.institutosuperior.aplicacion;

import ec.institutosuperior.modelo.Empleado;




public class EmpleadoApp {
 
    public static void main(String[] args) {
       
        Empleado empleado1=new Empleado ("Fernando", "Ureña", 23, 800);
 
        Empleado empleado2=new Empleado ("", "Lopez", 50 ,1800);
 
       
        System.out.println("El salario del empleado1 es "+empleado1.getSalario());
 
     
        empleado1.setEdad(43);
 
        empleado1.plus(100);
 
     
        System.out.println("los datos del empleado 1 son :"+empleado1.getNombre()+"El salario actual del empleado1 es "+empleado1.getSalario());
 
      
        empleado2.setNombre("Antonio");
 
        empleado2.plus(100);
 
      
        System.out.println("Los Datos del empleado2 es :"+empleado2.getNombre()+"y su edad es :"+empleado2.getEdad()+"y el salario es de:"+empleado2.getSalario());
 
    }
 
}

