/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

/**
 *
 * @author M S I
 */
import DAO.*;
import DTO.*;
import java.util.ArrayList;

public class SubjectBUS {

    private SubjectDAO subjectDAO = new SubjectDAO();

    public ArrayList<Subject> getAllSubjects() {
        return subjectDAO.getAllSubjects();
    }

    public boolean addSubject(Subject subject) {
        for(Subject sb : subjectDAO.getAllSubjects()) {
            if(sb.getSubjectID().equals(subject.getSubjectID())) {
                return false;
            }
            if(sb.getSubjectName().equals(subject.getSubjectName())) {
                return false;
            }
        }
        if(subject.getSubjectID().isEmpty()){
            return false;
        }
        if(!subject.getSubjectID().startsWith("MH")){
            return false;
        }
        if(subject.getSubjectID().length() != 5){
            return false;
        }
        String lastThreeChars = subject.getSubjectID().substring(2);
        for (char c : lastThreeChars.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        if(subject.getSubjectName().isEmpty()){
            return false;
        }
        if(subject.getSubjectName().length() > 50){
            return false;
        }
        if(!(subject.getCoefficient() == 1 || subject.getCoefficient() == 2)){
            return false;
        }
        if(!(subject.getNumberOfLesson() >= 30 && subject.getNumberOfLesson() <= 60)){
            return false;
        }
        return subjectDAO.addSubject(subject);
    }

    public boolean deleteSubject(Subject subject) {
        ArrayList<Subject> arrSb = subjectDAO.getAllSubjects();
        if(arrSb.contains(subject)){
            return false;
        }
        return subjectDAO.deleteSubject(subject);
    }

    public boolean editSubject(Subject subject) {
        for(Subject sb : subjectDAO.getAllSubjects()) {
            if(sb.getSubjectName().equals(subject.getSubjectName())){
                return false;
            }
        }
        if(subject.getSubjectID().isEmpty()){
            return false;
        }
        if(!subject.getSubjectID().startsWith("MH")){
            return false;
        }
        if(subject.getSubjectID().length() != 5){
            return false;
        }
        String lastThreeChars = subject.getSubjectID().substring(2);
        for (char c : lastThreeChars.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        if(subject.getSubjectName().isEmpty()){
            return false;
        }
        if(subject.getSubjectName().length() > 50){
            return false;
        }
        if(!(subject.getCoefficient() == 1 || subject.getCoefficient() == 2)){
            return false;
        }
        if(!(subject.getNumberOfLesson() >= 30 && subject.getNumberOfLesson() <= 60)){
            return false;
        }
        return subjectDAO.editSubject(subject);
    }
    
    public Subject getSubjectByID(String subjectID) {
        for(Subject sb : subjectDAO.getAllSubjects()) {
            if(sb.getSubjectID().equals(subjectID)){
                return null;
            }
        }
        return subjectDAO.getSubjectByID(subjectID);
    }


    public Subject getSubjectByName(String subjectName) {
        for(Subject sb : subjectDAO.getAllSubjects()) {
            if(sb.getSubjectName().equals(subjectName)) {
                return sb;
            }
        }
        return null;
    }
}
