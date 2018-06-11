package com.priyanka.myapplication;

/**
 * Created by pritz on 20/1/18.
 */

public class gtr {
    private String Name;
    private String Homeaddress;
    private String Price;
    private String ProducePic;
    public void gtr(String Name,String Homeaddress,String Price,String ProducePic)
    {
        this.Name=Name;
        this.Homeaddress=Homeaddress;
        this.ProducePic=ProducePic;
        this.Price=Price;
    }

    public String getName() {
        return Name;
    }

    public String getHomeaddress() {
        return Homeaddress;
    }

    public String getPrice() {
        return Price;
    }

    public String getProducePic() {
        return ProducePic;
    }

    public void setProducePic(String producePic) {
        ProducePic = producePic;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setHomeaddress(String Homeaddress)
    {
        this.Homeaddress=Homeaddress;
    }
     public void setPrice(String Price)
    {
        this.Price=Price;
    }
}
