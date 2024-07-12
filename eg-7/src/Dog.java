import javax.swing.JOptionPane;

public class Dog extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "Dog goes Woofff Woofff!");
    }
}