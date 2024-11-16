package InterviewQuestions;

import jdk.jfr.Category;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupProductAndCalculateStock {

    private String name;
    private String category;
    private int stockCount;

    public GroupProductAndCalculateStock(String name, String category, int stockCount) {
        this.name = name;
        this.category = category;
        this.stockCount = stockCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }


    @Override
    public String toString() {
        return "GroupProductAndCalculateStock{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", stockCount=" + stockCount +
                '}';
    }

    public static void main(String[] args) {

        List<GroupProductAndCalculateStock> list = Arrays.asList(
                new GroupProductAndCalculateStock("Laptops","Electronics",50),
                new GroupProductAndCalculateStock("Smartphone","Electronics",100),
                new GroupProductAndCalculateStock("Tv","Electronics",30),
                new GroupProductAndCalculateStock("Shampoo","Personal Care",200),
                new GroupProductAndCalculateStock("Conditioner","Personal Care",180),
                new GroupProductAndCalculateStock("Bread","Groceries",500),
                new GroupProductAndCalculateStock("Bread","Groceries",500)

        );


        Map<String, Integer> result = list.stream()
                .collect(Collectors.groupingBy(GroupProductAndCalculateStock::getCategory, Collectors.summingInt(GroupProductAndCalculateStock::getStockCount)));
        result.forEach((x,y) ->
                        System.out.println("Category: "+x+ " Available Stock:"+y)
                );

    }
}
