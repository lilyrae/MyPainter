import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.BorderFactory;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
	static JCheckBox checkboxFill;
    
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
	static String tool ="Draw";
	static boolean isFilled = true;
	
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
        ActionListener toolListener = new ActionListener() {
	          public void actionPerformed(ActionEvent e){
	        	  tool= ((JButton)e.getSource()).getName();
	        	  System.out.println(tool);
	          }
	          };
	          
        //icons for buttons
	    Icon freehandIcon = new ImageIcon("paint_images/curvedline.png");
	    Icon lineIcon = new ImageIcon("paint_images/straightline.gif");
	    Icon squareIcon = new ImageIcon("paint_images/square.png");
	    Icon circleIcon = new ImageIcon("paint_images/circle.png");
	    Icon rubberIcon = new ImageIcon("paint_images/rubber.png");
	    Icon penIcon = new ImageIcon("paint_images/pen.jpg");
	    
        buttonFreehand = new JButton(freehandIcon);
        buttonFreehand.setName("Draw");
        buttonFreehand.setBounds(15,45,34,34);
        buttonFreehand.addActionListener(toolListener);
        
        buttonLine = new JButton(lineIcon);
        buttonLine.setName("Line");
        buttonLine.setBounds(49,45,34,34);
        buttonLine.addActionListener(toolListener);
        
        buttonSquare = new JButton(squareIcon);
        buttonSquare.setName("Square");
        buttonSquare.setBounds(15,79,34,34);
        buttonSquare.addActionListener(toolListener);
        
        buttonCircle = new JButton(circleIcon);
        buttonCircle.setName("Circle");
        buttonCircle.setBounds(49,79,34,34);
        buttonCircle.addActionListener(toolListener);
        
        buttonRubber = new JButton(rubberIcon);
        buttonRubber.setName("Rubber");
        buttonRubber.setBounds(15,113,34,34);
        buttonRubber.addActionListener(toolListener);
        
        buttonPen = new JButton(penIcon);
        buttonPen.setName("Pen");
        buttonPen.setBounds(49,113,34,34);
        buttonPen.addActionListener(toolListener);
        
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
        
        //checkbox for filled shapes
        checkboxFill = new JCheckBox("Fill");
        checkboxFill.setBounds(85,90, 20, 20);
        checkboxFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	isFilled = checkboxFill.isSelected();
            }
        });
        
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
        frameMain.add(checkboxFill);
        
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
	        
	        saveAction = new JMenuItem("Save");
	        loadAction = new JMenuItem("Load");
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
	
	ArrayList<Point> a_p_pen = new ArrayList<Point>();
	ArrayList<Color> a_c_pen = new ArrayList<Color>();
	ArrayList<Integer> a_i_pen = new ArrayList<Integer>();
	
	ArrayList<Point> a_p_rubber = new ArrayList<Point>();
	ArrayList<Integer> a_i_rubber = new ArrayList<Integer>();
	
	ArrayList<Point> Line_p1 = new ArrayList<Point>();
	ArrayList<Point> Line_p2 = new ArrayList<Point>();
	ArrayList<Color> Line_c = new ArrayList<Color>();
	
	ArrayList<Point> Square_p1 = new ArrayList<Point>();
	ArrayList<Point> Square_p2 = new ArrayList<Point>();
	ArrayList<Color> Square_c = new ArrayList<Color>();
	
	ArrayList<Point> Circle_p1 = new ArrayList<Point>();
	ArrayList<Point> Circle_p2 = new ArrayList<Point>();
	ArrayList<Color> Circle_c = new ArrayList<Color>();
	
	boolean is_clicked = false;
	int id_click = -1;
	
	public PanelPaint(){
		setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.white);
		//setBounds(108,45,660,480);
		
		addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent event) {
            	
            	if(MyPainterMain.tool.equals("Draw")){
	            	if(is_clicked){
	            		repaint();
	            		a_p.add(new Point(event.getX(), event.getY()));
	            		a_c.add(MyPainterMain.g_color);
	            		a_i.add(id_click);
	            		repaint();
	            	}

            	}
            	
            	if(MyPainterMain.tool.equals("Line")){
	            	if(is_clicked){
	            		repaint();
	            		Line_p2.set(Line_p2.size()-1, new Point(event.getX(), event.getY()));
	            		repaint();
	            	}

            	}
            	
            	if(MyPainterMain.tool.equals("Square")){
	            	if(is_clicked){
	            		repaint();
	            		Square_p2.set(Square_p2.size()-1, new Point(event.getX(), event.getY()));
	            		repaint();
	            	}

            	}
            	
            	if(MyPainterMain.tool.equals("Circle")){
	            	if(is_clicked){
	            		repaint();
	            		Circle_p2.set(Circle_p2.size()-1, new Point(event.getX(), event.getY()));
	            		repaint();
	            	}

            	}
            	
            	if(MyPainterMain.tool.equals("Pen")){
	            	if(is_clicked)	
	            	{
	            		repaint();
	            		a_p_pen.add(new Point(event.getX(), event.getY()));
	            		a_c_pen.add(MyPainterMain.g_color);
	            		a_i_pen.add(id_click);
	            		repaint();
	            	}

            	}
            	
            	if(MyPainterMain.tool.equals("Rubber")){
	            	if(is_clicked)	
	            	{
	            		repaint();
	            		a_p_rubber.add(new Point(event.getX(), event.getY()));
	            		a_i_rubber.add(id_click);
	            		repaint();
	            	}

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
        	
        	is_clicked = true;
        	
        	id_click++;
        	
        	if(MyPainterMain.tool.equals("Line")){
        			
        		Line_p1.add(new Point(event.getX(), event.getY()));
        		Line_p2.add(new Point(event.getX(), event.getY()));
        		Line_c.add(MyPainterMain.g_color);
	        	
        	}
        	
        	if(MyPainterMain.tool.equals("Square")){
    			
        		Square_p1.add(new Point(event.getX(), event.getY()));
        		Square_p2.add(new Point(event.getX(), event.getY()));
        		Square_c.add(MyPainterMain.g_color);
	        	
        	}
        	
        	if(MyPainterMain.tool.equals("Circle")){
    			
        		Circle_p1.add(new Point(event.getX(), event.getY()));
        		Circle_p2.add(new Point(event.getX(), event.getY()));
        		Circle_c.add(MyPainterMain.g_color);
	        	
        	}
        	
        	if(MyPainterMain.tool.equals("Draw")){
        		
	        	a_p.add(new Point(event.getX(), event.getY()));
	    		a_c.add(MyPainterMain.g_color);
	    		a_i.add(id_click);
	    		repaint();
        	}
        	
        	if(MyPainterMain.tool.equals("Pen")){
        		
	        	a_p_pen.add(new Point(event.getX(), event.getY()));
	    		a_c_pen.add(MyPainterMain.g_color);
	    		a_i_pen.add(id_click);
	    		repaint();
        	}
        	
        	if(MyPainterMain.tool.equals("Rubber")){
        		
	        	a_p_rubber.add(new Point(event.getX(), event.getY()));
	    		a_i_rubber.add(id_click);
	    		repaint();
        	}

        }
        public void mouseReleased(MouseEvent event) {
        	is_clicked = false;
        	
        	if(MyPainterMain.tool.equals("Line"))
        		Line_p2.set(Line_p2.size()-1, new Point(event.getX(), event.getY()));
        	
        	if(MyPainterMain.tool.equals("Square"))
        		Square_p2.set(Square_p2.size()-1, new Point(event.getX(), event.getY()));
        	
        	if(MyPainterMain.tool.equals("Circle"))
        		Circle_p2.set(Circle_p2.size()-1, new Point(event.getX(), event.getY()));
        }
		@Override
		public void mouseClicked(MouseEvent event) {
			// TODO Auto-generated method stub

		}
		@Override
		public void mouseEntered(MouseEvent event) {
			// TODO Auto-generated method stub
			//tempX=event.getX();
			//tempY=event.getY();
			//repaint();
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
    
		// Paint function for POINT
        if(!a_p.isEmpty())
        {
        	g.setColor(a_c.get(0));
        	g.drawLine(a_p.get(0).x, a_p.get(0).y, a_p.get(0).x, a_p.get(0).y);
        }
        
		// Paint function for LINE
    	for(int i = 0; i < Line_p2.size(); i++){
    		g.setColor(Line_c.get(i));
    		g.drawLine(Line_p1.get(i).x, Line_p1.get(i).y, Line_p2.get(i).x, Line_p2.get(i).y);
    		repaint();  
        }
    	
    	// Paint function for SQUARE
    	for(int i = 0; i < Square_p2.size(); i++){
    		g.setColor(Square_c.get(i));
    		
    		if(MyPainterMain.isFilled)
    			g.fillRect(Square_p1.get(i).x, Square_p1.get(i).y, (Square_p2.get(i).x - Square_p1.get(i).x), (Square_p2.get(i).y - Square_p1.get(i).y));
    		else
    			g.drawRect(Square_p1.get(i).x, Square_p1.get(i).y, (Square_p2.get(i).x - Square_p1.get(i).x), (Square_p2.get(i).y - Square_p1.get(i).y));
    		
    		repaint();  
        }
    	
    	// Paint function for CIRCLE
    	for(int i = 0; i < Circle_p2.size(); i++){
    		g.setColor(Circle_c.get(i));
    		
    		if(MyPainterMain.isFilled)
    			g.fillOval(Circle_p1.get(i).x, Circle_p1.get(i).y, (Circle_p2.get(i).x - Circle_p1.get(i).x), (Circle_p2.get(i).y - Circle_p1.get(i).y));
    		else
    			g.drawOval(Circle_p1.get(i).x, Circle_p1.get(i).y, (Circle_p2.get(i).x - Circle_p1.get(i).x), (Circle_p2.get(i).y - Circle_p1.get(i).y));
    		
    		repaint();  
        }
	
		// Paint function for FREEHAND
		for(int i = 0; i < a_p.size()-1; i++){
			g.setColor(a_c.get(i));
				
			if(a_i.get(i) == a_i.get(i+1))
				g.drawLine(a_p.get(i).x, a_p.get(i).y, a_p.get(i+1).x, a_p.get(i+1).y);
			else
				g.drawLine(a_p.get(i).x, a_p.get(i).y, a_p.get(i).x, a_p.get(i).y);
			
			}
		
		// Paint function for PEN
		for(int i = 0; i < a_p_pen.size()-1; i++){
			Graphics2D g2d = (Graphics2D) g.create();
			
			g2d.setColor(a_c_pen.get(i));
			g2d.setStroke(new BasicStroke(4));
			
			if(a_i_pen.get(i) == a_i_pen.get(i+1))
				g2d.drawLine(a_p_pen.get(i).x, a_p_pen.get(i).y, a_p_pen.get(i+1).x, a_p_pen.get(i+1).y);
			else
				g2d.drawLine(a_p_pen.get(i).x, a_p_pen.get(i).y, a_p_pen.get(i).x, a_p_pen.get(i).y);
			
			}
		
		// Paint function for RUBBER
		for(int i = 0; i < a_p_rubber.size()-1; i++){
			Graphics2D g2d = (Graphics2D) g.create();
					
			g2d.setColor(Color.white);
			g2d.setStroke(new BasicStroke(10));
					
			if(a_i_rubber.get(i) == a_i_rubber.get(i+1))
				g2d.drawLine(a_p_rubber.get(i).x, a_p_rubber.get(i).y, a_p_rubber.get(i+1).x, a_p_rubber.get(i+1).y);
			else
				g2d.drawLine(a_p_rubber.get(i).x, a_p_rubber.get(i).y, a_p_rubber.get(i).x, a_p_rubber.get(i).y);
					
			}
        	
    } 

       
}

