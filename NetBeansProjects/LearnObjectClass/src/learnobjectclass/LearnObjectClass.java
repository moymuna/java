
package learnobjectclass;

import learnobjectclass.geometry.Circle;
import learnobjectclass.geometry.rectAngle;


public class LearnObjectClass {

    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.radius=15;
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        
        Circle circle1=new Circle();
        circle.radius=4;
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        
       rectAngle area=new rectAngle();
       area.hight=5;
       area.width=6;
        System.out.println(area.getArea());
        System.out.println(area.getPerimeter());
       
        
        
    }
    
}
