import javax.swing.*;


public class Main{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Kasir kasirProgram = new Kasir();
            kasirProgram.setVisible(true);
        });
    }
}
