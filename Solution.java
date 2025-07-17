import  java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Resort[] res = new Resort[n];
        for(int i=0;i<n;i++){

        }
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