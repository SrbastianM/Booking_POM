package models;

public class Hotel {

    private String name;
    private String image;
    private String price;



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    public Hotel(String name, String price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }


    @Override
    public String toString() {
        return "Hotel: " + name + "\nImagen: " + image + "\nPrecio: " + price + "\n";
    }
}
