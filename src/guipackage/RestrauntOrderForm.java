package guipackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;

public class RestrauntOrderForm extends JFrame implements ActionListener {
  
  public JButton OrderButton;
  
  public RestrauntOrderForm() {
    
    Color brown = new Color(70, 0, 25);
    Color yellow = new Color(255, 255, 0);
    
    Color[] colors = {brown, brown, brown, Color.red, yellow};
    String[] foodList = {"Cheese Burgers", "Chicken Nuggets", "Chicken Tenders", "Hot Dogs", "Fries"};
    
    JComboBox menu = new JComboBox(foodList);
    ComboBoxRenderer renderer = new ComboBoxRenderer(menu);
    menu.setRenderer(renderer);
    renderer.setColors(colors);
    renderer.setStrings(foodList);
    
    JButton OrderButton = new JButton("Order");
    
    FlowLayout flo = new FlowLayout();
    
    setTitle("Order Form");
    setLayout(flo);
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLookAndFeel();
    add(menu);
    add(OrderButton);
    
  }
  
  public static void main(String[] args) {
    RestrauntOrderForm frame = new RestrauntOrderForm();
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent evt) {
    // TODO(winston): action 
  }
  
  public void setLookAndFeel() {
    try {
      UIManager.setLookAndFeel("com.sun.javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (Exception exc) {
      //do nothing
    }
  }
  
  class ComboBoxRenderer extends JPanel implements ListCellRenderer
  {

      private static final long serialVersionUID = -1L;
      private Color[] colors;
      private String[] strings;

      JPanel textPanel;
      JLabel text;

      public ComboBoxRenderer(JComboBox combo) {

          textPanel = new JPanel();
          textPanel.add(this);
          text = new JLabel();
          text.setOpaque(true);
          text.setFont(combo.getFont());
          textPanel.add(text);
      }

      public void setColors(Color[] col)
      {
          colors = col;
      }

      public void setStrings(String[] str)
      {
          strings = str;
      }

      public Color[] getColors()
      {
          return colors;
      }

      public String[] getStrings()
      {
          return strings;
      }

      @Override
      public Component getListCellRendererComponent(JList list, Object value,
              int index, boolean isSelected, boolean cellHasFocus) {

          if (isSelected)
          {
              setBackground(list.getSelectionBackground());
          }
          else
          {
              setBackground(Color.WHITE);
          }

          if (colors.length != strings.length)
          {
              System.out.println("colors.length does not equal strings.length");
              return this;
          }
          else if (colors == null)
          {
              System.out.println("use setColors first.");
              return this;
          }
          else if (strings == null)
          {
              System.out.println("use setStrings first.");
              return this;
          }

          text.setBackground(getBackground());

          text.setText(value.toString());
          if (index>-1) {
              text.setForeground(colors[index]);
          }
          return text;
      }
  }
}
