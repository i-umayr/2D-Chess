package chessproject;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
/**
 *
 * @author emaan
 */
public class King extends Piece {
    private String findlocation;
    public King(COLOR color,char label) {
        super(color,Type.KING,label);
    }

    @Override
    public void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour, String labelclicked, int initialx,int initialy) {
        Piece movingpiece = grid.get(labelclicked);
        //if (methods.isCheck(panelcolour, grid, movingpiece.getColor()))
        if (initialx + 1 < 8 && initialy + 1 < 8) {
            findlocation = String.valueOf(1+initialx) + "." + String.valueOf(1+initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[1+initialx][1+initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[1+initialx][1+initialy].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if (initialx - 1 >= 0 && initialy + 1 < 8) {
            findlocation = String.valueOf(initialx-1) + "." + String.valueOf(1+initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-1][1+initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-1][1+initialy].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        if (initialx + 1 < 8 && initialy - 1 >=0) {
            findlocation = String.valueOf(1+initialx) + "." + String.valueOf(initialy-1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[1+initialx][initialy-1].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[1+initialx][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if (initialx - 1 >=0 && initialy - 1 >=0) {
            findlocation = String.valueOf(initialx-1) + "." + String.valueOf(initialy-1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-1][initialy-1].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx-1][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if (initialy + 1 < 8) {
            findlocation = String.valueOf(initialx) + "." + String.valueOf(1+initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx][1+initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx][1+initialy].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if (initialx + 1 < 8) {
            findlocation = String.valueOf(1+initialx) + "." + String.valueOf(initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[1+initialx][initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[1+initialx][initialy].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if ( initialy - 1 >= 0) {
            findlocation = String.valueOf(initialx) + "." + String.valueOf(initialy-1);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx][initialy-1].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        if (initialx - 1 >=0) {
            findlocation = String.valueOf(initialx-1) + "." + String.valueOf(initialy);
            for (Map.Entry mapElement : grid.entrySet()) {
            String key = (String)mapElement.getKey();
            Piece value = (Piece)mapElement.getValue();
                if (key.equals(findlocation)){
                    if (value.getLabel()==' '){
                        panelcolour[initialx-1][initialy].setBackground(new Color(95, 148, 148));
                    } else if (!(value.getColor()).equals(movingpiece.getColor())){
                        panelcolour[initialx][initialy-1].setBackground(new Color(95, 148, 148));
                        break;
                    } else{
                        break;
                    }
                            }
            }
        }
        
        
        
    }

    @Override
    public void validateMove(HashMap<String, Piece> grid, JPanel[][] panelcolour, String kingsquare, String onechecksquare, int x, int y) {
        int i = Character.getNumericValue((onechecksquare).charAt(0)); //getting coordinates of destination square.
        int j = Character.getNumericValue((onechecksquare).charAt(2));
        int[][] moves = {{x+1,y+1},{x+1,y-1},{x+1,y},{x-1,y+1},{x-1,y-1},{x+1,y},{x,y-1},{x,y+1}}; //direct surroundings of the king
        Piece checkpiece;
        String potentialsquare;
        Piece kingpiece = grid.get(kingsquare); //king has to AVOID the path
         for (int row = 0; row < moves.length; row++){
             //direct range kill
                 if (moves[row][0] == i & moves[row][1]==j){ //if piece is directly in king's range
                     checkpiece = grid.get(onechecksquare); //get piece on that square
                     grid.put(onechecksquare, kingpiece); //assume king on that location
                     grid.put(kingsquare, new NoPiece()); //king's position becomes empty
                     if (isCheck(panelcolour,grid,kingpiece.getColor())){ //then calculate check again, if true
                            System.out.println("king still in check if kills.");
                     }else{ //no check happens
                         panelcolour[i][j].setBackground(Color.blue); //can kill attacking piece
                     }
                     grid.put(onechecksquare,checkpiece); //piece put back in place
                     grid.put(kingsquare, kingpiece); //put king back
                 }else{ //escape, check ALL other quadrants. Other boxes can be null and check/not check, can contain same color pieces, can contain opponent pieces that dont kill
                     if (moves[row][0]>=0 & moves[row][0]<=7 & moves[row][1]>=0 & moves[row][0]<=7){
                     potentialsquare = String.valueOf(moves[row][0])+"."+String.valueOf(moves[row][1]);
                     System.out.println(potentialsquare);
                     checkpiece = grid.get(potentialsquare); //get piece on each direct square one by one
                     System.out.println(checkpiece.getType());
                     if (checkpiece.getType().equals(Type.NOPIECE)){ //if no piece on that square
                         grid.put(kingsquare, new NoPiece()); //put null in its previous position
                         grid.put(potentialsquare, kingpiece); //put king on potential null square
                         if (isCheck(panelcolour,grid,kingpiece.getColor())){ //then calculate check again, if true
                            System.out.println("king in check if moves to this null space.");
                         }else{
                             panelcolour[moves[row][0]][moves[row][1]].setBackground(Color.blue); //else set potential square to blue  
                         }
                         grid.put(kingsquare,kingpiece); //king put back in place
                         grid.put(potentialsquare, new NoPiece());// potentialsquare made empty again
                     }else{
                         if (checkpiece.getColor().equals(kingpiece.getColor())){
                             //no move if same colour
                         //if potential square has any opponent piece
                         }else{
                             grid.put(kingsquare, new NoPiece()); //put null in its previous position
                             grid.put(potentialsquare, kingpiece); //put king on potential piece square
                             if (isCheck(panelcolour,grid,kingpiece.getColor())){ //then calculate check again, if true
                                 System.out.println("king in check if moves to kill oppoonent piece to defend itself.");
                             }else{
                             panelcolour[moves[row][0]][moves[row][1]].setBackground(Color.blue); //else set potential square to blue
                         }
                           grid.put(kingsquare,kingpiece); //king put back in place
                           grid.put(potentialsquare, checkpiece);// potentialsquare filled with previous square again}e  
                     }
                     }
                 }
                 }          
         }
        
                    
    }
}