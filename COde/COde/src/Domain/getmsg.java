/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import Model.LocalDatabase;

/**
 *
 * @author Umer
 */
public class getmsg {
    public static boolean addtodatabase(final String name,final String fb){
        if(LocalDatabase.addfeedback(name, fb)){
        return true;
    }
        return false;}
    
    
}
