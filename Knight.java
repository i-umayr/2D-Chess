/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessproject;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author emaan
 */
public class Knight extends Piece {
    private String findlocation;

    public Knight(COLOR color, char label) {
        super(color,Type.KNIGHT,label);
    }

    @Override
    public void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour, String labelclicked, int initialx,int initialy) {
        System.out.println(labelclicked + "in knight validate move");
        Piece movingpiece = grid.get(labelclicked);
        if (initialx - 1 >= 0 && initialy + 2 < 8) {
          findlocation = String.valueOf(initialx-1) + "." + String.valueOf(initialy+2);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-1][initialy+2].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-1][initialy+2].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
          
      }
        
      if (initialx - 2 >= 0 && initialy + 1 < 8) {
          findlocation = String.valueOf(initialx-2) + "." + String.valueOf(initialy+1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-2][initialy+1].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-2][initialy+1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
      }
        
      if (initialx - 2 >= 0 && initialy - 1 >= 0) {
          findlocation = String.valueOf(initialx-2) + "." + String.valueOf(initialy-1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-2][initialy-1].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-2][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
          
      }
        
       if (initialx - 1 >= 0 && initialy - 2 >= 0) {
           findlocation = String.valueOf(initialx-1) + "." + String.valueOf(initialy-2);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-1][initialy-2].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-1][initialy-2].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
       } 
        
       if (initialx + 1 < 8 && initialy - 2 >= 0) {
            findlocation = String.valueOf(initialx+1) + "." + String.valueOf(initialy-2);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx+1][initialy-2].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx+1][initialy-2].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        if (initialx + 2 < 8 && initialy - 1 >= 0) {
            findlocation = String.valueOf(initialx+2) + "." + String.valueOf(initialy-1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx+2][initialy-1].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx+2][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        if (initialx + 2 < 8 && initialy + 1 < 8) {
            findlocation = String.valueOf(initialx+2) + "." + String.valueOf(initialy+1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx+2][initialy+1].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx+2][initialy+1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if (initialy + 2 < 8 && initialx + 1 < 8) {
            findlocation = String.valueOf(initialx+1) + "." + String.valueOf(initialy+2);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[1+initialx][2+initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[1+initialx][2+initialy].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        
    }

    @Override
    public void validateMove(HashMap<String, Piece> grid, JPanel[][] panelcolour, String knightsquare, String onechecksquare, int x, int y) {
        int i = Character.getNumericValue((onechecksquare).charAt(0)); //getting coordinates of destination square
        int j = Character.getNumericValue((onechecksquare).charAt(2));
        Piece movingpiece = grid.get(knightsquare);
        if (x - 1 == i && y + 2 == j) {
          findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
          
      }
      
      if (x - 2 == i && y + 1 == j) {
          findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
      }
        
      if (x - 2 == i && y - 1 == j) {
          findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
          
      }
        
       if (x - 1 == i && y - 2 == j) {
           findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
       } 
        
       if (x + 1== i && y - 2 == j) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        if (x + 2 == i && y - 1 == j) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        if (x + 2 == i && y + 1 == j) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if (y + 2 == j && x + 1 == i) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }  
       //BoardGUI.ColorsReset(panelcolour);
           
    }
    }
    
    
    
