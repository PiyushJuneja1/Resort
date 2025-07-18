package Resort;
import  java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of resorts");
        int n = sc.nextInt();
        Resort[] res = new Resort[n];
        System.out.println("Enter all details");
        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            sc.nextLine();
            res[i]= new Resort(id,name,category,price,rating);
        }
        // for(Resort i : res){
        //     System.out.println(i.getResortId());
        //     System.out.println(i.getResortName());
        //     System.out.println(i.getCategory());
        //     System.out.println(i.getPrice());
        //     System.out.println(i.getRating());
        // }
        System.out.print("Enter Category for which you want to calculate average whoese rating is greater than 4: ");
        String type = sc.nextLine();
        System.out.println(avgPriceByCategory(res, type));
        sc.close();
    }
    public static double avgPriceByCategory(Resort[] res, String type){
        double avg=0;
        double count=0;
        double sum=0;
        for(Resort i: res){
            if(i.getCategory().equalsIgnoreCase(type) && i.getRating()>4){
                sum+=i.getPrice();
                count++;
            }
        }
        if(count>0)
            avg = sum/count;
        return avg;
        }
}
class Resort{

    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId,String resortName, String category, double price, double rating){
        this.resortId=resortId;
        this.resortName=resortName;
        this.category=category;
        this.price=price;
        this.rating=rating;
    }

    public void setResortId(int resortId){
        this.resortId = resortId;
    }
    public int getResortId(){
        return resortId;
    }
    public void setResortName(String resortName){
        this.resortName=resortName;
    }
    public String getResortName(){
        return resortName;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setRating(double rating){
        this.rating=rating;
    }
    public double getRating(){
        return rating;
    }
}