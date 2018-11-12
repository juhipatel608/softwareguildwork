/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdcollection;

import dvdcollection.controller.DVDController;
import dvdcollection.ui.*;
import dvdcollection.dao.*;
/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) {
        UserIO myIo = new UserIOImpl();
        DVDCollectionView myView = new DVDCollectionView(myIo);
        DVDCollectionDao myDao = new DVDCollectionDaoImpl();
        DVDController myController = new DVDController(myDao, myView);
        myController.run();
    }
}
