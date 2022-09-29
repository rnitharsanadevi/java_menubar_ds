package menubar;

import javax.swing.*;

public class Administration
{
    static JMenu admin;

    public void administration(JMenuBar menuBar)
    {
        //Administration menu
        admin=new JMenu("Administration");

        menuBar.add(admin);
    }

    //User Admin
    public void userAdmin()
    {

        JMenu uAdmin=new JMenu("User Admin");
        JMenuItem createUser=new JMenuItem("Create User");
        JMenuItem editUser=new JMenuItem("Edit User");

        admin.add(uAdmin);
        uAdmin.add(createUser);
        uAdmin.add(editUser);

    }

    //Product Admin
    public void productAdmin()
    {
        JMenu pAdmin=new JMenu("Product Admin");
        JMenu allProducts=new JMenu("All Products");
        JMenuItem myProducts=new JMenuItem("My Products");
        JMenuItem createProduct=new JMenuItem("Create Product");

        admin.add(pAdmin);
        pAdmin.add(allProducts);
        allProducts.add(myProducts);
        pAdmin.add(createProduct);
    }

    //Order Admin
    public void orderAdmin()
    {
        JMenu oAdmin=new JMenu("Order Admin");
        JMenu orderReports=new JMenu("Order Reports");
        JMenu auditReports=new JMenu("Audit Reports");
        JMenuItem updatedOrders=new JMenuItem("Updated Orders");
        JMenuItem createdOrders=new JMenuItem("Created Orders");
        JMenuItem createOrder=new JMenuItem("Create order");

        admin.add(oAdmin);
        oAdmin.add(orderReports);
        orderReports.add(auditReports);
        auditReports.add(updatedOrders);
        auditReports.add(createdOrders);
        oAdmin.add(createOrder);
    }


}
