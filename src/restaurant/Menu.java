package restaurant;

import java.util.Date;

public class Menu {

    private MenuItem[] menuItems;

    private Date lastUpdated;


    public Menu(MenuItem[] menuItems, Date lastUpdated) {

        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(MenuItem[] aMenuItems) {
        this.menuItems = aMenuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date aLastUpdated) {
        this.lastUpdated = aLastUpdated;
    }
}
