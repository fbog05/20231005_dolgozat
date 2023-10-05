/*
* File: MainController.java
* Author: Ferencsik Boglárka
* Copyright: 2023, Ferencsik Boglárka
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/fbog05
* Licenc: GNU GPL
*/

package controllers;

import java.util.ArrayList;

import models.Employee;
import models.Filereader;
import viewers.MainConsole;

public class MainController {
    

    public MainController(){
        Filereader filereader = new Filereader();
        ArrayList<Employee> empList = filereader.loadData();
        MainConsole.showData(empList);
    }
}
