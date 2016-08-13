package it.grab.grabbit.grabbit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;


public class Product {
    private String barcode = null;
    private boolean isVegan;
    private boolean isNotTested;
    private Bitmap image;
    private String name;
    private String company;
    private int status;

    public Product(){
        barcode = "1111111";
        status = 1;

        this.name = "שם מוצר";
        this.company = "שם החברה";
        String encodedImage = "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";
        image = getBitmapFromString(encodedImage);
    }

    public Product(String barcode){
        this();
        this.barcode = barcode;
        this.name = "אופיר";
        this.image = null;

    }

    private Bitmap getBitmapFromString(String encImg){

        byte[] decodedString = Base64.decode(encImg, Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        return decodedByte;
    }

    public String getBarcode() {
        return barcode;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public boolean isNotTested() {
        return isNotTested;
    }

    public Bitmap getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getStatus() {
        return status;
    }
}
