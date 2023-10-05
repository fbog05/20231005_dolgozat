/*
* File: MainConsole.java
* Author: Ferencsik Boglárka
* Copyright: 2023, Ferencsik Boglárka
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/fbog05
* Licenc: GNU GPL
*/

package viewers;

import java.util.ArrayList;

import models.Employee;

public class MainConsole {
    
    public static void showData(ArrayList<Employee> empList){

        for(Employee employee:empList){
            System.out.printf("Név: %s\n", employee.getNev());
            System.out.printf("Település: %s\n", employee.getTelepules());
            System.out.printf("Cím: %s\n", employee.getCim());
            System.out.printf("Születés: %s\n", employee.getSzuletes());
            System.out.printf("Fizetés: %d\n", employee.getFizetes());
            System.out.println();
        }
    }
}
