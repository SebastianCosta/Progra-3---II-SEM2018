/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triptec.gui;

import triptec.logic.TouristSiteManager;


public class Main {
    public static void main(String[] args){
        MainWindow mainW = new MainWindow();
        TouristSiteManager TSManager = new TouristSiteManager();
        mainW.setTouristsites(TSManager);
        
        mainW.setVisible(true);
        
    }
    
}
