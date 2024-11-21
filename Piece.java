package chessproject;

import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author emaan
 */


public abstract class Piece extends Move{
    protected enum COLOR {WHITE, BLACK, NULL}
    protected enum Type {KING, ROOK, BISHOP, QUEEN, KNIGHT, PAWN, NOPIECE}    
    private final COLOR color;
    private final Type type;
    private char label;

    public Piece(COLOR color, Type type, char label) {
        this.color = color;
        this.type=type;
        this.label=label;
    }
    
    public COLOR getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }
    
    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public abstract void validateMove(HashMap<String,Piece> grid, JPanel[][] panel,String labelclicked,int x,int y);
    public abstract void validateMove(HashMap<String,Piece> grid,JPanel[][] panelcolour,String piecesquare, String onechecksquare, int x, int y);
 }
