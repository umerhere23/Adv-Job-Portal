/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;
import java.util.*;
import Model.LocalDatabase;
import ui.AddSkills;

/**
 *
 * @author Umer
 */
public class AddSkill extends AddSkills{
    public static boolean Addskill(final String skill){
        if(LocalDatabase.Add( skill)){
            
            return true;
}
    return false;
            }
 public static boolean Validation(String skill){
    if(skill.equals("")||skill.equals(null)||skill.equals("  "))
        return true;
     else
        return false;
    }
 public static boolean Validate(String skill){
     if(LocalDatabase.Validate(skill)){
         return true;
     }
     return false;
 }
}
       
    

