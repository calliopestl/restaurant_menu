package restaurant;


public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew;



    public MenuItem(double price, String description, String category, boolean isNew) {

        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;


    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }
    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean aIsNew) {
        this.isNew  = aIsNew;
    }

}
