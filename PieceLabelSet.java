package chessproject;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import javax.swing.*;
import chessproject.Piece.COLOR;


/**
 *
 * @author emaan
 */
public class PieceLabelSet {
    private PieceLabelName piecename;
    private JLabel piecelabel,firstpositionclick, secondpositionclick;
    private boolean playerturn; //false for white,true for black
    private int x,y; //tile's position number
    private static final HashMap<String,Piece> chessgrid = new HashMap<>();
    private int click;
    private Move methods = new Move();
 
    public void setPieceLabel(JPanel[][] wholepanel,JPanel tile){
        
        piecename = new PieceLabelName();
        piecelabel = new JLabel("");
        piecelabel.setName(tile.getName()); //since action listener on labels, we name the labels same as the panel tile.
        click=1;
        x = Character.getNumericValue((tile.getName()).charAt(0));
        y = Character.getNumericValue((tile.getName()).charAt(2));
        if (x == 0) {

					switch (y) {
					case 0:
                                        case 7:
                                            chessgrid.put(tile.getName(), new Rook(COLOR.BLACK,piecename.getBLACKROOK()));
                                            piecelabel.setText(Character.toString(piecename.getBLACKROOK()));
						break;

					case 1:
					case 6:
                                            chessgrid.put(tile.getName(), new Knight(COLOR.BLACK,piecename.getBLACKKNIGHT()));
                                            piecelabel.setText(Character.toString(piecename.getBLACKKNIGHT()));
						break;

					case 2:
					case 5:
					    chessgrid.put(tile.getName(), new Bishop(COLOR.BLACK,piecename.getBLACKBISHOP()));
                                            piecelabel.setText(Character.toString(piecename.getBLACKBISHOP()));
						break;

					case 3:
					    chessgrid.put(tile.getName(), new Queen(COLOR.BLACK,piecename.getBLACKQUEEN()));
                                            piecelabel.setText(Character.toString(piecename.getBLACKQUEEN()));
						break;

					case 4:
					    chessgrid.put(tile.getName(), new King(COLOR.BLACK,piecename.getBLACKKING()));
                                            piecelabel.setText(Character.toString(piecename.getBLACKKING()));
						break;
					}
        } else if (x == 7) {

					switch (y) {

					case 0:
					case 7:
					chessgrid.put(tile.getName(), new Rook(COLOR.WHITE,piecename.getWHITEROOK()));
                                        piecelabel.setText(Character.toString(piecename.getWHITEROOK()));
						break;

					case 1:
					case 6:
					chessgrid.put(tile.getName(), new Knight(COLOR.WHITE,piecename.getWHITEKNIGHT()));
                                        piecelabel.setText(Character.toString(piecename.getWHITEKNIGHT()));
						break;

					case 2:
					case 5:
                                        chessgrid.put(tile.getName(), new Bishop(COLOR.WHITE,piecename.getWHITEBISHOP()));
                                        piecelabel.setText(Character.toString(piecename.getWHITEBISHOP()));
						break;

					case 3:
					chessgrid.put(tile.getName(), new Queen(COLOR.WHITE,piecename.getWHITEQUEEN()));
                                        piecelabel.setText(Character.toString(piecename.getWHITEQUEEN()));
						break;

					case 4:
					chessgrid.put(tile.getName(), new King(COLOR.WHITE,piecename.getWHITEKING()));
                                        piecelabel.setText(Character.toString(piecename.getWHITEKING()));
						break;
					}
				} else if (x == 1) {
					chessgrid.put(tile.getName(), new Pawn(COLOR.BLACK,piecename.getBLACKPAWN()));
                                        piecelabel.setText(Character.toString(piecename.getBLACKPAWN()));
				} else if (x == 6) {
					chessgrid.put(tile.getName(), new Pawn(COLOR.WHITE,piecename.getWHITEPAWN()));
                                        piecelabel.setText(Character.toString(piecename.getWHITEPAWN()));
				} else {
					chessgrid.put(tile.getName(), new NoPiece());
                                        piecelabel.setText(Character.toString(' '));
				}
        piecelabel.setFont(new Font("Serif", Font.PLAIN, 80));
        tile.add(piecelabel);
        
        piecelabel.addMouseListener(new MouseAdapter(){
            @Override
			public void mouseClicked(MouseEvent e) {
                            Piece piececlicked;
                            //check if first click or second click (click variable)
                            //if first click then call a colors reset method first. showing possible pathways for piece clicked
                            //check what piece clicked by e.getsource() and downcasting it to label
                            if (click ==2){
                                secondpositionclick = (JLabel)e.getSource();
                                int finalx = Character.getNumericValue((secondpositionclick.getName()).charAt(0));
                                int finaly = Character.getNumericValue((secondpositionclick.getName()).charAt(2));
                                System.out.println(wholepanel[5][5].getBackground()+ "in second if condition");
                                if ((wholepanel[finalx][finaly].getBackground()).equals(new Color(95, 148, 148))){
                                    //i can pass x,y,finalx,finaly, firstposition.getname, secondposition.getname
                                    Move.makeMove(firstpositionclick, secondpositionclick, chessgrid);
                                    playerturn= !playerturn; //swap turns
                                    click=1;
                                }else{
                                   click=1;
                                }
                            }
                                                      
                            
                           // boolean check=false;
                            if (click==1){
                                System.out.println(click);
                                BoardGUI.ColorsReset(wholepanel);
                                firstpositionclick = (JLabel)e.getSource();
                                x = Character.getNumericValue((firstpositionclick.getName()).charAt(0));
                                y = Character.getNumericValue((firstpositionclick.getName()).charAt(2));
                                piececlicked = chessgrid.get(firstpositionclick.getName());
                                if (playerturn == false){
                                    if (piececlicked.getColor().equals(COLOR.WHITE)){ //if move puts king in check
                                        System.out.println("getting moves for our clicked piece");
                                        if (methods.isCheck(wholepanel, chessgrid, COLOR.WHITE)){ //when king in check
                                            System.out.println("white king in check");
                                            System.out.println(methods.getRoute());
                                            for (String route:methods.getRoute()){
                                                System.out.println("checking route"+ route);
                                                piececlicked.validateMove(chessgrid,wholepanel,firstpositionclick.getName(), route, x, y);
                                                //break;
                                                
                                            }
                                            //BoardGUI.ColorsReset(wholepanel);
                                            click=2;
                                        }else{ //when king not in check
                                        
                                        chessgrid.put(firstpositionclick.getName(), new NoPiece()); //assume null piece on that location
                                        if (methods.isCheck(wholepanel, chessgrid,piececlicked.getColor())){ //then calculate check again, if true
                                        System.out.println("Can't move or king in check."); //validate move not added so that no move for that piece
                                        chessgrid.put(firstpositionclick.getName(),piececlicked); //piece put back in place
                                        }else{ //all moves
                                        chessgrid.put(firstpositionclick.getName(),piececlicked);
                                        piececlicked.validateMove(chessgrid,wholepanel,firstpositionclick.getName(),x,y); //polymorphism
                                        click=2;
                                        }
                                    }
                                    }
                                }else {
                                        if (piececlicked.getColor().equals(COLOR.BLACK)){ //if move puts king in check
                                        System.out.println("getting moves for our clicked piece");
                                        if (methods.isCheck(wholepanel, chessgrid, COLOR.BLACK)){ //when king in check
                                            System.out.println("black king in check");
                                            System.out.println(methods.getRoute());
                                            for (String route:methods.getRoute()){
                                                System.out.println("checking route"+ route);
                                                piececlicked.validateMove(chessgrid,wholepanel,firstpositionclick.getName(), route, x, y);
                                                    //break;
                                                
                                            }
                                            //BoardGUI.ColorsReset(wholepanel);
                                            click=2;
                                        }else{ //when king not in check
                                        
                                        chessgrid.put(firstpositionclick.getName(), new NoPiece()); //assume null piece on that location
                                        if (methods.isCheck(wholepanel, chessgrid,piececlicked.getColor())){ //then calculate check again, if true
                                        System.out.println("Can't move or king in check."); //validate move not added so that no move for that piece
                                        chessgrid.put(firstpositionclick.getName(),piececlicked); //piece put back in place
                                        }else{ //all moves
                                        chessgrid.put(firstpositionclick.getName(),piececlicked);
                                        piececlicked.validateMove(chessgrid,wholepanel,firstpositionclick.getName(),x,y); //polymorphism
                                        click=2;
                                        }
                                    }
                                    }
                                }
                            }
                        }
        });
    }
}
       
