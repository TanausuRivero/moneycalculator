package UI.Swing;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DialogPanel extends JPanel {

    public JTextArea area;

    public DialogPanel() {
        createTools();
    }

    private void createTools() {
        add(createTextArea());
    }

    private JComponent createTextArea() {
        area = new JTextArea(1, 20);
        area.setLineWrap(true);
        area.setEditable(false);
        return area;
    }

    public JTextArea getArea(){
        return this.area;
    }
}