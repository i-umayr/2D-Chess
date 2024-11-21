package chessproject;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emaan
 */
public class BoardGUI extends JFrame{
	private JPanel outerchesspanel = new JPanel(); //outerchessapanel just arranges them into a grid
	private JPanel chesspanel[][] = new JPanel[8][8]; //chesspanel will keep trac
	PieceLabelSet labelset = new PieceLabelSet();
        

	public BoardGUI() {
		super("Chess");

		outerchesspanel.setLayout(new GridLayout(8, 8));

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chesspanel[i][j] = new JPanel(new BorderLayout());
				chesspanel[i][j].setName(i + "." + j);
                                
				// chessboard colors setup
				if ((i + j) % 2 == 0) {
					chesspanel[i][j].setBackground(Color.white);
				} else {
					chesspanel[i][j].setBackground(new Color(165,186,147));
				}

				// pieces placement
                                labelset.setPieceLabel(chesspanel, chesspanel[i][j]); //when it gets passed, we lose its position number so name is set above to retain the position number
				chesspanel[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
				outerchesspanel.add(chesspanel[i][j]);
			}
		}

		add(outerchesspanel);
		setSize(702, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
        
    public static void ColorsReset(JPanel[][] panel){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0){
                    panel[i][j].setBackground(Color.WHITE);
                }
                else
                    panel[i][j].setBackground(new Color(165,186,147));
            }
            }
    }

}
