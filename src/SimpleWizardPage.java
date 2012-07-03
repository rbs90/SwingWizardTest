import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: rbs
 * Date: 03.07.12
 * Time: 00:18
 * To change this template use File | Settings | File Templates.
 */
public class SimpleWizardPage {

    private String title;
    private JComponent content;

    public SimpleWizardPage(String title, JComponent content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public JComponent getContent() {
        return content;
    }
}
