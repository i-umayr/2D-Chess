/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessproject;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import chessproject.Piece.COLOR;
import chessproject.Piece.Type;
/**
 *
 * @author emaan
 */
public class Move extends PieceLabelName{ //move movingpiece to finalposition and put if captured piece to a new hashmap or if no piece, then update hashmap accordingly
    // i  need four things to make a piece move: the moving piece itself, its initial xy cordinates, its final xy coordinates, piece at the destination if any
    private static final ArrayList<Piece> capturedset = new ArrayList<>();
    private ArrayList<String> route= new ArrayList<>();
     
    public static void makeMove(JLabel initialpos, JLabel finalpos, HashMap<String,Piece> grid){
        Piece movingpiece, capturedpiece;
        capturedpiece = grid.get(finalpos.getName()); //get piece at final location
        movingpiece= grid.get(initialpos.getName()); //got the moving piece from initiallocation            
        if ((capturedpiece.getColor()).equals(COLOR.NULL)){ //if final position has NoPiece
            //nothing
            grid.put(initialpos.getName(), new NoPiece() ); //update the grid of initiallocation
            initialpos.setText(Character.toString(' ')); //update the panel of initial location
            grid.put(finalpos.getName(), movingpiece); //put moving piece at the location in grid
            finalpos.setText(Character.toString(movingpiece.getLabel())); //put moving piece label at that position in panel
        } else{ //if there exists a piece at final location
            capturedset.add(capturedpiece);
            grid.put(initialpos.getName(), new NoPiece() ); //update the grid of initiallocation
            initialpos.setText(Character.toString(' ')); //update the panel of initial location
            grid.put(finalpos.getName(), movingpiece); //put moving piece at the location in grid
            finalpos.setText(Character.toString(movingpiece.getLabel())); //put moving piece label at that position in panel
        }
    }
    
    
    
    

public boolean isCheck( JPanel[][] mainpanel,HashMap<String,Piece> grid, COLOR color){ //i need king as destination, iterate over hashmap of only those pieces which are opposite in color,
    String kinglocation;
    int x=0,y=0;
    int i,j;
    boolean flag=false;
    for (Map.Entry mapElement: grid.entrySet()){ //getting king's location
            String key = (String)mapElement.getKey();
            Piece value = ((Piece)mapElement.getValue());
            if (value.getType().equals(Type.KING)&& (value.getColor().equals(color))){
                kinglocation = key;
                x = Character.getNumericValue((kinglocation).charAt(0));
                y = Character.getNumericValue((kinglocation).charAt(2));
                System.out.println("got" + color+" king's location");
                break;
            }
                
    }
    for (Map.Entry mapElement : grid.entrySet()) { //iterating again 
            String key = (String)mapElement.getKey();
            Piece value = ((Piece)mapElement.getValue());
            if (color.equals(value.getColor())){ //if same color, pass
            }else{
                i = Character.getNumericValue((key).charAt(0)); 
                j = Character.getNumericValue((key).charAt(2));
                value.validateMove(grid, mainpanel, key, i, j); //go through all moves of opponent pieces
                if (mainpanel[x][y].getBackground().equals(new Color(95, 148, 148))){ //if any piece makes king's destination blue, it is attacking piece
                    System.out.println(value.getType() + "is attacking piece"); 
                    checkRoute(i,j,x,y,value); // get route of that attacking piece
                    System.out.println(route+ "after calling method");
                    flag = true;
                    break;
                }
            }
    }
    BoardGUI.ColorsReset(mainpanel); //remove the blue bg to prevent confusion
    return flag;
}




public void checkRoute(int x, int y, int i, int j, Piece piece){ //i,j are king's location, and x,y are piece's. 
    route.clear();
    if ((piece.getType().equals(Type.KNIGHT))|(piece.getType().equals(Type.PAWN))){
        route.add(String.valueOf(x)+ "."+ String.valueOf(y));
    } 
    if (piece.getType().equals(Type.BISHOP)){
        if (j>y){
            if (i>x){
                for (int q=0; x+q<i && y+q<j;q++){
                  route.add(String.valueOf(x+q) + "." + String.valueOf(y+q));  
                }
            }else{
                for (int q=0; x-q>i && y+q<j;q++){
                route.add(String.valueOf(x-q) + "." + String.valueOf(y+q));
                }
            }
        }else{
            if (i>x){
                for (int q=0; x+q<i && y-q>j;q++){
                    route.add(String.valueOf(x+q) + "." + String.valueOf(y-q)); 
                }
            }else{
                 for (int q=0; x-q>i && y-q>j;q++){
                    route.add(String.valueOf(x+q) + "." + String.valueOf(y-q)); 
                 }
            }
        }
    }
    if (piece.getType().equals(Type.ROOK)){
        if (j==y){
            if (i>x){
                for (int q=0; x+q<i;q++){
                  route.add(String.valueOf(x+q) + "." + String.valueOf(y));  
                }
            }else{
                for (int q=0; x-q>i;q++){
                route.add(String.valueOf(x-q) + "." + String.valueOf(y));
                }
            }
        }else if (i==x){
            if (j>y){
                for (int q=0;y+q<j;q++){
                    route.add(String.valueOf(x) + "." + String.valueOf(y+q)); 
                }
            }else{
                 for (int q=0;y-q>j;q++){
                    route.add(String.valueOf(x) + "." + String.valueOf(y-q)); 
                 }
            }
        }
        
    }
    if (piece.getType().equals(Type.QUEEN)){ //rook + bishop
        if (j>y){
            if (i>x){
                for (int q=0; x+q<i && y+q<j;q++){
                  route.add(String.valueOf(x+q) + "." + String.valueOf(y+q));  
                }
            }else{
                for (int q=0; x-q>i && y+q<j;q++){
                route.add(String.valueOf(x-q) + "." + String.valueOf(y+q));
                }
            }
        }else{
            if (i>x){
                for (int q=0; x+q<i && y-q>j;q++){
                    route.add(String.valueOf(x+q) + "." + String.valueOf(y-q)); 
                }
            }else{
                 for (int q=0; x-q>i && y-q>j;q++){
                    route.add(String.valueOf(x+q) + "." + String.valueOf(y-q)); 
                 }
            }
        }
        if (j==y){
            if (i>x){
                for (int q=0; x+q<i;q++){
                  route.add(String.valueOf(x+q) + "." + String.valueOf(y));  
                }
            }else{
                for (int q=0; x-q>i;q++){
                route.add(String.valueOf(x-q) + "." + String.valueOf(y));
                }
            }
        }else if (i==x){
            if (j>y){
                for (int q=0;y+q<j;q++){
                    route.add(String.valueOf(x) + "." + String.valueOf(y+q)); 
                }
            }else{
                 for (int q=0;y-q>j;q++){
                    route.add(String.valueOf(x) + "." + String.valueOf(y-q)); 
                 }
            }
        }
    }
}


public ArrayList<String> getRoute(){
    return route;
}
}
    
    

 
    
    
    
    
  





  
        
