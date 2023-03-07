
package pkg08_lecture;

import java.awt.Frame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.List;
import java.awt.Choice;
import java.awt.Dialog;


public class MyFirstPage extends Frame implements ActionListener, ItemListener {
    
    // Step 1: 'extends Frame' and import the 'java.awt.Frame' library
    /*  
        Step 2: Create Constructor in Frame Class
            setVisible(true); = so the Frame is visible
			setSize(w, h);
			setTitle("My First Page "); 
			setLocation(w, h)
				by default, will appear on the top left
			setLocationRelativetTo(null); center frame
                        setLayout(new FlowLayout());
                        setVisible(true);
    
    Step 3: Instantiate the MyFirstPage object in the main class
        MyFirstPage firstPage = new MyFirstPage();


    */

    /*
         * Add Action Listener (implements and import)
            extends Frame implements ActionListener 
     */
    
    private Label label_welcome = new Label("Welcome");
        /*
            * Add Label
                * Define/instantiate the object above the constructor; accessible only in this class;
                * private Label label_welcome = new Label("Welcome");
                * doesn't appear as we only define but haven't added to the frame
                * Then add "add(label_welcome)" to the constructor
         */

    private TextField tfInput = new TextField();
        //same thing, create instance then add to constructor;

    private TextArea textAreaInput = new TextArea("hello", 3, 30);

    private Button exitButton = new Button("Exit");
    private Button bClick = new Button("Click");

    private List list = new List(2, true);

    private Choice choice = new Choice();

    private Dialog dialog = new Dialog(this, "", true);

    public MyFirstPage(){
        //add label
        add(label_welcome);

        //add textfield

        add(tfInput);
        tfInput.setEditable(false);

        //add text area
        add(textAreaInput);

        //add button
        add(exitButton);
        add(bClick);

        exitButton.addActionListener(this);
        bClick.addActionListener(this);

        //add list items
        list.add("Apple");
        list.add("Kiwi");

        //add list
        add(list);

        //add choice items
        choice.add("Red");
        choice.add("Blue");

        //add choice
        add(choice);

        //dialog
            //set size
            dialog.setSize(100,100);
            dialog.setLocationRelativeTo(bClick);
        
        //set attributes of the frame
        setSize(300, 300);
	    setLocationRelativeTo(null); //center frame
	    setTitle("My First Page");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == exitButton) {
            System.exit(0);
        }else if(e.getSource() == bClick) {
            dialog.show();
        }
    } 

    //public void 
}


