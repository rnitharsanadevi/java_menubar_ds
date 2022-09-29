package menubar;

import javax.swing.*;

public class AdminReportsRunner
{
    public static void main(String args[])
    {
        JFrame frame= new JFrame("Derivco Sports - Administration and Reports");

        JMenuBar menuBar=new JMenuBar();

        frame.setJMenuBar(menuBar);
        frame.setSize(500,500);
        frame.setVisible(true);

        Administration ad = new Administration();
        ad.administration(menuBar);
        ad.userAdmin();
        ad.productAdmin();
        ad.orderAdmin();


        Reports rep = new Reports();
        rep.reports(menuBar);
        rep.wintechReports();
        rep.microsoftReports();

    }
}
