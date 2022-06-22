import java.util.*;

public class bmi {
    public static void main(String[] args)
    {
                System.out.println("Code to check if ur fat - Ali Rad");
                System.out.println("====================================");
                Scanner s = new Scanner(System.in);
                System.out.println("Type '1' for the Metric System");
                System.out.println("Enter '2' for the Imperial System");
                int choice = s.nextInt();
                double weight = 0;
                double height = 0;
                switch(choice)
        {
        case 1:
        {
            System.out.print("Enter your height (Meters) - ");
            height = s.nextDouble();
            System.out.print("Enter your weight (Kg) - ");
            weight = s.nextDouble();
            break;
        }
        case 2:
        {
            System.out.print("Enter your height (Feet) - ");
            double feet = s.nextDouble();
            System.out.print("Enter your height (Inches) - ");
            double inches = s.nextDouble();
            inches = inches+(feet * 12);
            height = inches * 0.0254;
            // 1 inch = 0.0254 meters
            System.out.print("Enter your weight (Pounds) - ");
            double pound = s.nextDouble();
            weight = (pound * 0.45359);
            // 1 pound is equal to .45359 kg
            break;
        }
        default:
        {
            System.out.println("Stupid. I said type 1 or 2 bruh");
            break;

        }
    }
    if (height > 0.0 && weight > 0.0)
        System.out.println("====================================");
        double bmi = weight / (height*height);
        System.out.printf("BMI Value: %.3f\n", bmi);
        if (bmi <= 18.5)
            System.out.println("eat more");
        if (bmi <= 24.9 && bmi >= 18.5)
            System.out.println("Ur average");
        if (bmi <= 29.9 && bmi >= 25.0)
            System.out.println("Ur fat");
        if (bmi >= 30.0)
            System.out.println("ur an obese monkey");
        System.out.println("====================================");
    }
}
