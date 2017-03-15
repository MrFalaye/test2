/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author FALAYE SEYI
 */
public class test2Class 
{
    static String studID, studName, studProgram, studAGE, studClass;

    public static String getStudID() {
        return studID;
    }

    public static void setStudID(String studID) {
        test2Class.studID = studID;
    }

    public static String getStudName() {
        return studName;
    }

    public static void setStudName(String studName) {
        test2Class.studName = studName;
    }

    public static String getStudProgram() {
        return studProgram;
    }

    public static void setStudProgram(String studProgram) {
        test2Class.studProgram = studProgram;
    }

    public static String getStudAGE() {
        return studAGE;
    }

    public static void setStudAGE(String studAGE) {
        test2Class.studAGE = studAGE;
    }

    public static String getStudClass() {
        return studClass;
    }

    public static void setStudClass(String studClass) {
        test2Class.studClass = studClass;
    }

    
    public static void testWrite() throws IOException
    {
        try(BufferedWriter myWriter = new BufferedWriter(new FileWriter("testrecord.txt",true)))
        {
        myWriter.write(getStudID() +" "+ getStudName()+" "+ getStudAGE()+" "+getStudClass()+" "+ getStudProgram());
        myWriter.newLine();
        }
    }
    
}
