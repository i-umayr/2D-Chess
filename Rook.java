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
public class Rook extends Piece {
    private String findlocation;

    public Rook(COLOR color,char label) {
        super(color,Type.ROOK,label);
    }

   @Override
    public void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour, String labelclicked, int initialx,int initialy) {
        Piece movingpiece = grid.get(labelclicked);
        label:
        for (int i=1; i+initialy<8;i++){
            findlocation = String.valueOf(initialx) + "." + String.valueOf(i+initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx][i+initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx][i+initialy].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                            }
            }
        }
        
        label:
      for (int i=1; initialx-i>=0;i++){  
          findlocation = String.valueOf(initialx-i) + "." + String.valueOf(initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-i][initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-i][initialy].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                    
                }
            }
      }
        label:
         for (int i=1; initialy-i>=0;i++){  
          findlocation = String.valueOf(initialx) + "." + String.valueOf(initialy-i);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx][initialy-i].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx][initialy-i].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                    
                }
            }
         }
        label:  
       for (int i=1; initialx+i<8;i++){  
          findlocation = String.valueOf(initialx+i) + "." + String.valueOf(initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx+i][initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx+i][initialy].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                    
                }
            }
       }
      
        
        
    }

    @Override
    public void validateMove(HashMap<String, Piece> grid, JPanel[][] panelcolour, String rooksquare, String onechecksquare, int x, int y) {
       int i = Character.getNumericValue((onechecksquare).charAt(0)); //getting coordinates of destination square.
       int j = Character.getNumericValue((onechecksquare).charAt(2));
       Piece movingpiece = grid.get(rooksquare);
       if (j==y){
           if (i>x){
                   label:
                   for (int q=1; x+q<=i;q++){
                   findlocation = String.valueOf(x+q) + "." + String.valueOf(y);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x+q][y].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x+q][y].setBackground(new Color(95, 148, 148));
                               System.out.println("Setting bacground blue on attacking bishop");
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }    
           }else{
                   label:
                   for (int q=1; x-q>=i;q++){
                   findlocation = String.valueOf(x-q) + "." + String.valueOf(y);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x-q][y].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x-q][y].setBackground(new Color(95, 148, 148));
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }               
           }
       }else if (x==i){
           if (j>y){
                   label:
                   for (int q=1;y+q<=j;q++){
                   findlocation = String.valueOf(x) + "." + String.valueOf(y+q);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x][y+q].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x][y+q].setBackground(new Color(95, 148, 148));
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }               
           }else{
                   label:
                   for (int q=1;y-q>=j;q++){
                   findlocation = String.valueOf(x) + "." + String.valueOf(y-q);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x][y-q].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x][y-q].setBackground(new Color(95, 148, 148));
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }
               }
       }
         //BoardGUI.ColorsReset(panelcolour);
        
        
    }
    } 
        