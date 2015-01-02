import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.BorderFactory;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


public class MyPainterMain {

	static JFrame frameMain;
	static PanelPaint panelCanvas;
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
	//paint tools
	static int currentX;
	static int currentY;
	static int initialX;
	static int initialY;
	
	/**
	 * @param args
	 */
	//static boolean is_clicked = false;
	static Color g_color = Color.BLACK;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setupPaintGUI();

	}
	
	public static void setupPaintGUI(){
		
		frameMain = new JFrame("My Paint");
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //panel for drawing canvas
        panelCanvas = new PanelPaint();
        
        panelCanvas.setBounds(108,45,660,480);

        
        //buttons for tools
        buttonFreehand = new JButton();
        buttonFreehand.setBounds(15,45,34,34);
        
        buttonFreehand.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  
	    			//open the first screen	
	          }
	          });
        
        buttonLine = new JButton();
        buttonLine.setBounds(49,45,34,34);
        
        buttonLine.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  
	    			//open the first screen	
	          }
	          });
        
        buttonSquare = new JButton();
        buttonSquare.setBounds(15,79,34,34);
        
        buttonSquare.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  
	    			//open the first screen	
	          }
	          });
        
        buttonCircle = new JButton();
        buttonCircle.setBounds(49,79,34,34);
        
        buttonCircle.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  
	    			//open the first screen	
	          }
	          });
        
        buttonRubber = new JButton();
        buttonRubber.setBounds(15,113,34,34);
        
        buttonRubber.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  
	    			//open the first screen	
	          }
	          });
        
        buttonPen = new JButton();
        buttonPen.setBounds(49,113,34,34);
        
        buttonPen.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  
	    			//open the first screen	
	          }
	          });
        
        ActionListener colourListener = new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  g_color = ((JButton)e.getSource()).getBackground();
	    			
	          }
	          };
        
        //buttons for colours
        buttonBlack = new JButton();
        buttonBlack.setBounds(15,162,34,34);
        buttonBlack.setBackground(Color.black);
        buttonBlack.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonBlack.addActionListener(colourListener);
        
        buttonWhite = new JButton();
        buttonWhite.setBounds(49,162,34,34);
        buttonWhite.setBackground(Color.white);
        buttonWhite.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonWhite.addActionListener(colourListener);
        
        buttonRed = new JButton();
        buttonRed.setBounds(15,196,34,34);
        buttonRed.setBackground(Color.red);
        buttonRed.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonRed.addActionListener(colourListener);
        
        buttonYellow = new JButton();
        buttonYellow.setBounds(49,196,34,34);
        buttonYellow.setBackground(Color.yellow);
        buttonYellow.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonYellow.addActionListener(colourListener);
        
        buttonGreen = new JButton();
        buttonGreen.setBounds(15,230,34,34);
        buttonGreen.setBackground(Color.green);
        buttonGreen.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonGreen.addActionListener(colourListener);
        
        buttonBlue = new JButton();
        buttonBlue.setBounds(49,230,34,34);
        buttonBlue.setBackground(Color.blue);
        buttonBlue.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonBlue.addActionListener(colourListener);
        
        buttonPurple = new JButton();
        buttonPurple.setBounds(15,264,34,34);
        buttonPurple.setBackground(Color.magenta);
        buttonPurple.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonPurple.addActionListener(colourListener);
        
        buttonPink = new JButton();
        buttonPink.setBounds(49,264,34,34);
        buttonPink.setBackground(Color.pink);
        buttonPink.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonPink.addActionListener(colourListener);
        
        buttonOrange = new JButton();
        buttonOrange.setBounds(15,298,34,34);
        buttonOrange.setBackground(Color.orange);
        buttonOrange.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonOrange.addActionListener(colourListener);
        
        buttonGrey = new JButton();
        buttonGrey.setBounds(49,298,34,34);
        buttonGrey.setBackground(Color.gray);
        buttonGrey.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonGrey.addActionListener(colourListener);
        
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

class PanelPaint extends JPanel{
	private static final long serialVersionUID = 1L;
	
	ArrayList<Point> a_p = new ArrayList<Point>();
	ArrayList<Color> a_c = new ArrayList<Color>();
	ArrayList<Integer> a_i = new ArrayList<Integer>();
	
	boolean is_clicked = false;
	int id_click = -1;
	
	public PanelPaint(){
		setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.white);
		//setBounds(108,45,660,480);
		
		addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent event) {
            	
            	if(is_clicked)	
            	{
            		repaint();
            		a_p.add(new Point(event.getX(), event.getY()));
            		a_c.add(MyPainterMain.g_color);
            		a_i.add(id_click);
            		repaint();
            	}

               
            }


			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
        });
        
        
	 
    addMouseListener(new MouseListener() {
        public void mousePressed(MouseEvent event) {
        	
        	repaint();
        	id_click++;
        	is_clicked = true;
        	a_p.add(new Point(event.getX(), event.getY()));
    		a_c.add(MyPainterMain.g_color);
    		a_i.add(id_click);
    		repaint();
        }
        public void mouseReleased(MouseEvent event) {

        	is_clicked = false;
        }
		@Override
		public void mouseClicked(MouseEvent event) {
			/*// TODO Auto-generated method stub
        	initialX = event.getX();
        	initialY = event.getY();
            System.out.println("initialX: " + initialX + " ,initialY: "+ initialY);*/
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			is_clicked = false;
			
		}
    });

	}
	
	public Dimension getPreferredSize(){
		return new Dimension(660,480);
	}
    
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if(!a_p.isEmpty())
        {
        	g.setColor(a_c.get(0));
        	g.drawLine(a_p.get(0).x, a_p.get(0).y, a_p.get(0).x, a_p.get(0).y);
        }
        
		for(int i = 0; i < a_p.size()-1; i++){
			g.setColor(a_c.get(i));
			
			if(a_i.get(i) == a_i.get(i+1))
				g.drawLine(a_p.get(i).x, a_p.get(i).y, a_p.get(i+1).x, a_p.get(i+1).y);
			else
				g.drawLine(a_p.get(i).x, a_p.get(i).y, a_p.get(i).x, a_p.get(i).y);
			
		}

    } 

       
}

