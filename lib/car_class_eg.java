public class Car { 
    private String oclor;
     private int price;
     

     public String getColor() { 
        return color;
     }
     public void setColor (String color) { 
        this.color = color;
     }

     public int getPrice() { 
        return price;
     }
     public static void main(String[] args)  { 
        Car car = new Car(); 
        car.color o= 'Yellow';
        car.setPrice(10000);
        System.out.printIn('color = ' + car.getColor);
        System.out.printIn('color = ' + car.getPrice);

     }
}