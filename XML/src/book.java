package XML.src;

import java.math.BigDecimal;

/**
 * @author cc
 * @date 2022年08月18日 15:28
 */
public class book {
    private String sn;
    private String name;
    private BigDecimal price;
    private String author;

    public book(String sn, String name, String s, String author) {
    }

    public book(String sn, String name, BigDecimal price, String author) {
        this.sn = sn;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
