import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: rbs
 * Date: 03.07.12
 * Time: 00:17
 * To change this template use File | Settings | File Templates.
 */
public class SwingWizard extends JFrame{

    private ArrayList<SimpleWizardPage> pages = new ArrayList<SimpleWizardPage>();
    private int currentPage = 0;
    private JLabel title = new JLabel();
    private JComponent content = new JPanel();
    private final JButton back;
    private final JButton next;


    public SwingWizard() {
        back = new JButton("Zurück");
        next = new JButton("Weiter");
    }

    public void addPage(SimpleWizardPage page){
        pages.add(page);
    }
    
    public void showWizard(){

        setSize(new Dimension(500, 500));
        setLayout(new BorderLayout());

        /* BOTTOM */
        JPanel buttonPanel = new JPanel();
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentPage++;
                setIDContent();
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentPage--;
                setIDContent();
            }
        });
        JButton exit = new JButton("Beenden");

        buttonPanel.add(back);
        buttonPanel.add(next);
        buttonPanel.add(exit);
        add(buttonPanel, BorderLayout.SOUTH);

        /* TOP */
        SimpleWizardPage wizardPage = pages.get(currentPage);
        add(title, BorderLayout.NORTH);

        /* CENTER */
        add(content, BorderLayout.CENTER);
        
        setIDContent();

        setVisible(true);
    }
    
    private void setIDContent(){
        remove(content);
        content = pages.get(currentPage).getContent();
        add(content); //TODO: best solution??
        title.setText(pages.get(currentPage).getTitle());
        
        if(currentPage == 0)
            back.setEnabled(false);
        else
            back.setEnabled(true);
        
        if(currentPage == pages.size() - 1)
            next.setEnabled(false);
        else
            next.setEnabled(true);

    }
}
