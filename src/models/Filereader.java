/*
* File: Filereader.java
* Author: Ferencsik Boglárka
* Copyright: 2023, Ferencsik Boglárka
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/fbog05
* Licenc: GNU GPL
*/

package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {

    final String FILENAME = "filbt.txt";
    ArrayList<Employee> empList = new ArrayList<>();

    public ArrayList<Employee> loadData(){

        try{
            tryLoadData();
        }
        catch(FileNotFoundException e){
            System.err.println("A fájl nem található!");
            System.err.println(e.getMessage());
        }

        return empList;
    }

    public ArrayList<Employee> tryLoadData() throws FileNotFoundException{
        
        File file = new File(FILENAME);
        Scanner sc = new Scanner(file, "utf-8");

        while(sc.hasNext()){
            String[] lineArray = sc.nextLine().split(":");
            Employee emp = new Employee();
            emp.setNev(lineArray[0]);
            emp.setTelepules(lineArray[1]);
            emp.setCim(lineArray[2]);
            emp.setSzuletes(lineArray[3]);
            emp.setFizetes(Integer.parseInt(lineArray[4]));
            this.empList.add(emp);
        }

        return empList;
    }
}
