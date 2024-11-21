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
public class Pawn extends Piece {
   private String findlocation;

    public Pawn(COLOR color,char label) {
        super(color,Type.PAWN,label);
    }
    @Override
    public void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour, String labelclicked, int initialx,int initialy) {
        Piece movingpiece = grid.get(labelclicked);
        if (movingpiece.getColor().equals(COLOR.BLACK)){
        if (initialx + 1 < 8 && initialy + 1 < 8) {
            findlocation = String.valueOf(1+initialx) + "." + String.valueOf(1+initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.WHITE)){
                        panelcolour[1+initialx][1+initialy].setBackground(new Color(95, 148, 148));
                        break;
                          }
                    else{
                        break;
                    }
                       
                }
            }
        }
        if (initialx + 1 < 8 && initialy - 1 >=0 ) {
            findlocation = String.valueOf(initialx+1) + "." + String.valueOf(initialy-1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.WHITE)){
                        panelcolour[initialx+1][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                          }
                    else{
                        break;
                    }
                }
            }
        }
        
        if (initialx==1){
            int i=1;
            label:
            while (i!=3){
                findlocation = String.valueOf(initialx+i) + "." + String.valueOf(initialy);
                for (Map.Entry mapElement : grid.entrySet()) {
                    String key = (String)mapElement.getKey();
                    Piece value = (Piece)mapElement.getValue();
                    if (key.equals(findlocation)){
                        if (value.getLabel()==' '){
                        panelcolour[initialx+i][initialy].setBackground(new Color(95, 148, 148));}
                        else
                            break label;
                          }
                }
                i+=1;
            }    
        }else{
            if (initialx!=7|initialx!=0){
            findlocation = String.valueOf(initialx+1) + "." + String.valueOf(initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx+1][initialy].setBackground(new Color(95, 148, 148));
                        break;
                          }
                }   
            }
            }
        }
        
    }
        
    if (movingpiece.getColor().equals(COLOR.WHITE)){
        if (initialx - 1 >=0 && initialy + 1 <8) {
            findlocation = String.valueOf(initialx-1) + "." + String.valueOf(initialy+1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.BLACK)){
                        panelcolour[initialx-1][initialy+1].setBackground(new Color(95, 148, 148));
                        break;
                          }
                }
            }
        }
        if (initialx - 1 >= 0 && initialy - 1 >= 0) {
            findlocation = String.valueOf(initialx-1) + "." + String.valueOf(initialy-1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.BLACK)){
                        panelcolour[initialx-1][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                          }
                }
            }
        }
        if (initialx==6){
            int i=1;
            label:
            while (i!=3){
                findlocation = String.valueOf(initialx-i) + "." + String.valueOf(initialy);
                for (Map.Entry mapElement : grid.entrySet()) {
                    String key = (String)mapElement.getKey();
                    Piece value = (Piece)mapElement.getValue();
                    if (key.equals(findlocation)){
                        if (value.getLabel()==' '){
                        panelcolour[initialx-i][initialy].setBackground(new Color(95, 148, 148));
                        }else
                            break label;
                          }
                }
                i+=1;
            }    
        }else{
            findlocation = String.valueOf(initialx-1) + "." + String.valueOf(initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-1][initialy].setBackground(new Color(95, 148, 148));
                        break;
                          }
                }   
            }
        }
    }    
    
        
    } 

    @Override
    public void validateMove(HashMap<String, Piece> grid, JPanel[][] panelcolour, String pawnsquare, String onechecksquare, int x, int y) {
        int i = Character.getNumericValue((onechecksquare).charAt(0)); //getting coordinates of destination square.
        int j = Character.getNumericValue((onechecksquare).charAt(2));
        Piece movingpiece = grid.get(pawnsquare);
        if (movingpiece.getColor().equals(COLOR.BLACK)){
        if (x + 1 == i && y + 1 == j) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.WHITE)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                          }
                    else{
                        break;
                    }
                       
                }
            }
        }
        if (x + 1 == i && y - 1 ==j ) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.WHITE)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                          }
                    else{
                        break;
                    }
                }
            }
        }
        
        if (x==1){
            int q=1;
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            if (x+1==i & y==j & (grid.get(findlocation)).getType().equals(Type.NOPIECE)){
                //for (Map.Entry mapElement : grid.entrySet()) {
                   // String key = (String)mapElement.getKey();
                   // Piece value = (Piece)mapElement.getValue();
                   // if (key.equals(findlocation)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                   //  }
                }
            
            if (x+2==i & y==j & (grid.get(findlocation)).getType().equals(Type.NOPIECE)){
                panelcolour[i-1][j].setBackground(new Color(95, 148, 148));
                panelcolour[i][j].setBackground(new Color(95, 148, 148));
            }   
        }else{
            if (x!=7|x!=0){
            findlocation = String.valueOf(x+1) + "." + String.valueOf(y);
            if (x+1==i & y==j & (grid.get(findlocation)).getType().equals(Type.NOPIECE)){
                //for (Map.Entry mapElement : grid.entrySet()) {
                   // String key = (String)mapElement.getKey();
                   // Piece value = (Piece)mapElement.getValue();
                   // if (key.equals(findlocation)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                   //  }
                }
            }
        }
        
    }
        
    if (movingpiece.getColor().equals(COLOR.WHITE)){
        if (x - 1 ==i && y + 1 ==j) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.BLACK)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                          }
                }
            }
        }
        if (x - 1 == i && y - 1 == j) {
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if ((value.getColor()).equals(COLOR.BLACK)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                        break;
                          }
                }
            }
        }
        if (x==6){
            findlocation = String.valueOf(i) + "." + String.valueOf(j);
            if (x-1==i & y==j & (grid.get(findlocation)).getType().equals(Type.NOPIECE)){
                //for (Map.Entry mapElement : grid.entrySet()) {
                   // String key = (String)mapElement.getKey();
                   // Piece value = (Piece)mapElement.getValue();
                   // if (key.equals(findlocation)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                   //  }
                }
            
            if (x-2==i & y==j & (grid.get(findlocation)).getType().equals(Type.NOPIECE)){
                panelcolour[i+1][j].setBackground(new Color(95, 148, 148));
                panelcolour[i][j].setBackground(new Color(95, 148, 148));
            }   
        }else{
            if (x!=7|x!=0){
            findlocation = String.valueOf(i) + "." + String.valueOf(y);
            if (x-1==i & y==j & (grid.get(findlocation)).getType().equals(Type.NOPIECE)){
                //for (Map.Entry mapElement : grid.entrySet()) {
                   // String key = (String)mapElement.getKey();
                   // Piece value = (Piece)mapElement.getValue();
                   // if (key.equals(findlocation)){
                        panelcolour[i][j].setBackground(new Color(95, 148, 148));
                   //  }
                }
            }
        }
    }
        
        
        
        
        
        
    }
    }

    