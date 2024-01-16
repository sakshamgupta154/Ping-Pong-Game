/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponggame;

import java.awt.Canvas;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Saksham
 */




public class Pong extends Application {
    
    
    
        private static final int width =800;
        private static final int height = 600;
        private static final int PLAYER_HEIGTH = 100;
        private static final int PLAYER_WIDTH = 15;
        private static final double BALL_R =15;
        
        private int ballYSpeed =1;
        private int ballXSpeed =1;
        private double  playerOneYpos = height/2;
        private double  playerTwoYpos = height/2;
       
        private double  ballXpos = width/2;
        private double  ballYpos = height/2;
        private int scoreP1 =0;
        private int scoreP2 =0;
        
        private boolean gameStarted ;
        private int playerOneXPos = 0;
        private int playerTwoXPos = width - PLAYER_WIDTH;
        
        
  
    public void start(stage stage) throws Exception{
        
        stage.setTitle("P O N G");
        Canvas canvas;
        
            canvas = new Canvas(width , height);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
