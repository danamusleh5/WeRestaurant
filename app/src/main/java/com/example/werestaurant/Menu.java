package com.example.werestaurant;

class Menu {
    private String name;
    private int imageID;

    public static final com.example.werestaurant.Menu[] menus = {
            new Menu("Drinks", R.drawable.drinks),
            new Menu("Dishes", R.drawable.dishes),
            new Menu("Sweets", R.drawable.sweets),

    };
    private Menu(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }
//    @Override
//    public String toString() {
//        return "Menu{" +
//                "name='" + name + '\'' +
//                ", imageID=" + imageID +
//                '}';
//    }
}

