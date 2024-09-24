/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2;

/**
 *
 * @author Lenovo
 */
public class Employee {
    private String employee_name;
    private int employee_id;
    private String employee_depart;
    private boolean employee_attend;
    private double employee_salary;
    private double wrokHours;
    
    public Employee(){//constructor 
        employee_name="Mohamed";
        employee_id=2300634;
        employee_depart="Cyber";
        employee_attend=true;
        employee_salary=24000;
        wrokHours=7;
        
    }
    public Employee(String n,int id){
      this.employee_name=n;
      this.employee_id=id;
    }
    public Employee(String n,int id , boolean att){
        // This called constructor chaining
        this(n,id);// i refer to the constructor with 2 para....
        this.employee_attend=att;
    }

    public Employee(String n, int id, String employee_depart, boolean att, double employee_salary, double wrokHours) {
        this(n,id,att);
        this.employee_depart = employee_depart;
        this.employee_salary = employee_salary;
        this.wrokHours = wrokHours;
    }
    
    public void setSalary(double s){
        this.employee_salary=s;
    }
    public void setAttend(double s,boolean a){
        this.setSalary(s);
        this.employee_attend=a;
    }
//    public double getSalary(){
//    
//        return employee_salary;
//    }

    
    public void Enter_employee_Data(){
        System.out.println("Name:"+employee_name);
        System.out.println("ID:"+employee_id);
        System.out.println("Depart:"+employee_depart);
        System.out.println("Attend:"+employee_attend);
        System.out.println("Salary:"+employee_salary);
        System.out.println("WorkHours:"+wrokHours);
    }
 
}
