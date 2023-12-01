import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class ChessBoard extends JApplet {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Board");
        ChessBoard chessBoard = new ChessBoard();
        frame.add(chessBoard);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        int x, y, row, column;
        for (row = 0; row < 8; row++) {
            for (column = 0; column < 8; column++) {
                x = column * 20;
                y = row * 20;
                if ((row % 2) == (column % 2))
                    g.setColor(Color.red);
                else
                    g.setColor(Color.black);
                g.fillRect(x, y, 20, 20);
            }
        }
    }
}
