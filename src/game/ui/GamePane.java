package game.ui;

import game.util.KMBuffer;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;

/**
 * 
 * GamePane provides a custom container to manage all game interactions
 * and host the GameCanvas
 * @author <YOUR DETAILS HERE>
 *
 */
public class GamePane extends StackPane{
	
	//Attributes
	private GameCanvas canvas; //You need the canvas so the visitor can draw on it
	private AnimationTimer gameTimer; //Used if you want to make a game that runs at 60 frames per second
	
	/**
	 * Default constructor
	 */
	public GamePane() {
		super();
		
		//Create the canvas to draw on
		canvas = new GameCanvas();	
		//Bind the width and height so the canvas resizes with window		
		canvas.widthProperty().bind(this.widthProperty());
		canvas.heightProperty().bind(this.heightProperty());
		
		/* TODO: Construct your GamePane as you see fit */
		
		/* TODO: Do you game logic (See Animation Timer below) */
		
		/*
		 * Animation Timer 
		 * 
		 * Animation timer is only needed if you want to have a game that runs at a set frame rate (~60fps) 
		 * 
		 * You can safely remove the ApplicationTimer if you would prefer to rather implement your own 
		 * event handlers to drive your game logic (then setup your event handlers for events such as: 
		 * 			this.setOnKeyPressed();
		 * 			this.setOnKeyReleased();		
		 * 			this.setOnMouseMoved();		
		 * 			this.setOnMousePressed();
		 * 			this.setOnMouseReleased();
		 * 			this.setOnMouseEntered();
		 * 			this.setOnMouseExited();
		 * 			this.setOnMouseDragged();  )
		 * 
		 (i.e. This object V V V ) */
		gameTimer = new AnimationTimer() {

			@Override
			public void handle(long now) {
				canvas.requestFocus(); //This is important so that the canvas (with all the event handlers) intercepts the Key and Mouse events
				
				/*
				 * Do your game logic here
				 */
				
				/* 
				 * HINT: Look up AnimationTimer
				 * See: https://docs.oracle.com/javase/8/javafx/api/javafx/animation/AnimationTimer.html
				 * it provides a handle method to perform operations 
				 * roughly 60 times per second (@ 60fps)
				 * 
				 * 
				 * Note: if you use the Event Handler Code from the KMBuffer to test for events such as:
				 * 
				 * 	Key pressed: 
				 * 		KMBuffer.isKeyPressed(KeyCode.UP); //.UP is for the Up Arrow Key
				 * 		For more see: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/input/KeyCode.html */
				 System.out.println("Up arrow is pressed: " + KMBuffer.isKeyPressed(KeyCode.UP)); 
				 
				/*  Mouse in window: 
				 *  	KMBuffer.isMouseInWindow(); */
				 System.out.println("Mouse is in window: " + KMBuffer.isMouseInWindow());   
				
				/*  Mouse location: 
				 *  	KMBuffer.getMouseNodeLocation(); //OR .getMouseSceneLocation() OR .getMouseScreenLocation() (but you shouldn't really need this one) */
				 System.out.println("Mouse location relative to canvas: (" + KMBuffer.getMouseNodeLocation().getX() + "," + KMBuffer.getMouseNodeLocation().getY() + ")");   
				
				 /*  Mouse button pressed:
				 *  	KMBuffer.isLeftMousePressed();
				 *  	KMBuffer.isRightMousePressed();
				 *  	KMBuffer.isMiddleMousePressed(); */
				 System.out.println("Left mouse pressed: " + KMBuffer.isLeftMousePressed()); 
				 
				
				/* TODO: Set the GameObjects that your GameCanvas needs to draw */
				
				/* TODO: Redraw GameCanvas() */
			}
		};
		gameTimer.start();
		
		this.getChildren().add(canvas);
		
		/* TODO: Finish setting up your GamePane */
	}	
}
