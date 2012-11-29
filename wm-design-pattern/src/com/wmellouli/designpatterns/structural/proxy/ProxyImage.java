package com.wmellouli.designpatterns.structural.proxy;

//on System B 
public class ProxyImage implements Image {
 
    private RealImage image = null;
    private String filename = null;
    /**
     * Constructor
     * @param FILENAME
     */
    public ProxyImage(final String FILENAME) { 
        filename = FILENAME; 
    }
 
    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }
 
}
