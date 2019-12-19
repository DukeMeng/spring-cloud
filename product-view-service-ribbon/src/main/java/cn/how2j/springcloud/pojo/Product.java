package cn.how2j.springcloud.pojo;

/**
 * @FileName Product
 * @Author Xiang
 * @Date 2019-12-17 15:30
 * @Description
 * @since 1.0.0
 */
public class Product {

    private int id;

    private String name;

    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
