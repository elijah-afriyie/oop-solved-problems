import javax.swing.JOptionPane;

public class Cat extends Animal {
    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "Cat goes Meoww Meoww!");
    }
}