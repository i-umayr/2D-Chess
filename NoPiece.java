/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessproject;

import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author emaan
 */
public class NoPiece extends Piece{
    
  public NoPiece() {
        this(COLOR.NULL,Type.NOPIECE, ' ');
  }
  public NoPiece(COLOR piececolor, Type piecetype, char piecelabel){
      super(piececolor,piecetype,piecelabel);
  }

    @Override
    public void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour, String labelclicked, int initialx,int initialy) {
    }

    @Override
    public void validateMove(HashMap<String, Piece> grid, JPanel[][] panelcolour, String piecesquare, String onechecksquare, int x, int y) {
    }
    
}
