import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class MyPainterMain {

	static JFrame frameMain;
	static JPanel panelCanvas;
	static JButton buttonLine;
	static JButton buttonFreehand;
	static JButton buttonSquare;
	static JButton buttonCircle;
	static JButton buttonRubber;
	static JButton buttonPen;
	static JButton buttonBlack;
	static JButton buttonWhite;
	static JButton buttonRed;
	static JButton buttonYellow;
	static JButton buttonGreen;
	static JButton buttonBlue;
	static JButton buttonPurple;
	static JButton buttonPink;
	static JButton buttonOrange;
	static JButton buttonGrey;
	//menubar
    static JMenu file;
    static JMenu edit;
    static JMenu help;
    static JMenuItem saveAction;
    static JMenuItem loadAction;
    static JMenuItem exitAction;
    static JMenuItem UndoAction;
    static JMenuItem FAQAction;
	static JMenuBar menuBar;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setupPaintGUI();

	}
	
	public static void setupPaintGUI(){
		
		frameMain = new JFrame("My Paint");
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //panel for drawing canvas
        panelCanvas = new JPanel();
        panelCanvas.setBounds(108,45,660,480);
        panelCanvas.setBorder(BorderFactory.createLineBorder(Color.black));
        panelCanvas.setBackground(Color.white);
        
        //buttons for tools
        buttonFreehand = new JButton();
        buttonFreehand.setBounds(15,45,34,34);
        
        buttonLine = new JButton();
        buttonLine.setBounds(49,45,34,34);
        
        buttonSquare = new JButton();
        buttonSquare.setBounds(15,79,34,34);
        
        buttonCircle = new JButton();
        buttonCircle.setBounds(49,79,34,34);
        
        buttonRubber = new JButton();
        buttonRubber.setBounds(15,113,34,34);
        
        buttonPen = new JButton();
        buttonPen.setBounds(49,113,34,34);
        
        //buttons for colours
        buttonBlack = new JButton();
        buttonBlack.setBounds(15,162,34,34);
        buttonBlack.setBackground(Color.black);
        
        buttonWhite = new JButton();
        buttonWhite.setBounds(49,162,34,34);
        buttonWhite.setBackground(Color.white);
        
        buttonRed = new JButton();
        buttonRed.setBounds(15,196,34,34);
        buttonRed.setBackground(Color.red);
        
        buttonYellow = new JButton();
        buttonYellow.setBounds(49,196,34,34);
        buttonYellow.setBackground(Color.yellow);
        
        buttonGreen = new JButton();
        buttonGreen.setBounds(15,230,34,34);
        buttonGreen.setBackground(Color.green);
        
        buttonBlue = new JButton();
        buttonBlue.setBounds(49,230,34,34);
        buttonBlue.setBackground(Color.blue);
        
        buttonPurple = new JButton();
        buttonPurple.setBounds(15,264,34,34);
        buttonPurple.setBackground(Color.magenta);
        
        buttonPink = new JButton();
        buttonPink.setBounds(49,264,34,34);
        buttonPink.setBackground(Color.pink);
        
        buttonOrange = new JButton();
        buttonOrange.setBounds(15,298,34,34);
        buttonOrange.setBackground(Color.orange);
        
        buttonGrey = new JButton();
        buttonGrey.setBounds(49,298,34,34);
        buttonGrey.setBackground(Color.gray);
        
        setupMenuBar();
        
        panelCanvas.setVisible(true);
        
        frameMain.add(panelCanvas);
        frameMain.add(buttonFreehand);
        frameMain.add(buttonLine);
        frameMain.add(buttonSquare);
        frameMain.add(buttonCircle);
        frameMain.add(buttonRubber);
        frameMain.add(buttonPen);
        frameMain.add(buttonBlack);
        frameMain.add(buttonWhite);
        frameMain.add(buttonRed);
        frameMain.add(buttonYellow);
        frameMain.add(buttonGreen);
        frameMain.add(buttonBlue);
        frameMain.add(buttonPurple);
        frameMain.add(buttonPink);
        frameMain.add(buttonOrange);
        frameMain.add(buttonGrey);
        
        frameMain.setSize(800, 600);
	    frameMain.setLayout(null);
	    frameMain.setResizable(false);
	    frameMain.setVisible(true);
	}
	
	public static void setupMenuBar(){
			
	        //set up menu bar on frame
	        menuBar = new JMenuBar();
	        
	        file = new JMenu("File");
	        edit = new JMenu("Edit");
	        help = new JMenu("Help");
	        
	        saveAction = new JMenuItem("Save Game");
	        loadAction = new JMenuItem("Load Game");
	        exitAction = new JMenuItem("Exit");
	        UndoAction = new JMenuItem("Undo");
	        FAQAction = new JMenuItem("FAQ");
	        
	        file.add(saveAction);
	        file.add(loadAction);
	        file.add(exitAction);
	        edit.add(UndoAction);
	        help.add(FAQAction);
	        
	        menuBar.add(file);
	        menuBar.add(edit);
	        menuBar.add(help);
	        
	        frameMain.setJMenuBar(menuBar);
	    
	}

}
