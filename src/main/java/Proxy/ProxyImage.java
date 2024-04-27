package Proxy;

public class ProxyImage implements Image{
    private String imgName;
    private RealImage realImage;

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imgName);
        }
        realImage.display();
    }

    public ProxyImage(String imgName) {
        this.imgName = imgName;
    }
}
