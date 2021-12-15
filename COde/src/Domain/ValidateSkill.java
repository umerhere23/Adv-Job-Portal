/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import Model.LocalDatabase;
import ui.AddSkills;

/**
 *
 * @author Umer
 */
public class ValidateSkill extends AddSkills{
    public static boolean Validateskill(final String skill){
        if(LocalDatabase.Add( skill)){
            return true;
}
    return false;
            }}
       
    

