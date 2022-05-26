import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) throws Exception {
        int[] hNum = new int[4];
        double[] size = new double[4];
        float[] price = new float[4];
        int k=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter house number, size, and price for 4 houses: ");


        for (int i = 0; i < hNum.length; i++) {
            hNum[i]= scan.nextInt();
            size[i]= scan.nextDouble();
            price[i]= scan.nextFloat();
         }
         System.out.println("Enter the price range: ");
         int y = scan.nextInt();
         int z = scan.nextInt();

         
         if (y<price[0] && z>price[0]) {
            System.out.println("House:  "+"Size:  "+ "Price:  ");
            System.out.println(hNum[0]+"  "+size[0]+"  "+price[0]+"  ");
            k=k+1;
         }
         if (y<price[1] && z>price[1]) {
            System.out.println("House:  "+"Size:  "+ "Price:  ");
            System.out.println(hNum[1]+"  "+size[1]+"  "+price[1]+"  ");
            k=k+1;
         }
         if (y<price[2] && z>price[2]) {
            System.out.println("House:  "+"Size:  "+ "Price:  ");
            System.out.println(hNum[2]+"  "+size[2]+"  "+price[2]+"  ");
            k=k+1;
         }
         if (y<price[3] && z>price[3]) {
            System.out.println("House:  "+"Size:  "+ "Price:  ");
            System.out.println(hNum[3]+"  "+size[3]+"  "+price[3]+"  ");
            k=k+1;
         }
         System.out.println("The number of house's found is: "+k);
         
        }
    }

