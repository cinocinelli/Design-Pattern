package Proxy;

public class Main {
    public static void main(String[] args) {
//        通过代理类使图片只加载一次
        Image proxyImage = new ProxyImage("img.jpg");
        proxyImage.display();
        System.out.println(" ");
        proxyImage.display();
    }

}
