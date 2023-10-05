/*
* File: Employee.java
* Author: Ferencsik Boglárka
* Copyright: 2023, Ferencsik Boglárka
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/fbog05
* Licenc: GNU GPL
*/

package models;

public class Employee {
    String nev;
    String telepules;
    String cim;
    String szuletes;
    int fizetes;

    public String getNev(){
        return nev;
    }

    public void setNev(String nev){
        this.nev = nev;
    }

    public String getTelepules(){
        return telepules;
    }

    public void setTelepules(String telepules){
        this.telepules = telepules;
    }

   public String getCim(){
    return cim;
   }

   public void setCim(String cim){
    this.cim = cim;
   }

   public String getSzuletes(){
    return szuletes;
   }

   public void setSzuletes(String szuletes){
    this.szuletes = szuletes;
   }

   public int getFizetes(){
    return fizetes;
   }

   public void setFizetes(int fizetes){
    this.fizetes = fizetes;
   }
}
