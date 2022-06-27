package game.ui;

import game.designpatterns.RenderGameObjectVisitor;
import game.util.KMBuffer;
import javafx.scene.canvas.Canvas;
/**
 * 
 * Canvas used to render all of your GameObjects using the Visitor
 * This is the Client in the Visitor Design Pattern
 * @author <YOUR DETAILS HERE>
 *
 */
public class GameCanvas extends Canvas{
	
	//Attributes
	RenderGameObjectVisitor visitor = new RenderGameObjectVisitor();
	/* TODO: Store all of your GameObjects (Using GameObjectContainers) here */
	
	/**
	 * Default Constructor
	 */
	public GameCanvas() {
		/*
		 * Optional (but makes your life easier)
		 * 
		 * Set up KMBuffer as the event "listener"
		 * (You can remove this line if you prefer to handle your own events)
		 * 
		 */
		setUpEventListeners();
		/*
		 * End Optional
		 */
	}
	
	/* TODO: Set your GameObjects and redrawCanvas() */
	
	/**
	 * Method used to redraw the canvas whenever called
	 */
	public void redrawCanvas(){
		/* TODO: Get GraphicsContext */
		/* TODO: Set Visitor's GraphicsContext */
		/* TODO: Iterate through ALL GameObjects (Using GameObjectContainers) */
			/* TODO: Get EACH GameObject to accept() the Visitor */
	}
	
	/**
	 * Method to set that the KMBuffer is responsible for handling key and mouse events
	 * (Use the KMBuffer's static methods in your GamePane to check for key and mouse events)
	 */
	private void setUpEventListeners() {
		/*--------------------------------------------------------------------
		 * 
		 * Event Handler Code
		 * 
		 * Code to set up the Keyboard and Mouse Events to be handled by the 
		 * provided KMBuffer in the util package
		 * 
		 * Note: If you want to, you can remove this code and handle events
		 * 		 yourself either in this Canvas or in your GamePane
		 * 
		 *--------------------------------------------------------------------*/
		/*
		 * Set the event listeners to handle the key press and release events in the KMBuffer
		 */
		this.setOnKeyPressed((event)    -> { KMBuffer.handleKeyPressed(event);    });
		this.setOnKeyReleased((event)   -> { KMBuffer.handleKeyReleased(event);   });
		
		/*
		 * Set the event listeners to handle the mouse events in the KMBuffer
		 */
		this.setOnMouseMoved((event)    -> { KMBuffer.handleMouseMoved(event);    });		
		this.setOnMousePressed((event)  -> { KMBuffer.handleMousePressed(event);  });
		this.setOnMouseReleased((event) -> { KMBuffer.handleMouseReleased(event); });
		this.setOnMouseDragged((event)  -> { KMBuffer.handleMouseDragged(event);  });
		this.setOnMouseEntered((event)  -> { KMBuffer.handleMouseEntered(event);  });
		this.setOnMouseExited((event)   -> { KMBuffer.handleMouseExited(event);   });
		//this.setOnMouseClicked(event -> {}); //You need to add an event handler to deal with this event in this Class
		
		/*--------------------------------------------------------------------
		 * 
		 * End of Event Handler Code
		 * 
		 *--------------------------------------------------------------------*/
	}
}
