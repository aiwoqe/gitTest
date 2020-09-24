package cn.hengzhi.entity;

/**
 * @ Author     ：MI
 * @ Date       ：Created in 23:51 2019/9/26
 * @ Description：实体类
 */
public class Account {
    private Integer id;
    private String name;
    private double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
