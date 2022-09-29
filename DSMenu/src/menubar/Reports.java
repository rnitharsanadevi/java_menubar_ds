package menubar;

import javax.swing.*;

public class Reports
{
    static JMenu reports;

    public void reports(JMenuBar menuBar)
    {
        //Administration menu
        reports=new JMenu("Reports");

        menuBar.add(reports);
    }

    public void wintechReports()
    {
        JMenuItem winTech=new JMenuItem("Win Tech Report");
        reports.add(winTech);
    }

    public void microsoftReports()
    {
        JMenuItem microsoft=new JMenuItem("Microsoft Report");
        reports.add(microsoft);
    }


}
