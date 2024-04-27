package Proxy;

public class RealImage implements Image{

    private String imgName;

    public RealImage(String imgName) {
        this.imgName = imgName;
        load(imgName);
    }

    @Override
    public void display() {
        System.out.println("display " + imgName);
    }
    public void load(String imgName){
        System.out.println("load "+ imgName);
    }
}
