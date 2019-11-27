/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leulinsonlinepharmacyui;

import java.util.ArrayList;
import java.util.List;
import onlinepurchase.*;

/**
 *
 * @author eulinle_sd2022
 */
public class storage {

    List<MedicinesForCough> medForCough = new ArrayList<>();
    List<MedicinesForHeadache> medForHeadache = new ArrayList<>();
    List<MedicinesForBodyPain> medForBodyPain = new ArrayList<>();
    List<MedicinesForAllergies> medForAllergies = new ArrayList<>();
    Pharmacist pharma = new Pharmacist("Lealyn", "Eulin");
    ArrayList<Orders> orderList = new ArrayList<>();
    ArrayList<User> userList = new ArrayList<>();

    public storage() {
        userList.add(new Adult(1, "LEulin", "Simple", 19));
        userList.add(new Adult(2, "Kokoy", "12345", 19));
        userList.add(new Senior(3, "Pong", "pn123", 62));
    }

//    public void addInfo(){
//        userList.add(new Adult(1, "LEulin", "Simple", 19));
//        userList.add(new Adult(2, "Kokoy", "12345", 19));
//        a.getUserList().add(new Senior(3, "Pong", "pn123", 62));
//        a.getMedForBodyPain().add(new MedicinesForBodyPain(1, "Alaxan", "Ibuprofen", "Body Pain", 8.25, 100));
//        a.getMedForBodyPain().add(new MedicinesForBodyPain(2, "Rexidol", "Paracetamol", "Body Pain", 15.50, 75));
//        a.getMedForBodyPain().add(new MedicinesForBodyPain(3, "Medicol", "Ibuprofen", "Body Pain", 6.00, 100));
//        a.getMedForAllergies().add(new MedicinesForAllergies(1, "Allerkid", "Cetirizine", "Allergies", 8, 50));
//        a.getMedForAllergies().add(new MedicinesForAllergies(2, "Allerta", "Loratadine", "Allergies", 16, 50));
//        a.getMedForAllergies().add(new MedicinesForAllergies(3, "Allerta", "Mometasone", "Allergies", 24, 50));
//        a.getMedForCough().add(new MedicinesForCough(1, "Solmux", "Carbocisteine", "Cough", 17, 50));
//        a.getMedForCough().add(new MedicinesForCough(2, "Myracof", "Ambroxol", "Cough", 22, 50));
//        a.getMedForCough().add(new MedicinesForCough(3, "Expel OD", "Ambroxol", "Cough", 29, 50));
//        a.getMedForHeadache().add(new MedicinesForHeadache(1, "Biogesic 325", "Paracetamol", "Headache", 6, 50));
//        a.getMedForHeadache().add(new MedicinesForHeadache(2, "Biogesic", "Paracetamol", "Headache", 8, 50));
//        a.getMedForHeadache().add(new MedicinesForHeadache(3, "Fevertab", "Paracetamol", "Headache", 5, 50));
//        a.getOrderList().add(new Orders(1, 1, 1, "Body Pain", 4, 33));
//        a.getOrderList().add(new Orders(2, 3, 2, "Body Pain", 6, 50));
//        a.getOrderList().add(new Orders(3, 2, 2, "Headache", 6, 40));
//
//    }
    public List<MedicinesForCough> getMedForCough() {
        return medForCough;
    }

    public void setMedForCough(List<MedicinesForCough> medForCough) {
        this.medForCough = medForCough;
    }

    public List<MedicinesForHeadache> getMedForHeadache() {
        return medForHeadache;
    }

    public void setMedForHeadache(List<MedicinesForHeadache> medForHeadache) {
        this.medForHeadache = medForHeadache;
    }

    public List<MedicinesForBodyPain> getMedForBodyPain() {
        return medForBodyPain;
    }

    public void setMedForBodyPain(List<MedicinesForBodyPain> medForBodyPain) {
        this.medForBodyPain = medForBodyPain;
    }

    public List<MedicinesForAllergies> getMedForAllergies() {
        return medForAllergies;
    }

    public void setMedForAllergies(List<MedicinesForAllergies> medForAllergies) {
        this.medForAllergies = medForAllergies;
    }

    public Pharmacist getPharma() {
        return pharma;
    }

    public void setPharma(Pharmacist pharma) {
        this.pharma = pharma;
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Orders> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public static void main(String args[]) {
    }

}
