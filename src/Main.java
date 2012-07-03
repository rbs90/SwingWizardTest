import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: rbs
 * Date: 03.07.12
 * Time: 00:31
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        SwingWizard swingWizard = new SwingWizard();
        swingWizard.addPage(new SimpleWizardPage("Seite 1", new JLabel("Inhalt 1")));
        swingWizard.addPage(new SimpleWizardPage("Seite 2", new JLabel("Inhalt 2")));
        swingWizard.addPage(new SimpleWizardPage("Seite 3", new JLabel("Inhalt 3")));
        swingWizard.addPage(new SimpleWizardPage("Seite 4", new JLabel("Inhalt 4")));
        swingWizard.addPage(new SimpleWizardPage("Seite 5", new JLabel("Inhalt 5")));

        swingWizard.showWizard();

    }
}
