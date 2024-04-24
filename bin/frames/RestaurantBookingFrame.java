package bin.frames;
import bin.classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantBookingFrame {
   

    private JFrame frame;
    private JPanel panel;
    private JComboBox<String> restaurantComboBox;
    private JTextField nameTextField;
    private JTextField dateTextField;
    private JButton bookButton;
    private ImageIcon resturantBackground;
    private JLabel imgLabel;

    public RestaurantBookingFrame()
     {
        

        frame = new JFrame();
        frame.setTitle("Flavour&Explore");
        frame.setSize(800, 600); // Adjust size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null); // Using null layout
        

        String[] restaurants = {"Chef’s Table Courtside", "The Green Lounge", "The Atrium Restaurant"};
        restaurantComboBox = new JComboBox<>(restaurants);
        restaurantComboBox.setBounds(300, 100, 200, 30); // Set bounds manually
        panel.add(restaurantComboBox);

        panel.add(new JLabel("Select Restaurant:")).setBounds(100, 100, 200, 30);
        

        panel.add(new JLabel("Your Name:")).setBounds(100, 200, 200, 30);
        nameTextField = new JTextField();
        nameTextField.setBounds(300, 200, 200, 30);
        panel.add(nameTextField);

        panel.add(new JLabel("Date (MM/DD/YYYY):")).setBounds(100, 300, 200, 30);
        dateTextField = new JTextField();
        dateTextField.setBounds(300, 300, 200, 30);
        panel.add(dateTextField);

        bookButton = new JButton("Book Reservation");
        bookButton.setBounds(300, 400, 150, 30);
        panel.add(bookButton);

        



        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserved();
                backToHomePage();
                
            }
        });

        resturantBackground = new ImageIcon("resturant.jpg");
        JLabel resturantBackgroundLabel = new JLabel(resturantBackground);
        resturantBackgroundLabel.setBounds(0,0,800,600);
        panel.add(resturantBackgroundLabel); 


        frame.add(panel);

        frame.setVisible(true);
    }

    public void reserved()
    {
        String restaurant = (String) restaurantComboBox.getSelectedItem();
                String name = nameTextField.getText();
                String date = dateTextField.getText();

                // You can add further processing, like storing the booking details,
                // displaying a confirmation message, etc.
                JOptionPane.showMessageDialog(frame,
                        "Reservation booked:\nRestaurant: " + restaurant + "\nName: " + name + "\nDate: " + date,
                        "Reservation Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }

    public void backToHomePage()
    {
        frame.setVisible(false);
    }
    
}
