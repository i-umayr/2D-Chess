/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessproject;

/**
 *
 * @author emaan
 */
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

public class Bishop extends Piece{
    private String findlocation;
    
    public Bishop(COLOR color,char label){
        super(color, Type.BISHOP,label); //passed desginated color and type to piece
    }
    
    @Override
    public void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour, String labelclicked, int initialx,int initialy) {
        Piece movingpiece = grid.get(labelclicked);
        label:
        for (int i=1; initialx+i<8 && initialy+i<8;i++){
            findlocation = String.valueOf(initialx+i) + "." + String.valueOf(initialy+i);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx+i][initialy+i].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[i+initialx][i+initialy].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                            }
            }
        }
        label: 
      for (int i=1; initialx-i>=0 && initialy+i<8;i++){  
          findlocation = String.valueOf(initialx-i) + "." + String.valueOf(initialy+i);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-i][initialy+i].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-i][initialy+i].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                    
                }
            }
      }
        label:
         for (int i=1; initialx-i>=0 && initialy-i>=0;i++){  
          findlocation = String.valueOf(initialx-i) + "." + String.valueOf(initialy-i);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-i][initialy-i].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-i][initialy-i].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                    
                }
            }
         }
        label:
       for (int i=1; initialx+i<8 && initialy-i>=0;i++){  
          findlocation = String.valueOf(initialx+i) + "." + String.valueOf(initialy-i);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx+i][initialy-i].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx+i][initialy-i].setBackground(new Color(95, 148, 148));
                        break label;
                    } else{
                        break label;
                    }
                    
                }
            }
       }
        }

    @Override
    public void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour,String bishopsquare, String onechecksquare, int x, int y) {
       //checks if particular square comes in path of bishop.  if it does, it turns those squares blue, and returns true
       int i = Character.getNumericValue((onechecksquare).charAt(0)); //getting coordinates of destination square.
       int j = Character.getNumericValue((onechecksquare).charAt(2));
       Piece movingpiece = grid.get(bishopsquare);
       if (j>y){
           if (i>x){
               if (i-x==j-y){
                   label:
                   for (int q=1; x+q<=i && y+q<=j;q++){
                   findlocation = String.valueOf(x+q) + "." + String.valueOf(y+q);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x+q][y+q].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x+q][y+q].setBackground(new Color(95, 148, 148));
                               System.out.println("Setting bacground blue on attacking bishop");
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }
               }     
           }else{
               if (x-i==j-y){
                   label:
                   for (int q=1; x-q>=i && y+q<=j;q++){
                   findlocation = String.valueOf(x-q) + "." + String.valueOf(y+q);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x-q][y+q].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x-q][y+q].setBackground(new Color(95, 148, 148));
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }
               } 
               
           }
       }else{
           if (i>x){
               if (i-x==y-j){
                   label:
                   for (int q=1; x+q<=i && y-q>=j;q++){
                   findlocation = String.valueOf(x+q) + "." + String.valueOf(y-q);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x+q][y-q].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x+q][y-q].setBackground(new Color(95, 148, 148));
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }
               }  
               
           }else{
               if (x-i==y-j){
                   label:
                   for (int q=1; x-q>=i && y-q>=j;q++){
                   findlocation = String.valueOf(x-q) + "." + String.valueOf(y-q);
                   for (Map.Entry mapElement : grid.entrySet()) {
                       String key = (String)mapElement.getKey();
                       Piece value = (Piece)mapElement.getValue();
                       if (key.equals(findlocation)){
                           if (value.getLabel()==' '){
                               panelcolour[x-q][y-q].setBackground(new Color(95, 148, 148));
                           } else if (!(value.getColor()).equals(movingpiece.getColor())){
                               panelcolour[x-q][y-q].setBackground(new Color(95, 148, 148));
                               break label;
                           } else{
                               break label;
                           }
                       }
                   }
                   }
               }
               
           }
       }        
    }
}


    